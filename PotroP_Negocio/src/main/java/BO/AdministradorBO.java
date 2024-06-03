/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Converters.AdministradorCVR;
import DTO.AdministradorDTO;
import Exceptions.BisnessException;
import Interfaces.IAdministradorDAO;
import daos.AdministradorDAO;
import entidades.Administrador;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase implementa los elementos de IAdministradorDAO para su uso en capas
 * posteriores.
 * @author skevi
 */
public class AdministradorBO {
    
    //Inicializamos las variables de la clase.
    private IAdministradorDAO administradorDAO;
    private AdministradorCVR administradorCVR;

    //Constructor de la clase.
    public AdministradorBO() {
        this.administradorDAO = new AdministradorDAO();
        this.administradorCVR = new AdministradorCVR();      
    }
    
    /**
     * Metodo para agregar un nuevo Administrador.
     * 
     * @param administradorDTO objeto de tipo AdministradorDTO a agregar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    public void agregar(AdministradorDTO administradorDTO) throws BisnessException{
        try{
            this.administradorDAO.agregar(this.administradorCVR.convertir_Entidad(administradorDTO));
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }
    
    /**
     * Metodo que nos devuelve una lista con todos los administradores.
     * 
     * @return Lista de administradores.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    public List<AdministradorDTO> listaAdministradores()throws BisnessException{
        List<AdministradorDTO> listaDTO = new ArrayList();
        try{
            List<Administrador> lista = this.administradorDAO.listaAdministradores();
            for (int i = 0; i < lista.size(); i++) {
                listaDTO.add(this.administradorCVR.convertir_DTO(lista.get(i)));
            }
            return listaDTO;
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }
}
