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
import entidades.Prestamo;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO implements IPrestamoDAO {

    private static List<Prestamo> lista = new ArrayList<>();

    /**
     * Agrega un préstamo a la lista.
     * 
     * @param prestamo el préstamo a agregar.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public void agregar(Prestamo prestamo) throws DAOException {
        lista.add(prestamo);
    }

    /**
     * Elimina un préstamo de la lista.
     * 
     * @param prestamo el préstamo a eliminar.
     * @throws DAOException si el préstamo no se encuentra en la lista.
     */
    @Override
    public void eliminar(Prestamo prestamo) throws DAOException {
        Prestamo prestamos = buscarPorId(prestamo.getId());
        if (prestamos != null) {
            lista.remove(prestamo);
        } else {
            throw new DAOException("Prestamo no encontrado");
        }
    }

    /**
     * Actualiza un préstamo en la lista.
     * 
     * @param prestamo el préstamo a actualizar.
     * @throws DAOException si el préstamo no se encuentra en la lista.
     */
    @Override
    public void actualizar(Prestamo prestamo) throws DAOException {
        Prestamo prestamoExistente = buscarPorId(prestamo.getId());
        if (prestamoExistente != null) {
            int index = lista.indexOf(prestamoExistente);
            lista.set(index, prestamo);
        } else {
            throw new DAOException("Prestamo no encontrado");
        }
    }

    /**
     * Busca un préstamo por su identificador único.
     * 
     * @param id el identificador único del préstamo a buscar.
     * @return el préstamo encontrado.
     * @throws DAOException si el préstamo no se encuentra en la lista.
     */
    @Override
    public Prestamo buscarPorId(int id) throws DAOException {
        for (Prestamo prestamo : lista) {
            if (prestamo.getId() == id) {
                return prestamo;
            }
        }
        throw new DAOException("Prestamo no encontrado");
    }

    /**
     * Obtiene una lista de todos los préstamos almacenados.
     * 
     * @return una lista de todos los préstamos almacenados.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public List<Prestamo> listaPrestamos() throws DAOException {
        return new ArrayList<>(lista);
    }

    /**
     * Obtiene una lista de préstamos que caen dentro de un rango de fechas dado.
     * 
     * @param begin la fecha de inicio del rango.
     * @param end la fecha de fin del rango.
     * @return una lista de préstamos que caen dentro del rango de fechas especificado.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public List<Prestamo> listaPorFechas(LocalDate begin, LocalDate end) throws DAOException {
        if (begin == null || end == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas.");
        }
        List<Prestamo> prestamosEnRango = new ArrayList<>();
        for (Prestamo prestamo : lista) {
            if ((prestamo.getInicio().isEqual(begin) || prestamo.getInicio().isAfter(begin)) &&
                (prestamo.getFin().isEqual(end) || prestamo.getFin().isBefore(end))) {
                prestamosEnRango.add(prestamo);
            }
        }
        return prestamosEnRango;
    }

    /**
     * Obtiene una lista de préstamos paginada.
     * 
     * @param offset el índice de inicio de la página.
     * @param limit el tamaño máximo de la página.
     * @return una lista de préstamos paginada.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public List<Prestamo> listaPaginda(int offset, int limit) throws DAOException {
        if (offset < 0 || limit < 0) {
            throw new IllegalArgumentException("Offset y limit deben ser mayores o iguales a 0.");
        }
        if (offset >= lista.size()) {
            return new ArrayList<>();
        }
        return lista.subList(offset, Math.min(offset + limit, lista.size()));    }

}

    
