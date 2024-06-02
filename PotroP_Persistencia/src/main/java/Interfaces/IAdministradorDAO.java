/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Administrador;
import excepciones.DAOException;
import java.util.List;

/**
 *
 * @author caarl
 */
public interface IAdministradorDAO {
    
    public void agregar(Administrador administrador) throws DAOException;
    public List<Administrador> listaAdministradores()throws DAOException;
    
}
