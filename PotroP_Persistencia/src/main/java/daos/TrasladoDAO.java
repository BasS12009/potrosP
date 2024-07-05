/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.ITrasladoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBDM;
import entidades.Traslado;
import excepciones.DAOException;
import org.bson.types.ObjectId;

public class TrasladoDAO implements ITrasladoDAO {
   
    /**
     * Colección de MongoDB para almacenar objetos de tipo Traslado.
     */
    private final MongoCollection<Traslado> trasladoCollection;

    /**
     * Constructor que inicializa la colección de Traslado utilizando la instancia de conexión a la base de datos.
     */
    public TrasladoDAO() {
        this.trasladoCollection = ConexionBDM.getInstance().getDatabase().getCollection("Traslado", Traslado.class);
    }

    
    /**
     * Agrega un nuevo objeto Traslado a la base de datos.
     * 
     * @param traslado el objeto Traslado a agregar.
     * @throws DAOException si ocurre un error al generar el traslado.
     */
    @Override
    public void agregar(Traslado traslado) throws DAOException {
        try {
            trasladoCollection.insertOne(traslado);
        } catch (Exception e) {
            throw new DAOException("Error al generar traslado: " + e.getMessage(), e);
        }
    }
    
    
    /**
     * Busca un objeto Traslado por su ID en la base de datos.
     * 
     * @param id el ID del Traslado a buscar.
     * @return el objeto Traslado encontrado, o null si no se encuentra.
     * @throws DAOException si ocurre un error al buscar el traslado por ID.
     */
    @Override
    public Traslado buscarPorId(String id) throws DAOException {
        try {
            ObjectId objeto = new ObjectId(id);
            return trasladoCollection.find(Filters.eq("_id", objeto)).first();
        } catch (Exception e) {
            throw new DAOException("Error al buscar traslado por ID: " + e.getMessage(), e);
        }
    }
    
    
    
    /**
     * Verifica si existe un traslado en la base de datos dado un folio específico.
     * 
     * @param folio el folio del traslado a verificar.
     * @return true si existe el traslado con el folio especificado, false de lo contrario.
     * @throws DAOException si ocurre un error al verificar la existencia del traslado.
     */
    @Override
    public boolean existe(String folio) throws DAOException {
       try {
            return trasladoCollection.find(Filters.eq("numTraslado", folio)).first() != null;
        } catch (Exception e) {
            throw new DAOException("Error al verificar la existencia del traslado: " + e.getMessage(), e);
        }
    }

     /**
     * Busca un objeto Traslado por su folio en la base de datos.
     * 
     * @param folio el folio del Traslado a buscar.
     * @return el objeto Traslado encontrado, o null si no se encuentra.
     * @throws DAOException si ocurre un error al buscar el traslado por folio.
     */
    @Override
    public Traslado buscar(String folio) throws DAOException {
        try {
            return trasladoCollection.find(Filters.eq("folio", folio)).first();
        } catch (Exception e) {
            throw new DAOException("Error al buscar traslado por folio: " + e.getMessage(), e);
        }
    }
    
    /**
     * Actualiza un objeto Traslado en la base de datos.
     * 
     * @param traslado el objeto Traslado actualizado.
     * @throws DAOException si ocurre un error al actualizar el traslado.
     */
    @Override
    public void actualizar(Traslado traslado) throws DAOException {
        try {
            UpdateResult result = trasladoCollection.updateOne(
                Filters.eq("_id", new ObjectId(traslado.getId())),
                Updates.combine(
                    Updates.set("folio", traslado.getFolio()),
                    Updates.set("motivo", traslado.getMotivo()),
                    Updates.set("personas", traslado.getPersonas()),
                    Updates.set("fechaHoraSalida", traslado.getFechaHoraSalida()),
                    Updates.set("fechaHoraRegreso", traslado.getFechaHoraRegreso()),
                    Updates.set("disponibilidad", traslado.isDisponibilidad()),
                    Updates.set("vehiculo", traslado.getVehiculo()),
                    Updates.set("vehiculoEntregado", traslado.getVehiculoEntregado()),
                    Updates.set("vehiculoDevuelto", traslado.getVehiculoDevuelto()),
                    Updates.set("correoEmpleado", traslado.getCorreoEmpleado()),
                    Updates.set("estado", traslado.isEstado())
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