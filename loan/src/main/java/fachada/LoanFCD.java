/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import DTO.PrestamoDTO;
import Exceptions.BisnessException;
import control.LoanCTL;
import excepcion.LoanException;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import interfaz.ILoanFCD;

/**
 *
 * @author skevi
 */
public class LoanFCD implements ILoanFCD{

    private LoanCTL control;

    public LoanFCD() {
        this.control = new LoanCTL();
    }
    
    @Override
    public void agregar(PrestamoDTO prestamoDTO) throws LoanException {
        try {
            control.agregar(prestamoDTO);
        } catch (BisnessException ex) {
            System.out.println(ex.getMessage());;
        }
    }

    @Override
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws LoanException {
        try {
            
            List<PrestamoDTO> libros = control.listaPaginada(offset, limit);

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

    @Override
    public boolean disponibilidadEmpleado(LocalDate begin, LocalDate end, String correo) throws LoanException {
        try {
            boolean disponible = true; // Inicializar como disponible
        
            List<PrestamoDTO> lista = control.listaPorFechas(begin, end);
        
            for (PrestamoDTO prestamo : lista) {
                if (prestamo.getCorreoEmpleado().equalsIgnoreCase(correo)) {
                    disponible = false; // Si hay algún préstamo en el rango de fechas para el correo, no está disponible
                    break; // No es necesario seguir buscando
            }
        }
        
        return disponible;
        
    } catch (BisnessException ex) {
        System.out.println(ex.getMessage());
        throw new LoanException("Error al validar la disponibilidad", ex); // Lanzar una excepción personalizada
    }
    }


    @Override
    public boolean validarDatos(PrestamoDTO prestamoDTO) throws LoanException {
       String correo = prestamoDTO.getCorreoEmpleado().trim();
       String motivo = prestamoDTO.getMotivo().trim();
       LocalDate inicio = prestamoDTO.getInicio();
       LocalDate fin = prestamoDTO.getFin();
       String placaVehiculo = prestamoDTO.getPlacaVehiculo().trim();

       LocalDate hoy = LocalDate.now();

       if (correo.isEmpty()) {
          throw new LoanException("Por favor, llene el campo de correo.");
       }
       if (motivo.isEmpty()) {
          throw new LoanException("Por favor, llene el campo del motivo.");
       }
       if (inicio == null) {
          throw new LoanException("Por favor, seleccione una fecha de inicio.");
       }
       if (fin == null) {
          throw new LoanException("Por favor, seleccione una fecha de regreso.");
       }
       if (inicio.isBefore(hoy)) {
          throw new LoanException("La fecha de inicio no puede ser anterior a la fecha actual.");
       }
       if (fin.isBefore(inicio)) {
          throw new LoanException("La fecha de regreso no puede ser anterior a la fecha de inicio.");
       }
       if (placaVehiculo.isEmpty()) {
          throw new LoanException("Por favor, seleccione un vehículo.");
       }
       
       return true;
}


    @Override
    public boolean disponibilidadVehiculo(LocalDate begin, LocalDate end, String placa) throws LoanException {
        try {
            boolean disponible = true; // Inicializar como disponible
        
            List<PrestamoDTO> lista = control.listaPorFechas(begin, end);
        
            for (PrestamoDTO prestamo : lista) {
                if (prestamo.getPlacaVehiculo().equalsIgnoreCase(placa)) {
                    disponible = false; // Si hay algún préstamo en el rango de fechas para el correo, no está disponible
                    break; // No es necesario seguir buscando
            }
        }
        
           return disponible;
        
       } catch (BisnessException ex) {
           System.out.println(ex.getMessage());
           throw new LoanException("Error al validar la disponibilidad", ex); // Lanzar una excepción personalizada
       }
    }
    
}
