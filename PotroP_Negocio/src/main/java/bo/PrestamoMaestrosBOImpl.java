/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import Interfaces.IPrestamoMaestrosDAO;
import entidades.PrestamoMaestros;
import interfaces.IPrestamoMaestrosBO;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author caarl
 */
public class PrestamoMaestrosBOImpl implements IPrestamoMaestrosBO {

    private final IPrestamoMaestrosDAO prestamoMaestrosDAO;

    public PrestamoMaestrosBOImpl(IPrestamoMaestrosDAO prestamoMaestrosDAO) {
        this.prestamoMaestrosDAO = prestamoMaestrosDAO;
    }

    @Override
    public PrestamoMaestros obtenerPrestamoPorId(String id) {
        return prestamoMaestrosDAO.findById(id);
    }

    @Override
    public List<PrestamoMaestros> obtenerTodosLosPrestamos() {
        return prestamoMaestrosDAO.findAll();
    }

    @Override
    public void actualizarPrestamo(PrestamoMaestros prestamo) {
        // Aquí puedes agregar validaciones antes de actualizar
        prestamoMaestrosDAO.update(prestamo);
    }

    @Override
    public void eliminarPrestamo(String id) {
        prestamoMaestrosDAO.delete(id);
    }

    @Override
    public List<PrestamoMaestros> buscarPrestamosPorResponsable(String idResponsable) {
        return obtenerTodosLosPrestamos().stream()
                .filter(p -> p.getCorreoResponsable() .equals(idResponsable))
                .collect(Collectors.toList());
    }

    @Override
    public List<PrestamoMaestros> buscarPrestamosPorFecha(LocalDate fecha) {
        return obtenerTodosLosPrestamos().stream()
                .filter(p -> p.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }

    @Override
    public String guardarPrestamo(PrestamoMaestros prestamo) {
        // Validaciones
        if (prestamo == null) {
            throw new IllegalArgumentException("El préstamo no puede ser nulo");
        }
        
        if (prestamo.getResponsable() == null) {
            throw new IllegalArgumentException("El préstamo debe tener un responsable");
        }
        
        if (prestamo.getFecha() == null) {
            throw new IllegalArgumentException("El préstamo debe tener una fecha");
        }
        
        if (prestamo.getFecha().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha del préstamo no puede ser anterior a la fecha actual");
        }
        
        if (prestamo.getCantidadPersonas() <= 0) {
            throw new IllegalArgumentException("La cantidad de personas debe ser mayor que cero");
        }
        
        if (prestamo.getPlantelOrigen() == null || prestamo.getPlantelOrigen().isEmpty()) {
            throw new IllegalArgumentException("El plantel de origen no puede estar vacío");
        }
        
        if (prestamo.getPlantelDestino() == null || prestamo.getPlantelDestino().isEmpty()) {
            throw new IllegalArgumentException("El plantel de destino no puede estar vacío");
        }
        
        if (prestamo.getMotivo() == null || prestamo.getMotivo().isEmpty()) {
            throw new IllegalArgumentException("El motivo del préstamo no puede estar vacío");
        }

        // Si el préstamo no tiene ID, generamos uno
        if (prestamo.getId() == null || prestamo.getId().isEmpty()) {
            prestamo.setId(UUID.randomUUID().toString());
        }

        // Lógica adicional si es necesaria
        // Por ejemplo, podrías querer verificar si hay conflictos con otros préstamos en la misma fecha

        // Guardar el préstamo
        String id = prestamoMaestrosDAO.save(prestamo);

        // Aquí podrías agregar lógica adicional post-guardado si fuera necesario
        // Por ejemplo, enviar una notificación, actualizar estadísticas, etc.

        return id;
    }
}