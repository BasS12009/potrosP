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
 * Clase HistorialCTL que maneja la lógica de presentación de datos históricos de préstamos en una tabla.
 * 
 * Autor: skevi
 */
public class HistorialCTL {
    
    private IPrestamoBO prestamo; // Dependencia del objeto de negocio para préstamos

    /**
     * Constructor de HistorialCTL que inicializa la instancia de PrestamoBO.
     */
    public HistorialCTL() {
        this.prestamo = new PrestamoBO();
    }
    
    /**
     * Método para llenar una tabla con datos históricos de préstamos.
     * 
     * @param tabla El JTable donde se mostrarán los datos.
     * @param offset Índice de inicio de la paginación.
     * @param limit Número máximo de registros por página.
     * @throws ControlException Si ocurre un error específico de control al llenar la tabla.
     */
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws ControlException {
        try {
            // Obtener la lista paginada de préstamos desde el objeto de negocio
            List<PrestamoDTO> prestamos = prestamo.listaPaginda(offset, limit);

            // Definir nombres de columnas para la tabla
            String[] columnNames = {"ID", "Inicio", "Fin", "Placa Vehiculo", "Correo Empleado"};
            
            // Crear modelo de tabla con las columnas definidas
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Llenar la tabla con los datos de préstamos obtenidos
            for (PrestamoDTO prestamo : prestamos) {
                Object[] rowData = {
                    prestamo.getId(),
                    prestamo.getInicio(),
                    prestamo.getFin(),
                    prestamo.getPlacaVehiculo(),
                    prestamo.getCorreoEmpleado()
                };
                tableModel.addRow(rowData); // Agregar cada fila al modelo de la tabla
            }

            // Establecer el modelo de la tabla con los datos cargados
            tabla.setModel(tableModel);
            
        } catch (BisnessException ex) {
            // Capturar excepción de negocio y manejarla imprimiendo el mensaje
            System.out.println(ex.getMessage());
            throw new ControlException("Error al llenar la tabla de historial", ex);
        }
    }
}

