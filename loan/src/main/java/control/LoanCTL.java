/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.PrestamoDTO;
import bo.PrestamoBO;
import entidades.Prestamo;
import excepcion.ControlException;
import excepciones.DAOException;
import exceptions.BisnessException;
import interfaces.IPrestamoBO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase LoanCTL que actúa como controlador para la lógica de negocios de préstamos.
 * Proporciona métodos para agregar préstamos, validar datos, y verificar la disponibilidad de empleados y vehículos.
 * 
 * Autor: skevi
 */
public class LoanCTL {

    // Referencia a la capa de lógica de negocio de préstamos
    private final IPrestamoBO prestamoBO;

    /**
     * Constructor de la clase LoanCTL.
     * Inicializa la referencia a la lógica de negocio de préstamos.
     */
    public LoanCTL() {
        this.prestamoBO = new PrestamoBO();
    }

    /**
     * Agrega un nuevo préstamo.
     * 
     * @param prestamoDTO El objeto PrestamoDTO que contiene los datos del préstamo.
     * @throws ControlException Si ocurre un error en la capa de control.
     */
    public void agregar(PrestamoDTO prestamoDTO) throws ControlException {
        try {
            prestamoBO.agregar(prestamoDTO);
        } catch (BisnessException ex) {
            System.out.println(ex.getMessage());
            throw new ControlException("Error al agregar el préstamo", ex);
        }
    }

    /**
     * Verifica la disponibilidad de un empleado en un rango de fechas.
     * 
     * @param begin La fecha de inicio del rango.
     * @param end La fecha de fin del rango.
     * @param correo El correo del empleado a verificar.
     * @return boolean true si el empleado está disponible, false en caso contrario.
     * @throws ControlException Si ocurre un error en la capa de control.
     */
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

    /**
     * Valida los datos de un préstamo.
     * 
     * @param prestamoDTO El objeto PrestamoDTO a validar.
     * @return boolean true si los datos son válidos, false en caso contrario.
     * @throws ControlException Si los datos no son válidos.
     */
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

    /**
     * Verifica la disponibilidad de un vehículo en un rango de fechas.
     * 
     * @param begin La fecha de inicio del rango.
     * @param end La fecha de fin del rango.
     * @param placa La placa del vehículo a verificar.
     * @return boolean true si el vehículo está disponible, false en caso contrario.
     * @throws ControlException Si ocurre un error en la capa de control.
     */
    public boolean disponibilidadVehiculo(LocalDate begin, LocalDate end, String placa) throws ControlException {
        try {
            boolean disponible = true; // Inicializar como disponible

            List<PrestamoDTO> lista = prestamoBO.listaPorFechas(begin, end);

            for (PrestamoDTO prestamo : lista) {
                if (prestamo.getPlacaVehiculo().equalsIgnoreCase(placa)) {
                    disponible = false; // Si hay algún préstamo en el rango de fechas para la placa, no está disponible
                    break; // No es necesario seguir buscando
                }
            }

            return disponible;

        } catch (BisnessException ex) {
            System.out.println(ex.getMessage());
            throw new ControlException("Error al validar la disponibilidad", ex); // Lanzar una excepción personalizada
        }
    }
    
 
    public List<PrestamoDTO> obtenerPrestamosPorFechas(LocalDate fechaInicio, LocalDate fechaFin) throws ControlException {
        try {
            // Aquí iría la lógica para obtener los préstamos
            // Por ejemplo, podrías usar un BO o directamente un DAO
            PrestamoBO prestamoBO = new PrestamoBO();
            return prestamoBO.listaPorFechas(fechaInicio, fechaFin);
        } catch (BisnessException ex) {
            throw new ControlException("Error al obtener préstamos por fechas", ex);
        }
    }
}
 
