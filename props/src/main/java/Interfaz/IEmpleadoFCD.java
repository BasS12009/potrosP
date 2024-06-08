/**
 * IEmpleadoFCD.java
 * 
 * La interfaz IEmpleadoFCD define los métodos para trabajar con empleados 
 * en la interfaz de usuario; Proporciona operaciones para mostrar información 
 * de un empleado en una tabla y buscar un empleado por su ID.
 */
package Interfaz;

import dtos.EmpleadoDTO;
import excepcion.PropsException;
import javax.swing.JTable;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IEmpleadoFCD {
    
    /**
     * Muestra la información de un empleado en la tabla especificada.
     * 
     * @param table La tabla en la que se mostrará la información del empleado.
     * @param id El ID del empleado cuya información se mostrará.
     * @throws PropsException Si ocurre un error al obtener la información del empleado.
     */
    public void tablaEmpleado(JTable table, int id) throws PropsException;
    
    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return El objeto EmpleadoDTO que representa al empleado encontrado.
     * @throws PropsException Si ocurre un error al buscar el empleado por su ID.
     */
    public EmpleadoDTO buscarPorID(int id) throws PropsException;
    
}
