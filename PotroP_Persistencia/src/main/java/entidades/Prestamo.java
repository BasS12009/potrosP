/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author caarl
 */
public class Prestamo {
    private String id;
    private String motivo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String tipoVehiculo;
    private String nombreSolicitante;
    private String rutSolicitante;
    private Vehiculo vehiculo;
    
    // Constructores
    public Prestamo(String id, String motivo, LocalDate fechaInicio, LocalDate fechaFin,
                    String tipoVehiculo, String nombreSolicitante, String rutSolicitante, Vehiculo vehiculo) {
        this.id = id;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoVehiculo = tipoVehiculo;
        this.nombreSolicitante = nombreSolicitante;
        this.rutSolicitante = rutSolicitante;
        this.vehiculo = vehiculo;
    }

    public Prestamo() {
    }
    
    
    
    // Getters y Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public String getNombreSolicitante() {
        return nombreSolicitante;
    }
    
    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }
    
    public String getRutSolicitante() {
        return rutSolicitante;
    }
    
    public void setRutSolicitante(String rutSolicitante) {
        this.rutSolicitante = rutSolicitante;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
