/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import BO.PrestamoBO;
import DTO.PrestamoDTO;
import Exceptions.BisnessException;
import excepcion.LoanException;
import interfaces.IPrestamoBO;
import interfaz.ILoan;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skevi
 */
public class Loan implements ILoan{

    private IPrestamoBO prestamoBO;

    public Loan() {
        this.prestamoBO = new PrestamoBO();
    }
    
    @Override
    public void agregar(PrestamoDTO prestamoDTO) throws LoanException {
        
    }

    @Override
    public void llenarTablaHistorial(JTable tabla) throws LoanException {
        try {
            
            List<PrestamoDTO> libros = prestamoBO.listaPrestamos();

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
        } catch (BisnessException e) {
            throw new LoanException("Error al obtener la lista de Prestamos.");
        }
    }

    @Override
    public void llenarCBX(JComboBox comboBox) throws LoanException {
        
    }

    @Override
    public void llenarTablaAdmin(JComboBox comboBox) throws LoanException {
        
    }

    @Override
    public boolean validarDisponibilidad(LocalDate begin, LocalDate end) throws LoanException {
        return true;
    }
    
}
