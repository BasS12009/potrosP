/**
 * IPrestamoDAO.java
 * 
 * Interfaz que define las operaciones de acceso a datos relacionadas con los préstamos;
 * 
 * Esta interfaz define métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * relacionadas con los préstamos en el sistema;
 * 
 * Implementaciones de esta interfaz proporcionan la lógica necesaria para interactuar con la capa de
 * persistencia de préstamos en la base de datos.
 */
package Interfaces;

import entidades.Prestamo;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.List;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IPrestamoDAO {
    
    /**
     * Agrega un nuevo préstamo al sistema.
     * 
     * @param prestamo objeto de tipo Prestamo que representa el préstamo a agregar.
     * @throws DAOException si ocurre un error durante la operación de agregar.
     */
    void agregar(Prestamo prestamo) throws DAOException;
    
    /**
     * Elimina un préstamo del sistema.
     * 
     * @param prestamo objeto de tipo Prestamo que representa el préstamo a eliminar.
     * @throws DAOException si ocurre un error durante la operación de eliminar.
     */
    void eliminar(Prestamo prestamo) throws DAOException;
    
    /**
     * Actualiza un préstamo en el sistema.
     * 
     * @param prestamo objeto de tipo Prestamo que representa el préstamo a actualizar.
     * @throws DAOException si ocurre un error durante la operación de actualizar.
     */
    void actualizar(Prestamo prestamo) throws DAOException;
    
    /**
     * Busca un préstamo por su identificador único.
     * 
     * @param id el identificador único del préstamo a buscar.
     * @return el préstamo encontrado.
     * @throws DAOException si ocurre un error durante la operación de búsqueda.
     */
    public Prestamo buscarPorId(int id) throws DAOException;
    
    /**
     * Obtiene una lista paginada de préstamos.
     * 
     * @param offset el índice del primer elemento a recuperar.
     * @param limit el número máximo de elementos a recuperar.
     * @return una lista de objetos de tipo Prestamo.
     * @throws DAOException si ocurre un error durante la operación de obtener la lista.
     */
    public List<Prestamo> listaPaginda(int offset, int limit) throws DAOException;
    
    /**
     * Obtiene una lista de todos los préstamos almacenados en el sistema.
     * 
     * @return una lista de objetos de tipo Prestamo.
     * @throws DAOException si ocurre un error durante la operación de obtener la lista.
     */
    public List<Prestamo> listaPrestamos() throws DAOException;
    
    /**
     * Obtiene una lista de préstamos dentro de un rango de fechas.
     * 
     * @param begin la fecha de inicio del rango.
     * @param end la fecha de fin del rango.
     * @return una lista de objetos de tipo Prestamo.
     * @throws DAOException si ocurre un error durante la operación de obtener la lista.
     */
    public List<Prestamo> listaPorFechas(LocalDate begin, LocalDate end) throws DAOException;
  
}
