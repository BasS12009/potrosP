/**
 * IPrestamoBO.java
 * 
 * Interfaz que define las operaciones de negocio relacionadas con los préstamos;
 * 
 * Esta interfaz define métodos para realizar operaciones relacionadas con los préstamos,
 * como agregar, eliminar, actualizar y buscar préstamos en el sistema; También proporciona
 * métodos para obtener listas de préstamos según diferentes criterios, como rangos de fechas
 * o paginación;
 * 
 * Implementaciones de esta interfaz pueden manejar la lógica de negocio asociada con los préstamos
 * y proporcionar acceso a la capa de datos para interactuar con la persistencia de préstamos en
 * la base de datos.
 */
package interfaces;

import dtos.PrestamoDTO;
import exceptions.BisnessException;
import entidades.Prestamo;
import java.time.LocalDate;
import java.util.List;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IPrestamoBO {
    
    /**
     * Agrega un nuevo préstamo al sistema.
     * 
     * @param prestamoDTO objeto de tipo PrestamoDTO que representa el préstamo a agregar.
     * @throws BisnessException si ocurre un error durante la operación de agregar.
     */
    public void agregar(PrestamoDTO prestamoDTO) throws BisnessException;
 
    
    /**
     * Busca un préstamo por su identificador único.
     * 
     * @param id el identificador único del préstamo a buscar.
     * @return el préstamo encontrado.
     * @throws BisnessException si ocurre un error durante la operación de búsqueda.
     */
    public Prestamo buscarPorId(String id) throws BisnessException;
     
   
    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws BisnessException 
     */
    public List<PrestamoDTO> listaPaginda(int offset, int limit) throws BisnessException;
    
    
    /**
     * 
     * @param begin
     * @param end
     * @return
     * @throws BisnessException 
     */
    public List<PrestamoDTO> listaPorFechas(LocalDate begin, LocalDate end) throws BisnessException;
    
}