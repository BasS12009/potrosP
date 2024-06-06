/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertidor;

import dtos.EmpleadoDTO;
import entidades.Empleado;

/**
 * convertirdo de DTO a entidad y viceversa de la 
 * @author skevi
 */
public class EmpleadoCVR {
    
    public Empleado convertir_Entidad(EmpleadoDTO EmpleadoDTO){
        String correo = EmpleadoDTO.getCorreo();
        String contraseña = EmpleadoDTO.getCorreo();
        return new Empleado(correo, contraseña);
    }
    
    public EmpleadoDTO convertir_DTO(Empleado empleado){
        int id = empleado.getId();
        String correo = empleado.getCorreo();
        String contraseña = empleado.getContraseña();
        return new EmpleadoDTO(id, correo, contraseña);
    }
}
