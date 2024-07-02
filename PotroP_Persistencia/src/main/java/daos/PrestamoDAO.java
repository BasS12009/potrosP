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

    
    // Colección de MongoDB para préstamos
    private final MongoCollection<Prestamo> prestamoCollection;

    // Constructor para inicializar la colección de préstamos
    public PrestamoDAO(MongoCollection<Prestamo> prestamoCollection) {
        this.prestamoCollection = prestamoCollection;
    }

    // Método para agregar un préstamo a la base de datos
    @Override
    public void agregar(Prestamo prestamo) throws DAOException {
        try {
            prestamoCollection.insertOne(prestamo);
        } catch (Exception e) {
            throw new DAOException("Error al agregar el préstamo: " + e.getMessage(), e);
        }
    }

    // Método para buscar un préstamo por su ID
    @Override
    public Prestamo buscarPorId(ObjectId id) throws DAOException {
        try {
            return prestamoCollection.find(Filters.eq("_id", id)).first();
        } catch (Exception e) {
            throw new DAOException("Error al obtener el préstamo por ID: " + e.getMessage(), e);
        }
    }

   
}

    
