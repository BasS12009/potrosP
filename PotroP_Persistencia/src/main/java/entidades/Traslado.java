/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDateTime;

public class Traslado {
    
    private String id;
    private String folio;
    private String motivo;
    private int personas;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraRegreso;
    private boolean disponibilidad;
    private Vehiculo vehiculo;
    private VehiculoEntregado vehiculoEntregado;
    private VehiculoDevuelto vehiculoDevuelto;
    private String correoEmpleado;
    private boolean estado;

    public Traslado() {
    }

    public Traslado(String folio, String motivo, int personas, 
            LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, 
            boolean disponibilidad, Vehiculo vehiculo, 
            VehiculoEntregado vehiculoEntregado, VehiculoDevuelto vehiculoDevuelto, 
            String correoEmpleado, boolean estado) {
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
        this.estado = estado;
    }

    public Traslado(String id, String folio, String motivo, int personas, 
            LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, 
            boolean disponibilidad, Vehiculo vehiculo, 
            VehiculoEntregado vehiculoEntregado, VehiculoDevuelto vehiculoDevuelto, 
            String correoEmpleado, boolean estado) {
        this.id = id;
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
        this.estado = estado;
    }

    

    // Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public VehiculoEntregado getVehiculoEntregado() {
        return vehiculoEntregado;
    }

    public void setVehiculoEntregado(VehiculoEntregado vehiculoEntregado) {
        this.vehiculoEntregado = vehiculoEntregado;
    }

    public VehiculoDevuelto getVehiculoDevuelto() {
        return vehiculoDevuelto;
    }

    public void setVehiculoDevuelto(VehiculoDevuelto vehiculoDevuelto) {
        this.vehiculoDevuelto = vehiculoDevuelto;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Traslado{" +
                "id='" + id + '\'' +
                ", folio='" + folio + '\'' +
                ", motivo='" + motivo + '\'' +
                ", personas=" + personas +
                ", fechaHoraSalida=" + fechaHoraSalida +
                ", fechaHoraRegreso=" + fechaHoraRegreso +
                ", disponibilidad=" + disponibilidad +
                ", vehiculo=" + vehiculo +
                ", vehiculoEntregado=" + vehiculoEntregado +
                ", vehiculoDevuelto=" + vehiculoDevuelto +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", estado=" + estado +
                '}';
    }
}