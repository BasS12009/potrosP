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
import conexion.ConexionBD;
import entidades.Prestamo;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

public class PrestamoDAO implements IPrestamoDAO {

    
    // Colección de MongoDB para préstamos
    private final MongoCollection<Prestamo> prestamoCollection;

    // Constructor para inicializar la colección de préstamos
    public PrestamoDAO() {
        this.prestamoCollection = ConexionBD.getInstance().getDatabase().getCollection("Prestamos", Prestamo.class);
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
    public Prestamo buscarPorId(String id) throws DAOException {
        try {
            ObjectId objeto = new ObjectId(id);
            return prestamoCollection.find(Filters.eq("_id", objeto)).first();
        } catch (Exception e) {
            throw new DAOException("Error al obtener el préstamo por ID: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Prestamo> listaPaginda(int offset, int limit) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Prestamo> listaPorFechas(LocalDate begin, LocalDate end) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}

    
