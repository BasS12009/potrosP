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
    
    public void agregar(Traslado traslado) throws DAOException;
    
    public boolean existe(int numTraslado) throws DAOException;
    
    public Traslado buscar(int Folio) throws DAOException;
    
    public void actualizar(Traslado trasladoDTO) throws DAOException;
    
    public Traslado buscarPorId(String id) throws DAOException;
}
