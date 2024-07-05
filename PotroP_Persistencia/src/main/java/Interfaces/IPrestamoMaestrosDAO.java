/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author caarl
 */
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import java.util.List;

/**
 * Interfaz IPrestamoMaestrosDAO define métodos para operaciones CRUD relacionadas con los préstamos de maestros.
 */

public interface IPrestamoMaestrosDAO {
    
    /**
     * Agrega un préstamo maestros a la base de datos.
     * 
     * @param prestamoMaestrosDTO el préstamo maestros a agregar
     * @throws DAOException si ocurre algún error durante la operación
     */
    public void agregar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException;
    
    /**
     * Busca un préstamo maestros por su identificador.
     * 
     * @param id el identificador del préstamo maestros a buscar
     * @return el préstamo maestros encontrado, o null si no existe
     * @throws DAOException si ocurre algún error durante la operación
     */
    public PrestamoMaestros buscarPorId(String id) throws DAOException;
    
    /**
     * Obtiene una lista de todos los préstamos maestros almacenados.
     * 
     * @return una lista de préstamos maestros
     * @throws DAOException si ocurre algún error durante la operación
     */
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException;
    
    /**
     * Elimina un préstamo maestros de la base de datos.
     * 
     * @param prestamoMaestrosDTO el préstamo maestros a eliminar
     * @throws DAOException si ocurre algún error durante la operación
     */
    public void eliminar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException;
    
    /**
     * Actualiza los datos de un préstamo maestros en la base de datos.
     * 
     * @param prestamoMaestrosDTO el préstamo maestros con los datos actualizados
     * @throws DAOException si ocurre algún error durante la operación
     */
    public void actualizar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException;
    
}
