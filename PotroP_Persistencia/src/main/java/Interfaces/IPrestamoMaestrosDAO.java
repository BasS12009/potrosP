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
import org.bson.types.ObjectId;

/**
 * Interfaz IPrestamoMaestrosDAO define métodos para operaciones CRUD relacionadas con los préstamos de maestros.
 */

public interface IPrestamoMaestrosDAO {
    /**
     * Agrega un nuevo préstamo de maestros.
     * 
     * @param prestamoMaestros El objeto PrestamoMaestros que se va a agregar
     * @throws DAOException Si ocurre algún error durante la operación de agregar
     */
    public void agregar(PrestamoMaestros prestamoMaestros) throws DAOException;
    
    
    /**
     * Busca un préstamo de maestros por su identificador único.
     * 
     * @param id El identificador único del préstamo
     * @return El objeto PrestamoMaestros encontrado, o null si no se encuentra
     * @throws DAOException Si ocurre algún error durante la búsqueda
     */
    public PrestamoMaestros buscarPorId(ObjectId id) throws DAOException;
    
    
    
    /**
     * Obtiene una lista de todos los préstamos de maestros almacenados.
     * 
     * @return Una lista de objetos PrestamoMaestros
     * @throws DAOException Si ocurre algún error durante la obtención de la lista de préstamos
     */
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException;
    
}
