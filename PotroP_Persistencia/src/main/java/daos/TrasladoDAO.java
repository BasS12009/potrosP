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
    public Traslado buscarPorId(ObjectId id) throws DAOException {
        try {
            // Utilizar Filters.eq para encontrar el traslado por su ID y devolver el primero encontrado
            return trasladoCollection.find(Filters.eq("_id", id)).first();
        } catch (Exception e) {
            // Capturar cualquier excepción y lanzarla como DAOException
            throw new DAOException("Error al buscar traslado por ID: " + e.getMessage(), e);
        }
    }
}
