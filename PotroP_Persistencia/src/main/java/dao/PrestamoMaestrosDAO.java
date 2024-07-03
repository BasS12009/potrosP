/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import Interfaces.IPrestamoMaestrosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBD;
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class PrestamoMaestrosDAO implements IPrestamoMaestrosDAO{
    
   // Colección de MongoDB para préstamos de maestros
    private final MongoCollection<PrestamoMaestros> prestamoMaestrosCollection;

    // Constructor para inicializar la colección de préstamos de maestros
    public PrestamoMaestrosDAO() {
        this.prestamoMaestrosCollection = ConexionBD.getInstance().getDatabase().getCollection("PrestamosMaestros", PrestamoMaestros.class);
    }

    // Método para agregar un préstamo de maestros a la base de datos
    @Override
    public void agregar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            prestamoMaestrosCollection.insertOne(prestamoMaestros);
        } catch (Exception e) {
            throw new DAOException("Error interno al agregar el préstamo de maestros: " + e.getMessage(), e);
        }
    }

    // Método para buscar un préstamo de maestros por su ID

    /**
     *
     * @param id
     * @return
     * @throws DAOException
     */
    @Override
    public PrestamoMaestros buscarPorId(String id) throws DAOException {
        try {
            ObjectId objeto = new ObjectId(id);
            return prestamoMaestrosCollection.find(Filters.eq("_id", objeto)).first();
        } catch (Exception e) {
            throw new DAOException("Error al obtener el préstamo de maestros por ID: " + e.getMessage(), e);
        }
    }

    // Método para obtener todos los préstamos de maestros
    @Override
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException {
        try {
            List<PrestamoMaestros> prestamoMaestros = prestamoMaestrosCollection.find().into(new ArrayList<>());
            System.out.println("Prestamos de maestros obtenidos correctamente: " + prestamoMaestros);
            return prestamoMaestros;
        } catch (Exception e) {
            throw new DAOException("Error al obtener todos los préstamos de maestros: " + e.getMessage(), e);
        }
    }

    @Override
    public void eliminar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException {
        try {
            DeleteResult result = prestamoMaestrosCollection.deleteOne(Filters.eq("_id", prestamoMaestrosDTO.getId()));
            if (result.getDeletedCount() == 0) {
                throw new DAOException("No se encontró el préstamo de maestros para eliminar.");
            }
        } catch (Exception e) {
            throw new DAOException("Error al eliminar el préstamo de maestros: " + e.getMessage(), e);
        }
    }

    @Override
    public void actualizar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException {
        try {
        UpdateResult result = prestamoMaestrosCollection.updateOne(
            Filters.eq("_id", prestamoMaestrosDTO.getId()),
            Updates.combine(
                Updates.set("fechaPrestamo", prestamoMaestrosDTO.getFechaPrestamo()),
                Updates.set("departamento", prestamoMaestrosDTO.getDepartamento()),
                Updates.set("cantidadPersonas", prestamoMaestrosDTO.getCantidadPersonas()),
                Updates.set("motivo", prestamoMaestrosDTO.getMotivo()),
                Updates.set("plantelOrigen", prestamoMaestrosDTO.getPlantelOrigen()),
                Updates.set("plantelDestino", prestamoMaestrosDTO.getPlantelDestino()),
                Updates.set("vehiculo", prestamoMaestrosDTO.getVehiculo()),
                Updates.set("correoResponsable", prestamoMaestrosDTO.getCorreoResponsable()),
                Updates.set("acompanantes", prestamoMaestrosDTO.getAcompaniantes())
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
    
    
    