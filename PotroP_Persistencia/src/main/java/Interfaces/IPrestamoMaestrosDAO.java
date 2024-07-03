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
    
    public void agregar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException;
    
    public PrestamoMaestros buscarPorId(String id) throws DAOException;
    
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException;
    
    public void eliminar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException;
    
    public void actualizar(PrestamoMaestros prestamoMaestrosDTO) throws DAOException;
    
}
