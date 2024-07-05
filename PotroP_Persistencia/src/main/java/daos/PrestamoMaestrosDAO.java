/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IPrestamoMaestrosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBDM;
import entidades.PrestamoMaestros;
import entidades.Vehiculo;
import excepciones.DAOException;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class PrestamoMaestrosDAO implements IPrestamoMaestrosDAO {
     private final MongoCollection<PrestamoMaestros> prestamoMaestrosCollection;
    private final VehiculoDAO vehiculoDAO;

    public PrestamoMaestrosDAO() {
        this.prestamoMaestrosCollection = ConexionBDM.getInstance().getDatabase().getCollection("PrestamosMaestros", PrestamoMaestros.class);
        this.vehiculoDAO = new VehiculoDAO();
    }

    /**
     * Método para agregar un nuevo préstamo de maestros a la base de datos.
     *
     * @param prestamoMaestros el objeto PrestamoMaestros a agregar.
     * @throws DAOException si ocurre un error al agregar el préstamo.
     */
    @Override
    public void agregar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            // Buscar el vehículo por placa
            Vehiculo vehiculo = vehiculoDAO.buscarPorPlaca(prestamoMaestros.getVehiculo().getPlaca());
            if (vehiculo == null) {
                throw new DAOException("No se encontró el vehículo con la placa especificada.");
            }

            // Asociar el vehículo completo al préstamo
            prestamoMaestros.setVehiculo(vehiculo);

            // Insertar el préstamo en la base de datos
            prestamoMaestrosCollection.insertOne(prestamoMaestros);
        } catch (Exception e) {
            throw new DAOException("Error al agregar el préstamo de maestros: " + e.getMessage(), e);
        }
    }

    /**
     * Método para buscar un préstamo de maestros por su ID.
     *
     * @param id el ID del préstamo a buscar.
     * @return el objeto PrestamoMaestros encontrado, o null si no se encuentra.
     * @throws DAOException si ocurre un error al buscar el préstamo.
     */
    @Override
    public PrestamoMaestros buscarPorId(String id) throws DAOException {
        try {
            ObjectId objectId = new ObjectId(id);
            return prestamoMaestrosCollection.find(Filters.eq("_id", objectId)).first();
        } catch (Exception e) {
            throw new DAOException("Error al buscar el préstamo de maestros por ID: " + e.getMessage(), e);
        }
    }

    /**
     * Método para obtener una lista de todos los préstamos de maestros.
     *
     * @return una lista de objetos PrestamoMaestros.
     * @throws DAOException si ocurre un error al obtener la lista de préstamos.
     */
    @Override
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException {
        try {
            return prestamoMaestrosCollection.find().into(new ArrayList<>());
        } catch (Exception e) {
            throw new DAOException("Error al obtener la lista de préstamos de maestros: " + e.getMessage(), e);
        }
    }

    
    /**
     * Método para eliminar un préstamo de maestros de la base de datos.
     *
     * @param prestamoMaestros el objeto PrestamoMaestros a eliminar.
     * @throws DAOException si ocurre un error al eliminar el préstamo.
     */
    @Override
    public void eliminar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            DeleteResult result = prestamoMaestrosCollection.deleteOne(Filters.eq("_id", prestamoMaestros.getId()));
            if (result.getDeletedCount() == 0) {
                throw new DAOException("No se encontró el préstamo de maestros para eliminar.");
            }
        } catch (Exception e) {
            throw new DAOException("Error al eliminar el préstamo de maestros: " + e.getMessage(), e);
        }
    }
    /**
     * Método para actualizar un préstamo de maestros en la base de datos.
     *
     * @param prestamoMaestros el objeto PrestamoMaestros a actualizar.
     * @throws DAOException si ocurre un error al actualizar el préstamo.
     */
    @Override
    public void actualizar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            UpdateResult result = prestamoMaestrosCollection.updateOne(
                Filters.eq("_id", prestamoMaestros.getId()),
                Updates.combine(
                    Updates.set("fechaPrestamo", prestamoMaestros.getFechaPrestamo()),
                    Updates.set("departamento", prestamoMaestros.getDepartamento()),
                    Updates.set("cantidadPersonas", prestamoMaestros.getCantidadPersonas()),
                    Updates.set("motivo", prestamoMaestros.getMotivo()),
                    Updates.set("plantelOrigen", prestamoMaestros.getPlantelOrigen()),
                    Updates.set("plantelDestino", prestamoMaestros.getPlantelDestino()),
                    Updates.set("vehiculo", prestamoMaestros.getVehiculo()),
                    Updates.set("correoResponsable", prestamoMaestros.getCorreoResponsable()),
                    Updates.set("acompaniantes", prestamoMaestros.getAcompaniantes())
                )
            );
            if (result.getMatchedCount() == 0) {
                throw new DAOException("No se encontró el préstamo de maestros para actualizar.");
            }
        } catch (Exception e) {
            throw new DAOException("Error al actualizar el préstamo de maestros: " + e.getMessage(), e);
        }
    }
}