/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.EmpleadoDTO;
import excepciones.ControlException;
import excepciones.NegocioException;
import interfaces.IEmpleadoBO;
import interfaces.IEmpleadoCTL;
import java.util.List;
import negocio.EmpleadoBO;

/**
 *
 * @author skevi
 */
public class EmpleadoCTL implements IEmpleadoCTL{

    IEmpleadoBO empleadoBO;

    public EmpleadoCTL() {
        this.empleadoBO = new EmpleadoBO();
    }
    
    @Override
    public EmpleadoDTO buscarEmpleado(int id) throws ControlException {
        try{
            return empleadoBO.buscarEmpleado(id);
        }
        catch(NegocioException ex){
            throw new ControlException(ex.getMessage());
        }
    }

    @Override
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws ControlException {
        try{
            return empleadoBO.ListaEmpleados(offset, limit);
        }
        catch(NegocioException ex){
            throw new ControlException(ex.getMessage());
        }
    }

    @Override
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO) throws ControlException {
        try{
            return empleadoBO.existenciaAdmin(empleadoDTO);
        }
        catch(NegocioException ex){
            throw new ControlException(ex.getMessage());
        }
    }
    
}
