/**
 * LogginCTL.java
 * 
 * Controlador para el proceso de inicio de sesión.
 */
package control;

import Excepcion.NegocioException;
import Negocio.EmpleadoBO;
import dtos.EmpleadoDTO;
import exception.ControlException;
import interfaces.IEmpleadoBO;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class LogginCTL {
    
    private IEmpleadoBO empleadoBO;

    /**
     * Constructor de la clase LogginCTL que inicializa el objeto empleadoBO.
     */
    public LogginCTL() {
       this.empleadoBO = new EmpleadoBO();
    }
    
    /**
     * Verifica si un empleado existe en el sistema.
     * 
     * @param empleadoDTO El DTO del empleado a verificar.
     * @return true si el empleado existe, false en caso contrario.
     * @throws ControlException Si ocurre un error de control durante la verificación.
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