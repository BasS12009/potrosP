/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Converters;

import DTO.AdministradorDTO;
import entidades.Administrador;

/**
 * convertirdo de DTO a entidad y viceversa de la 
 * @author skevi
 */
public class AdministradorCVR {
    
    public Administrador convertir_Entidad(AdministradorDTO administradorDTO){
        String correo = administradorDTO.getCorreoDTO();
        String contraseña = administradorDTO.getCorreoDTO();
        return new Administrador(correo, contraseña);
    }
    
    public AdministradorDTO convertir_DTO(Administrador administrador){
        int id = administrador.getId();
        
    }
}
