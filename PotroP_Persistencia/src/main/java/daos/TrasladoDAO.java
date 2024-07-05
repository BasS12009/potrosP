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
    private final MongoCollection<Traslado> trasladoCollection;

    public TrasladoDAO() {
        this.trasladoCollection = ConexionBDM.getInstance().getDatabase().getCollection("Traslado", Traslado.class);
    }

    @Override
    public void agregar(Traslado traslado) throws DAOException {
        try {
            trasladoCollection.insertOne(traslado);
        } catch (Exception e) {
            throw new DAOException("Error al generar traslado: " + e.getMessage(), e);
        }
    }
    
    @Override
    public Traslado buscarPorId(String id) throws DAOException {
        try {
            ObjectId objeto = new ObjectId(id);
            return trasladoCollection.find(Filters.eq("_id", objeto)).first();
        } catch (Exception e) {
            throw new DAOException("Error al buscar traslado por ID: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean existe(String folio) throws DAOException {
       try {
            return trasladoCollection.find(Filters.eq("numTraslado", folio)).first() != null;
        } catch (Exception e) {
            throw new DAOException("Error al verificar la existencia del traslado: " + e.getMessage(), e);
        }
    }

    @Override
    public Traslado buscar(String folio) throws DAOException {
        try {
            return trasladoCollection.find(Filters.eq("folio", folio)).first();
        } catch (Exception e) {
            throw new DAOException("Error al buscar traslado por folio: " + e.getMessage(), e);
        }
    }
    
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