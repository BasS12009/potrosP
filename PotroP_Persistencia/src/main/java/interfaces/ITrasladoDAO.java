/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Traslado;
import excepciones.DAOException;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */

/**
 * Interfaz ITrasladoDAO define métodos para operaciones CRUD relacionadas con los traslados.
 */
public interface ITrasladoDAO {
    
     /**
     * Agrega un nuevo objeto Traslado.
     * 
     * @param traslado El objeto Traslado que se va a agregar
     * @throws DAOException Si ocurre algún error durante la operación de agregar
     */
    public void agregar(Traslado traslado) throws DAOException;
    
    
    /**
     * Busca un objeto Traslado por su identificador único.
     * 
     * @param id El identificador único del traslado
     * @return El objeto Traslado encontrado, o null si no se encuentra
     * @throws DAOException Si ocurre algún error durante la búsqueda
     */
    public Traslado buscarPorId(ObjectId id) throws DAOException;
}
