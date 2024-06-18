/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DTO.PrestamoDTO;
import bo.PrestamoBO;
import excepciones.ControlException;
import exceptions.BisnessException;
import interfaces.IPrestamoBO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skevi
 */
public class HistorialCTL {
    
    IPrestamoBO prestamo;

    public HistorialCTL() {
        this.prestamo = new PrestamoBO();
    }
    
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws ControlException{
        try {
            
            List<PrestamoDTO> libros = prestamo.listaPaginda(offset, limit);

            // Definir columnas
            String[] columnNames = {"ID", "Inicio", "Fin", "Placa Vehiculo", "Correo Empleado"};
            
            // Crear modelo de la tabla
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Llenar la tabla con los datos de libros
            for (PrestamoDTO prestamo : libros) {
                Object[] rowData = {
                    prestamo.getId(),
                    prestamo.getInicio(),
                    prestamo.getInicio(),
                    prestamo.getFin(),
                    prestamo.getPlacaVehiculo(),
                    prestamo.getCorreoEmpleado()
                };
                tableModel.addRow(rowData);
            }

            // Establecer el modelo de la tabla
            tabla.setModel(tableModel);
        } catch (BisnessException ex) {
            System.out.println(ex.getMessage());;
        }
    }
    
}
