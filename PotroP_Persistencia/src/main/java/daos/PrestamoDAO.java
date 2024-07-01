/**
 * PrestamoDAO.java
 * 
 * Esta clase permite agregar, eliminar, actualizar y buscar préstamos en una 
 * lista en memoria, utilizando una implementación de la interfaz IPrestamoDAO 
 * que proporciona acceso a los datos de préstamos utilizando una lista en memoria;
 */
package daos;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
import Interfaces.IPrestamoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import entidades.Prestamo;
import excepciones.DAOException;
import org.bson.types.ObjectId;

public class PrestamoDAO implements IPrestamoDAO {

    
     private final MongoCollection<Prestamo> prestamoCollection;

    
     public PrestamoDAO(MongoCollection<Prestamo> prestamoCollection) {
        this.prestamoCollection = prestamoCollection;
    }
  
     

    /**
     * Agrega un préstamo a la lista.
     * 
     * @param prestamo el préstamo a agregar.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public void agregar(Prestamo prestamo) throws DAOException {
        try{
        prestamoCollection.insertOne(prestamo);
        }
        catch(Exception e){
            throw new DAOException("Error al agregar el prestamo");
        }
    }

    @Override
   public Prestamo buscarPorId(ObjectId id) throws DAOException {
         try {
            return prestamoCollection.find(Filters.eq("id", id)).first();
        } catch (Exception e) {
            throw new DAOException("Error el numero de préstamo: " + e.getMessage());
        }
    }

   
}

    
