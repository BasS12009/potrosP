/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.EmpleadoDTO;
import excepciones.ControlException;
import interfaces.IEmpleadoCTL;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skevi
 */
public class TablaCTL {
    
    //atributo de la clase 
    IEmpleadoCTL empleadoBO;

    /**
     * constructor de la clase
     */
    public TablaCTL() {
        this.empleadoBO = new EmpleadoCTL();
    }
    
    
    public void tablaEmpleado(JTable table, int id) throws ControlException {
        try {
            // Obtener datos del empleado mediante el controlador
            EmpleadoDTO empleado = empleadoBO.buscarEmpleado(id);

            // Definir columnas de la tabla
            String[] columnNames = {"ID", "Correo", "Tipo"};

            // Crear modelo de la tabla
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Crear una fila con los datos del empleado
            Object[] rowData = {empleado.getId(), empleado.getCorreo(), empleado.getTipo()};

            // Añadir la fila al modelo de la tabla
            tableModel.addRow(rowData);

            // Establecer el modelo de la tabla
            table.setModel(tableModel);
        } 
        catch (ControlException e) {
            // Lanzar una PropsException si ocurre un error al obtener los datos del empleado
            throw new ControlException(e.getMessage());
        }
    }
}
