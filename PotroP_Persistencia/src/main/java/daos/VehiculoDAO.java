 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IVehiculoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.ConexionBDM;
import entidades.Prestamo;
import entidades.PrestamoMaestros;
import entidades.Traslado;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.time.LocalDate;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO implements IVehiculoDAO {

    /**
     * Colección de MongoDB para almacenar documentos de Vehiculo.
     */
    private final MongoCollection<Document> vehiculoCollection;
    private final MongoCollection<Prestamo> prestamoCollection;
    private final MongoCollection<PrestamoMaestros> prestamoMaestrosCollection;
    private final MongoCollection<Traslado> trasladoCollection;

    
     /**
     * Constructor que inicializa la colección de Vehiculo utilizando la instancia de conexión a la base de datos.
     */
    public VehiculoDAO() {
        this.vehiculoCollection = ConexionBDM.getInstance().getDatabase().getCollection("Vehiculo");
    this.prestamoCollection = ConexionBDM.getInstance().getDatabase().getCollection("Prestamos", Prestamo.class);
        this.prestamoMaestrosCollection = ConexionBDM.getInstance().getDatabase().getCollection("PrestamosMaestros", PrestamoMaestros.class);
        this.trasladoCollection = ConexionBDM.getInstance().getDatabase().getCollection("Traslado", Traslado.class);
    }
    
    
    /**
     * Agrega un nuevo vehículo a la base de datos.
     * 
     * @param vehiculo el objeto Vehiculo a agregar.
     * @throws DAOException si ocurre un error al ingresar el vehículo.
     */
    @Override
    public void agregar(Vehiculo vehiculo) throws DAOException {
        try {
            Document doc = new Document("_id", new ObjectId())
                .append("numVehiculo", vehiculo.getNumVehiculo())
                .append("marca", vehiculo.getMarca())
                .append("modelo", vehiculo.getModelo())
                .append("año", vehiculo.getAño())
                .append("tipo", vehiculo.getTipo())
                .append("placa", vehiculo.getPlaca())
                .append("capacidad", vehiculo.getCapacidad());

            vehiculoCollection.insertOne(doc);
        } catch (Exception e) {
            throw new DAOException("Error al ingresar vehiculo: " + e.getMessage(), e);
        }
    }

    
     /**
     * Obtiene todos los vehículos almacenados en la base de datos.
     * 
     * @return una lista de objetos Vehiculo.
     * @throws DAOException si ocurre un error al obtener todos los vehículos.
     */
    @Override
    public List<Vehiculo> obtenerTodos() throws DAOException {
        try {
            List<Vehiculo> vehiculos = new ArrayList<>();
            for (Document doc : vehiculoCollection.find()) {
                vehiculos.add(convertirDocumentoAVehiculo(doc));
            }
            return vehiculos;
        } catch (Exception e) {
            throw new DAOException("Error al obtener todos los vehiculos: " + e.getMessage(), e);
        }
    }

    
    
    /**
     * Busca un vehículo por su placa en la base de datos.
     * 
     * @param placa la placa del vehículo a buscar.
     * @return el objeto Vehiculo encontrado, o null si no se encuentra.
     * @throws DAOException si ocurre un error al buscar el vehículo por placa.
     */
    public Vehiculo buscarPorPlaca(String placa) throws DAOException {
        try {
            Document doc = vehiculoCollection.find(Filters.eq("placa", placa)).first();
            if (doc == null) {
                return null;
            }
            return convertirDocumentoAVehiculo(doc);
        } catch (Exception e) {
            throw new DAOException("Error al buscar vehículo por placa: " + e.getMessage(), e);
        }
    }

    
     /**
     * Convierte un documento MongoDB a un objeto Vehiculo.
     * 
     * @param doc el documento MongoDB que representa un Vehiculo.
     * @return el objeto Vehiculo convertido.
     */
    private Vehiculo convertirDocumentoAVehiculo(Document doc) {
        return new Vehiculo(
            doc.getObjectId("_id"),
            doc.getInteger("numVehiculo"),
            doc.getString("marca"),
            doc.getString("modelo"),
            doc.getInteger("año"),
            doc.getString("tipo"),
            doc.getString("placa"),
            doc.getString("capacidad")
        );
    }
    
    @Override
     public boolean isVehiculoPrestado(String placa) throws DAOException {
        try {
            // Verificar en la colección de Prestamo
            long prestamoCount = prestamoCollection.countDocuments(Filters.eq("placaVehiculo", placa));

            // Verificar en la colección de PrestamoMaestros
            long prestamoMaestrosCount = prestamoMaestrosCollection.countDocuments(Filters.eq("vehiculo.placa", placa));

            // Verificar en la colección de Traslado
            long trasladoCount = trasladoCollection.countDocuments(Filters.eq("vehiculo.placa", placa));

            // El vehículo está prestado si se encuentra en alguna de las colecciones
            return (prestamoCount > 0 || prestamoMaestrosCount > 0 || trasladoCount > 0);
        } catch (Exception e) {
            throw new DAOException("Error al verificar si el vehículo está prestado: " + e.getMessage(), e);
        }
    }
}