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
     * @param prestamo objeto de tipo PrestamoDTO que representa el préstamo a agregar.
     * @throws DAOException si ocurre un error durante la operación de agregar.
     */
    public void agregar(Prestamo prestamo) throws DAOException;
 
    
    /**
     * Busca un préstamo por su identificador único.
     * 
     * @param id el identificador único del préstamo a buscar.
     * @return el préstamo encontrado.
     * @throws DAOException si ocurre un error durante la operación de búsqueda.
     */
    public Prestamo buscarPorId(String id) throws DAOException;
     
   
    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws DAOException 
     */
    public List<Prestamo> listaPaginda(int offset, int limit) throws DAOException;
    
    
    /**
     * 
     * @param begin
     * @param end
     * @return
     * @throws DAOException 
     */
    public List<Prestamo> listaPorFechas(LocalDate begin, LocalDate end) throws DAOException;
}
