/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.time.LocalDateTime;

/**
 *
 * @author diana
 */
public class TrasladoDTO {
    
    private String folio;
    private String motivo;
    private int personas;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraRegreso;
    private boolean disponibilidad;
    private VehiculoDTO vehiculo;
    private VehiculoEntregadoDTO vehiculoEntregado;
    private VehiculoDevueltoDTO vehiculoDevuelto;
    private String correoEmpleado;
    private String correoChofer;
    private boolean estado;


    public TrasladoDTO() {
    }

    public TrasladoDTO(String folio, String motivo, int personas, 
            LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, 
            boolean disponibilidad, VehiculoDTO vehiculo, 
            VehiculoEntregadoDTO vehiculoEntregado, 
            VehiculoDevueltoDTO vehiculoDevuelto, 
            String correoEmpleado, String correoChofer, boolean estado) {
        this.folio = folio;
        this.motivo = motivo;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.disponibilidad = disponibilidad;
        this.vehiculo = vehiculo;
        this.vehiculoEntregado = vehiculoEntregado;
        this.vehiculoDevuelto = vehiculoDevuelto;
        this.correoEmpleado = correoEmpleado;
        this.correoChofer = correoChofer;
        this.estado = estado;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public LocalDateTime getFechaHoraRegreso() {
        return fechaHoraRegreso;
    }

    public void setFechaHoraRegreso(LocalDateTime fechaHoraRegreso) {
        this.fechaHoraRegreso = fechaHoraRegreso;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

    public VehiculoEntregadoDTO getVehiculoEntregado() {
        return vehiculoEntregado;
    }

    public void setVehiculoEntregado(VehiculoEntregadoDTO vehiculoEntregado) {
        this.vehiculoEntregado = vehiculoEntregado;
    }

    public VehiculoDevueltoDTO getVehiculoDevuelto() {
        return vehiculoDevuelto;
    }

    public void setVehiculoDevuelto(VehiculoDevueltoDTO vehiculoDevuelto) {
        this.vehiculoDevuelto = vehiculoDevuelto;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getCorreoChofer() {
        return correoChofer;
    }

    public void setCorreoChofer(String correoChofer) {
        this.correoChofer = correoChofer;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
}