/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Excepcion.NegocioException;
import Negocio.EmpleadoBO;
import dtos.EmpleadoDTO;
import interfaces.IEmpleadoBO;

/**
 *
 * @author skevi
 */
public class EmpleadoCTL {
    
    IEmpleadoBO empleadoBO;

    public EmpleadoCTL() {
        this.empleadoBO = new EmpleadoBO();
    }
    
    public EmpleadoDTO buscarPorID(int id) throws NegocioException{
        return this.empleadoBO.buscarEmpleado(id);
    }
    
}
