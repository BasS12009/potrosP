/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Converters;

import DTO.EmpleadoDTO;
import entidades.Empleado;

/**
 *
 * @author skevi
 */
public class EmpleadoCVR {
    
    public Empleado convertir_Entidad(EmpleadoDTO empleadoDTO){
        String correo = empleadoDTO.getCorreo();
        String contraseña = empleadoDTO.getCorreo();
        return new Empleado (correo, contraseña);
    }
    
    public EmpleadoDTO convertir_DTO(Empleado empleado){
        int id = empleado.getId();
        String correo = empleado.getCorreo();
        String contraseña = empleado.getContraseña();
        return new EmpleadoDTO(id, correo, contraseña);
    }
    
}
