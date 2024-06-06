/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BO.AdministradorBO;
import Exceptions.BisnessException;
import dtos.AdministradorDTO;
import interfaces.IAdministradorBO;
import exception.ControlException;

/**
 *
 * @author skevi
 */
public class LogginCTL {
    
    private IAdministradorBO administradorBO;

    /**
     * 
     */
    public LogginCTL() {
        this.administradorBO = new AdministradorBO();
    }
    
    /**
     * 
     * @param administradorDTO
     * @return
     * @throws LogginException 
     */
    public boolean existe(AdministradorDTO administradorDTO) throws ControlException{
        try{
            return this.administradorBO.existe(administradorDTO);
        }
        catch(BisnessException e){
            throw new ControlException(e.getMessage());
        }
    }
  
}
