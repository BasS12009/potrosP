/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Excepcion.NegocioException;
import Negocio.EmpleadoBO;
import dtos.EmpleadoDTO;
import exception.ControlException;
import interfaces.IEmpleadoBO;

/**
 *
 * @author skevi
 */
public class LogginCTL {
    
    private IEmpleadoBO empleadoBO;

    /**
     * 
     */
    public LogginCTL() {
       this.empleadoBO = new EmpleadoBO();
    }
    
    /**
     * 
     * @param empleadoDTO
     * @return
     * @throws ControlException 
     */
    public boolean existe(EmpleadoDTO empleadoDTO) throws ControlException{
        try{
            return this.empleadoBO.existenciaAdmin(empleadoDTO);
        }
        catch(NegocioException e){
            throw new ControlException(e.getMessage());
        }
    }
    
}
