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
        try{
        lista.add(prestamo);
        }
        catch(Exception e){
            throw new DAOException("Error interno al agregar el prestamo");
        }
    }

    /**
     * Elimina un préstamo de la lista.
     * 
     * @param prestamo el préstamo a eliminar.
     * @throws DAOException si el préstamo no se encuentra en la lista.
     */
    @Override
    public void eliminar(Prestamo prestamo) throws DAOException {
        try{
            //buscamos el prestamo a eliminar
            Prestamo prestamos = buscarPorId(prestamo.getId());
        
            lista.remove(prestamo);
        }
        catch(Exception e){
            throw new DAOException("Error al eliminar el prestamo");
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
        try{
            Prestamo prestamoExistente = buscarPorId(prestamo.getId());
            int index = lista.indexOf(prestamoExistente);
            lista.set(index, prestamo);
        } 
        catch(Exception e){
            throw new DAOException("Error al actualizar el prestamo");
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
        try{
        boolean existe;
        
        for (Prestamo prestamo : lista) {
            if (prestamo.getId() == id) {
                existe = true;
                return prestamo;
            }
        }
        
        if (existe = false) {
            throw new DAOException("El preatamo con el id proporcionado no existe");
        }
        
        }
        catch(Exception e){
            throw new DAOException("Error al obtener el prestamo");      
        }
        return null;
    }

    /**
     * Obtiene una lista de todos los préstamos almacenados.
     * 
     * @return una lista de todos los préstamos almacenados.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public List<Prestamo> listaPrestamos() throws DAOException {
        try{
            return new ArrayList<>(lista);
        }
        catch(Exception e){
            throw new DAOException("Error al obtener la lista de prestamos");
        }
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
        try{
            
        List<Prestamo> prestamosEnRango = new ArrayList<>();
        
        for (Prestamo prestamo : lista) {
            if ((prestamo.getInicio().isEqual(begin) || prestamo.getInicio().isAfter(begin)) &&
                (prestamo.getFin().isEqual(end) || prestamo.getFin().isBefore(end))) {
                prestamosEnRango.add(prestamo);
            }
        }
        return prestamosEnRango;
        
        }
        catch(Exception e){
           throw new DAOException("Error al obtener la lista por fechas");
        }   
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
        try{
            
        if (offset >= lista.size()) {
            return new ArrayList<>();
        }
        return lista.subList(offset, Math.min(offset + limit, lista.size()));
        }
        
        catch(Exception e){
            throw new DAOException("Error al obtener la lista de prestamos");
        }
    }
}

    
