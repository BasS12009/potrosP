/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Traslado;
import excepciones.DAOException;

/**
 *
 * @author skevi
 */
public interface ITrasladoDAO {
    
    /**
     * Agrega un nuevo traslado al sistema.
     * 
     * @param traslado El objeto Traslado que se va a agregar.
     * @throws DAOException Si ocurre un error durante la operación de agregado.
     */
    public void agregar(Traslado traslado) throws DAOException;
    
    /**
     * Actualiza un traslado existente en el sistema.
     * 
     * @param traslado El objeto Traslado con la información actualizada.
     * @throws DAOException Si ocurre un error durante la operación de actualización.
     */
    public void actualizar(Traslado traslado) throws DAOException;
    
    /**
     * Busca un traslado en el sistema utilizando su número de traslado.
     * 
     * @param numTraslado El número del traslado a buscar.
     * @return El objeto Traslado si se encuentra, de lo contrario null.
     * @throws DAOException Si ocurre un error durante la operación de búsqueda.
     */
    public Traslado buscar(int numTraslado) throws DAOException;
    
    /**
     * Verifica si un traslado existe en el sistema.
     * 
     * @param numTraslado El número del traslado a verificar.
     * @return true si el traslado existe, false de lo contrario.
     * @throws DAOException Si ocurre un error durante la operación de verificación.
     */
    public boolean existe(int numTraslado) throws DAOException;
    
}
