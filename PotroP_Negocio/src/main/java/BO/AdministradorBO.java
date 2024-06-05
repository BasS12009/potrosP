/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BO;

import Converters.AdministradorCVR;
import DTO.AdministradorDTO;
import Excepcion.PersistenciaException;
import Exceptions.BisnessException;
import dao.AdministradorDAO;
import interfaces.IAdministradorBO;
import interfaces.IAdministradorDAO;

/**
 * Esta clase implementa los elementos de IAdministradorDAO para su uso en capas
 * posteriores.
 * @author skevi
 */
public class AdministradorBO implements IAdministradorBO{
    
    //Inicializamos las variables de la clase.
    private final IAdministradorDAO administradorDAO;
    private final AdministradorCVR administradorCVR;

    //Constructor de la clase.
    public AdministradorBO() {
        this.administradorDAO = new AdministradorDAO();
        this.administradorCVR = new AdministradorCVR();      
    }

    /**
     * 
     * @param administradorDTO
     * @throws BisnessException 
     */
    @Override
    public void registrar(AdministradorDTO administradorDTO) throws BisnessException {
        try{
            if (administradorDTO == null) {
                throw new BisnessException("Administrador nulo");
            }
            else{
                this.administradorDAO.registrar(this.administradorCVR.convertir_Entidad(administradorDTO));
            } 
        }
        catch(PersistenciaException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * 
     * @param administradorDTO
     * @return
     * @throws BisnessException 
     */
    @Override
    public boolean existe(AdministradorDTO administradorDTO) throws BisnessException {
        try{
            if (administradorDTO == null) {
                throw new BisnessException("Administrador nulo");
            }
            else{
                return this.administradorDAO.existe(this.administradorCVR.convertir_Entidad(administradorDTO));
            }
        }
        catch(PersistenciaException e){
             throw new BisnessException(e.getMessage());
        }
    }
    
   
    
}
