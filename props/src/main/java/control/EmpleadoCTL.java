/**
 * EmpleadoCTL.java
 * 
 * La clase EmpleadoCTL es responsable de controlar las operaciones 
 * relacionadas con los empleados.
 * 
 */
package control;

import Excepcion.NegocioException;
import Negocio.EmpleadoBO;
import dtos.EmpleadoDTO;
import interfaces.IEmpleadoBO;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class EmpleadoCTL {
    
    IEmpleadoBO empleadoBO;

    /**
     * Constructor de la clase EmpleadoCTL.
     * Inicializa la instancia de EmpleadoBO para realizar operaciones 
     * relacionadas con empleados.
     */
    public EmpleadoCTL() {
        this.empleadoBO = new EmpleadoBO();
    }
    
    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return El objeto EmpleadoDTO correspondiente al ID especificado.
     * @throws NegocioException Si ocurre un error durante la búsqueda del 
     * empleado.
     */
    public EmpleadoDTO buscarPorID(int id) throws NegocioException {
        return this.empleadoBO.buscarEmpleado(id);
    }
    
}