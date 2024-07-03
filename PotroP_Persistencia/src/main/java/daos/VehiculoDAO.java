/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IVehiculoDAO;
import com.mongodb.client.MongoCollection;
import conexion.ConexionBD;
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
        this.vehiculoCollection = ConexionBD.getInstance().getDatabase().getCollection("Vehiculo");
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

            if (vehiculo instanceof VehiculoEntregado) {
                VehiculoEntregado ve = (VehiculoEntregado) vehiculo;
                doc.append("carroceria", ve.getCarroceria())
                   .append("combustible", ve.getCombustible())
                   .append("estadoVehiculo", ve.getEstadoVehiculo())
                   .append("llantas", ve.getLlantas())
                   .append("tipoVehiculo", "entregado");
            } else if (vehiculo instanceof VehiculoDevuelto) {
                VehiculoDevuelto vd = (VehiculoDevuelto) vehiculo;
                doc.append("carroceria", vd.getCarroceria())
                   .append("combustible", vd.getCombustible())
                   .append("estadoVehiculo", vd.getEstadoVehiculo())
                   .append("llantas", vd.getLlantas())                  
                   .append("tipoVehiculo", "devuelto");
            } else {
                doc.append("tipoVehiculo", "normal");
            }

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

    private Vehiculo convertirDocumentoAVehiculo(Document doc) {
        String tipoVehiculo = doc.getString("tipoVehiculo");
        switch (tipoVehiculo) {
            case "entregado":
                return new VehiculoEntregado(
                    doc.getObjectId("_id").toHexString(),
                    doc.getInteger("numVehiculo"),
                    doc.getString("marca"),
                    doc.getString("modelo"),
                    doc.getInteger("año"),
                    doc.getString("tipo"),
                    doc.getString("placa"),
                    doc.getString("capacidad"),
                    doc.getString("carroceria"),
                    doc.getInteger("combustible"),
                    doc.getString("estadoVehiculo"),
                    doc.getString("llantas")
                );
            case "devuelto":
                return new VehiculoDevuelto(
                    doc.getObjectId("_id").toHexString(),
                    doc.getInteger("numVehiculo"),
                    doc.getString("marca"),
                    doc.getString("modelo"),
                    doc.getInteger("año"),
                    doc.getString("tipo"),
                    doc.getString("placa"),
                    doc.getString("capacidad"),
                    doc.getString("carroceria"),
                    doc.getInteger("combustible"),
                    doc.getString("estadoVehiculo"),
                    doc.getString("llantas"),
                    doc.getInteger("kilometrosRecorridos"),
                    doc.getString("observaciones")
                );
            default:
                return new Vehiculo(
                    doc.getObjectId("_id").toHexString(),
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

}