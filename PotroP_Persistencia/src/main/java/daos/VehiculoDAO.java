 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IVehiculoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.ConexionBDM;
import entidades.Vehiculo;
import entidades.VehiculoEntregado;
import entidades.VehiculoDevuelto;
import excepciones.DAOException;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO implements IVehiculoDAO {

    private final MongoCollection<Document> vehiculoCollection;

    public VehiculoDAO() {
        this.vehiculoCollection = ConexionBDM.getInstance().getDatabase().getCollection("Vehiculo");
    }

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
}