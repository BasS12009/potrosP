/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import DTO.PrestamoDTO;
import bo.PrestamoBO;
import excepcion.ControlException;
import exceptions.BisnessException;
import interfaces.IPrestamoBO;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author skevi
 */
public class LoanCTL {
    
    private IPrestamoBO prestamoBO;

    public LoanCTL() {
        this.prestamoBO = new PrestamoBO();
    }
    

    public void agregar(PrestamoDTO prestamoDTO) throws ControlException {
        try {
            prestamoBO.agregar(prestamoDTO);
        } catch (BisnessException ex) {
            System.out.println(ex.getMessage());;
        }
    }
    
    
    public boolean disponibilidadEmpleado(LocalDate begin, LocalDate end, String correo) throws ControlException {
        
        try {
            boolean disponible = true; // Inicializar como disponible
        
            List<PrestamoDTO> lista = prestamoBO.listaPorFechas(begin, end);
        
            for (PrestamoDTO prestamo : lista) {
                if (prestamo.getCorreoEmpleado().equalsIgnoreCase(correo)) {
                    disponible = false; // Si hay algún préstamo en el rango de fechas para el correo, no está disponible
                    break; // No es necesario seguir buscando
            }
        }
        
        return disponible;
        
    } catch (BisnessException ex) {
        System.out.println(ex.getMessage());
        throw new ControlException("Error al validar la disponibilidad", ex); // Lanzar una excepción personalizada
    }
    }


    public boolean validarDatos(PrestamoDTO prestamoDTO) throws ControlException {
       String correo = prestamoDTO.getCorreoEmpleado().trim();
       String motivo = prestamoDTO.getMotivo().trim();
       LocalDate inicio = prestamoDTO.getInicio();
       LocalDate fin = prestamoDTO.getFin();
       String placaVehiculo = prestamoDTO.getPlacaVehiculo().trim();

       LocalDate hoy = LocalDate.now();

       if (correo.isEmpty()) {
          throw new ControlException("Por favor, llene el campo de correo.");
       }
       if (motivo.isEmpty()) {
          throw new ControlException("Por favor, llene el campo del motivo.");
       }
       if (inicio == null) {
          throw new ControlException("Por favor, seleccione una fecha de inicio.");
       }
       if (fin == null) {
          throw new ControlException("Por favor, seleccione una fecha de regreso.");
       }
       if (inicio.isBefore(hoy)) {
          throw new ControlException("La fecha de inicio no puede ser anterior a la fecha actual.");
       }
       if (fin.isBefore(inicio)) {
          throw new ControlException("La fecha de regreso no puede ser anterior a la fecha de inicio.");
       }
       if (placaVehiculo.isEmpty()) {
          throw new ControlException("Por favor, seleccione un vehículo.");
       }
       
       return true;
    }


    
    public boolean disponibilidadVehiculo(LocalDate begin, LocalDate end, String placa) throws ControlException {
        try {
            boolean disponible = true; // Inicializar como disponible
        
            List<PrestamoDTO> lista = prestamoBO.listaPorFechas(begin, end);
        
            for (PrestamoDTO prestamo : lista) {
                if (prestamo.getPlacaVehiculo().equalsIgnoreCase(placa)) {
                    disponible = false; // Si hay algún préstamo en el rango de fechas para el correo, no está disponible
                    break; // No es necesario seguir buscando
            }
        }
        
           return disponible;
        
       } catch (BisnessException ex) {
           System.out.println(ex.getMessage());
           throw new ControlException("Error al validar la disponibilidad", ex); // Lanzar una excepción personalizada
       }
    }
   
    
 }   
