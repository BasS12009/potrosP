/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.AdministradorDTO;
import Exceptions.BisnessException;

/**
 *
 * @author skevi
 */
public interface IAdministradorBO {
    
    public void registrar(AdministradorDTO administradorDTO)throws BisnessException;
    
    public boolean existe(AdministradorDTO administradorDTO)throws BisnessException;
    
}
