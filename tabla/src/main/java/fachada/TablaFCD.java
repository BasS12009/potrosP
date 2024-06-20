/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import control.TablaCTL;
import excepciones.ControlException;
import excepciones.FachadaException;
import interfaz.ITablaFCD;
import javax.swing.JTable;

/**
 * Clase TablaFCD que implementa la interfaz ITablaFCD.
 * Actúa como una fachada para manejar operaciones relacionadas con tablas de empleados.
 * 
 * Autor: skevi
 */
public class TablaFCD implements ITablaFCD {

    private TablaCTL tabla;

    /**
     * Constructor de TablaFCD que inicializa la instancia de TablaCTL.
     */
    public TablaFCD() {
        this.tabla = new TablaCTL();
    }

    /**
     * Método que muestra la tabla de empleados en un JTable específico.
     * 
     * @param table El JTable donde se mostrará la tabla de empleados.
     * @param id El identificador del empleado.
     * @throws FachadaException Si ocurre un error específico de fachada al mostrar la tabla.
     */
    @Override
    public void tablaEmpleado(JTable table, int id) throws FachadaException {
        try {
            tabla.tablaEmpleado(table, id); // Llama al método correspondiente de TablaCTL
        } catch (ControlException ex) {
            throw new FachadaException(ex.getMessage()); // Captura y relanza como FachadaException
        }
    }
}

