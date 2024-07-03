/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Interfaces.ITrasladoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBD;
import entidades.Traslado;
import excepciones.DAOException;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class TrasladoDAO implements ITrasladoDAO{
    // Colección de MongoDB para traslados
    private final MongoCollection<Traslado> trasladoCollection;

    // Constructor para inicializar la colección de traslados
    public TrasladoDAO() {
        // Aquí obtienes la colección "Traslado" desde la instancia de conexión a la base de datos
        this.trasladoCollection = ConexionBD.getInstance().getDatabase().getCollection("Traslado", Traslado.class);
    }

    // Método para agregar un traslado a la base de datos
    @Override
    public void agregar(Traslado traslado) throws DAOException {
        try {
            // Insertar un nuevo documento traslado en la colección
            trasladoCollection.insertOne(traslado);
        } catch (Exception e) {
            // Capturar cualquier excepción y lanzarla como DAOException
            throw new DAOException("Error al generar traslado: " + e.getMessage(), e);
        }
    }
    
    // Método para buscar un traslado por su ID
    @Override
    public Traslado buscarPorId(String id) throws DAOException {
        try {
            ObjectId objeto = new ObjectId(id);
            // Utilizar Filters.eq para encontrar el traslado por su ID y devolver el primero encontrado
            return trasladoCollection.find(Filters.eq("_id", objeto)).first();
        } catch (Exception e) {
            // Capturar cualquier excepción y lanzarla como DAOException
            throw new DAOException("Error al buscar traslado por ID: " + e.getMessage(), e);
        }
    }

    // Método para verificar si un traslado existe por su número de traslado
    @Override
    public boolean existe(int numTraslado) throws DAOException {
       try {
            return trasladoCollection.find(Filters.eq("numTraslado", numTraslado)).first() != null;
        } catch (Exception e) {
            throw new DAOException("Error al verificar la existencia del traslado: " + e.getMessage(), e);
        }
    }

    // Método para buscar un traslado por su folio
    @Override
    public Traslado buscar(int folio) throws DAOException {
        try {
            return trasladoCollection.find(Filters.eq("folio", folio)).first();
        } catch (Exception e) {
            throw new DAOException("Error al buscar traslado por folio: " + e.getMessage(), e);
        }
    }
    
    
     // Método para actualizar un traslado en la base de datos
    @Override
    public void actualizar(Traslado traslado) throws DAOException {
        try {
            UpdateResult result = trasladoCollection.updateOne(
                Filters.eq("_id", traslado.getId()),
                Updates.combine(
                    Updates.set("folio", traslado.getFolio()),
                    Updates.set("motivo", traslado.getMotivo()),
                    Updates.set("personas", traslado.getPersonas()),
                    Updates.set("fechaHoraSalida", traslado.getFechaHoraSalida()),
                    Updates.set("fechaHoraRegreso", traslado.getFechaHoraRegreso()),
                    Updates.set("disponibilidad", traslado.isDisponibilidad()),
                    Updates.set("vehiculo", traslado.getVehiculo()),
                    Updates.set("estadoVehiculo", traslado.getEstadoVehiculo()),
                    Updates.set("llantas", traslado.getLlantas()),
                    Updates.set("carroceria", traslado.getCarroceria()),
                    Updates.set("combustible", traslado.getCombustible())
                )
            );
            if (result.getMatchedCount() == 0) {
                throw new DAOException("No se encontró el traslado para actualizar.");
            }
        } catch (Exception e) {
            throw new DAOException("Error al actualizar el traslado: " + e.getMessage(), e);
        }
    }
}
