/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import excepciones.FachadaException;
import javax.swing.JTable;

/**
 * Interfaz ITablaFCD que define la operación para mostrar la tabla de empleados en un JTable.
 * 
 * Autor: skevi
 */
public interface ITablaFCD {
    
    /**
     * Método que muestra la tabla de empleados en un JTable específico.
     * 
     * @param table El JTable donde se mostrará la tabla de empleados.
     * @param id El identificador del empleado.
     * @throws FachadaException Si ocurre un error específico de fachada al mostrar la tabla.
     */
    public void tablaEmpleado(JTable table, int id) throws FachadaException;
    
}

