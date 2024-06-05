/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Excepcion.PersistenciaException;
import entidades.Administrador;

/**
 *
 * @author skevi
 */
public interface IAdministradorDAO {
    
    public void registrar(Administrador administrador)throws PersistenciaException;
    
    public boolean existe(Administrador administrador)throws PersistenciaException;
    
}
