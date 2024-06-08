/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import Excepcion.NegocioException;
import Interfaz.IEmpleadoFCD;
import control.EmpleadoCTL;
import dtos.EmpleadoDTO;
import excepcion.PropsException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skevi
 */
public class EmpleadoFCD implements IEmpleadoFCD{
    
    EmpleadoCTL empleadoCTL;

    public EmpleadoFCD() {
        this.empleadoCTL = new EmpleadoCTL();
    }

    @Override
    public void tablaEmpleado(JTable table, int id) throws PropsException {
    try {
        EmpleadoDTO empleado = empleadoCTL.buscarPorID(id);

        // Definir columnas
        String[] columnNames = {"ID", "Correo", "Tipo"};

        // Crear modelo de la tabla
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // Crear una fila con los datos del empleado
        Object[] rowData = {empleado.getId(), empleado.getCorreo(), empleado.getTipo()};

        // Añadir la fila al modelo de la tabla
        tableModel.addRow(rowData);

        // Establecer el modelo de la tabla
        table.setModel(tableModel);
    } catch (NegocioException e) {
        throw new PropsException("Error al obtener los datos del empleado.", e);
    }
}

    @Override
    public EmpleadoDTO buscarPorID(int id) throws PropsException {
        try {
            return empleadoCTL.buscarPorID(id);
        } catch (NegocioException ex) {
           throw new PropsException(ex.getMessage());        
        }
    }
    
    
    
    
}
