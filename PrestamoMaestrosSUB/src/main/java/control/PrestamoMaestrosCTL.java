/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.PrestamoDTO;
import dtos.PrestamoMaestrosDTO;
import bo.PrestamoBO;
import bo.PrestamoMaestrosBO;
import bo.VehiculoBO;
import excepcion.ControlException;
import exceptions.BisnessException;
import interfaces.IPrestamoBO;
import interfaces.IPrestamoMaestrosBO;
import interfaces.IVehiculoBO;

import java.time.LocalDate;
import java.util.List;

public class PrestamoMaestrosCTL {
    
    private final IPrestamoBO prestamoBO;
    private final IPrestamoMaestrosBO prestamoMaestrosBO;
    private final IVehiculoBO vehiculoBO;

    public PrestamoMaestrosCTL() {
        this.prestamoBO = new PrestamoBO();
        this.prestamoMaestrosBO = new PrestamoMaestrosBO();
        this.vehiculoBO = new VehiculoBO();
    }

    
    public void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws ControlException, BisnessException {
        try {
            prestamoMaestrosBO.agregar(prestamoMaestrosDTO);
        } catch (BisnessException ex) {
            throw new ControlException("Error al agregar el préstamo de maestros: " + ex.getMessage());
        }
    }

    public void eliminar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws ControlException, BisnessException {
        try {
            prestamoMaestrosBO.eliminar(prestamoMaestrosDTO);
        } catch (BisnessException ex) {
            throw new ControlException("Error al eliminar el préstamo de maestros: " + ex.getMessage());
        }
    }

    public void actualizar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws ControlException, BisnessException {
        try {
            prestamoMaestrosBO.actualizar(prestamoMaestrosDTO);
        } catch (BisnessException ex) {
            throw new ControlException("Error al actualizar el préstamo de maestros: " + ex.getMessage());
        }
    }

    public PrestamoMaestrosDTO buscarPorId(int id) throws ControlException, BisnessException {
        try {
            return prestamoMaestrosBO.buscarPorId(id);
        } catch (BisnessException ex) {
            throw new ControlException("Error al buscar el préstamo de maestros: " + ex.getMessage());
        }
    }

    public List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws ControlException, BisnessException {
        try {
            return prestamoMaestrosBO.listaPrestamosMaestros();
        } catch (BisnessException ex) {
            throw new ControlException("Error al obtener la lista de préstamos de maestros: " + ex.getMessage());
        }
    }

    public boolean validarDatos(PrestamoMaestrosDTO prestamoMaestrosDTO) throws ControlException {
        if (prestamoMaestrosDTO.getDepartamento().trim().isEmpty()) {
            throw new ControlException("El departamento no puede estar vacío.");
        }
        if (prestamoMaestrosDTO.getCantidadPersonas() <= 0) {
            throw new ControlException("La cantidad de personas debe ser mayor que cero.");
        }
        if (prestamoMaestrosDTO.getMotivo().trim().isEmpty()) {
            throw new ControlException("El motivo no puede estar vacío.");
        }
        if (prestamoMaestrosDTO.getPlantelOrigen().trim().isEmpty()) {
            throw new ControlException("El plantel de origen no puede estar vacío.");
        }
        if (prestamoMaestrosDTO.getPlantelDestino().trim().isEmpty()) {
            throw new ControlException("El plantel de destino no puede estar vacío.");
        }
        if (prestamoMaestrosDTO.getVehiculo().trim().isEmpty()) {
            throw new ControlException("El vehículo no puede estar vacío.");
        }
        if (prestamoMaestrosDTO.getCorreoResponsable().trim().isEmpty()) {
            throw new ControlException("El correo del responsable no puede estar vacío.");
        }
        if (prestamoMaestrosDTO.getFechaPrestamo().isBefore(LocalDate.now())) {
            throw new ControlException("La fecha del préstamo no puede ser anterior a la fecha actual.");
        }
        return true;
    }
    
    public boolean disponibilidadVehiculo(LocalDate begin, LocalDate end, String placa) throws ControlException {
        try {
            List<PrestamoMaestrosDTO> listaProfes = prestamoMaestrosBO.listaPrestamosMaestros();
            List<PrestamoDTO> listaOriginal = prestamoBO.listaPorFechas(begin, end);

            boolean profes = false;
            boolean original = false;

            for (PrestamoMaestrosDTO profesDTO : listaProfes) {
                if (profesDTO.getVehiculo().equalsIgnoreCase(placa)) {
                    profes = true;
                    break;
                }
            }

            for (PrestamoDTO originalDTO : listaOriginal) {
                if (originalDTO.getPlacaVehiculo().equalsIgnoreCase(placa)) {
                    original = true;
                    break;
                }
            }

            if (profes && original) {
                return true;
            } else {
                throw new ControlException
                ("El automovil no esta disponible en las fechas seleccionadas"); 
            }
            
        } catch (BisnessException ex) {
            System.out.println(ex.getMessage());
            throw new ControlException("Error al validar la disponibilidad", ex); // Lanzar una excepción personalizada
        }
    }

    
    
}