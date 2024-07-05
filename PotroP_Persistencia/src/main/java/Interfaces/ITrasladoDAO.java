/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Traslado;
import excepciones.DAOException;

/**
 *
 * @author diana
 */

/**
 * Interfaz ITrasladoDAO define métodos para operaciones CRUD relacionadas con los traslados.
 */
public interface ITrasladoDAO {
    
    /**
     * Agrega un traslado a la base de datos.
     * 
     * @param traslado el traslado a agregar
     * @throws DAOException si ocurre algún error durante la operación
     */
    public void agregar(Traslado traslado) throws DAOException;
    
    /**
     * Verifica si existe un traslado con el folio especificado.
     * 
     * @param folio el folio del traslado a verificar
     * @return true si el traslado existe, false en caso contrario
     * @throws DAOException si ocurre algún error durante la operación
     */
    public boolean existe(String folio) throws DAOException;
    
    /**
     * Busca un traslado por su folio.
     * 
     * @param folio el folio del traslado a buscar
     * @return el traslado encontrado, o null si no existe
     * @throws DAOException si ocurre algún error durante la operación
     */
    public Traslado buscar(String folio) throws DAOException;
    
    /**
     * Actualiza los datos de un traslado en la base de datos.
     * 
     * @param trasladoDTO el traslado con los datos actualizados
     * @throws DAOException si ocurre algún error durante la operación
     */
    public void actualizar(Traslado trasladoDTO) throws DAOException;
    
    /**
     * Busca un traslado por su identificador único.
     * 
     * @param id el identificador del traslado a buscar
     * @return el traslado encontrado, o null si no existe
     * @throws DAOException si ocurre algún error durante la operación
     */
    public Traslado buscarPorId(String id) throws DAOException;
}
