/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Interfaces.ITrasladoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.ConexionBD;
import entidades.Traslado;
import excepciones.DAOException;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class TrasladoDAO implements ITrasladoDAO{
      private final MongoCollection<Traslado> trasladoCollection;

    public TrasladoDAO() {
        this.trasladoCollection = ConexionBD.getInstance().getDatabase().getCollection("Traslado", Traslado.class);
    }

      @Override
    public void agregar(Traslado Traslado) throws DAOException {
        try {
            trasladoCollection.insertOne(Traslado);
        } catch (Exception e) {
            throw new DAOException("Error al generar traslado" + e);
        }
    }
    
      @Override
    public Traslado buscarPorId(ObjectId id) throws DAOException {
         try {
            return trasladoCollection.find(Filters.eq("id", id)).first();
        } catch (Exception e) {
            throw new DAOException("Error al numero de prestamo: " + e.getMessage());
        }
    
}
}
