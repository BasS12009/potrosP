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

public interface IPrestamoMaestrosDAO {
    
    void agregar(PrestamoMaestros prestamoMaestros) throws DAOException;
    void eliminar(PrestamoMaestros prestamoMaestros) throws DAOException;
    void actualizar(PrestamoMaestros prestamoMaestros) throws DAOException;
    PrestamoMaestros buscarPorId(int id) throws DAOException;
    List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException;
    
}
