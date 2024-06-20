/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author caarl
 */




public class PrestamoMaestrosDTO {
    private String id;
    private String nombreResponsable;
    private String correoResponsable;
    private int cantidadPersonas;
    private List<String> acompaniantes;
    private String vehiculo;
    private String plantelOrigen;
    private String plantelDestino;
    private LocalDate fecha;
    private String motivo;

    // Constructor
    public PrestamoMaestrosDTO() {}

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getCorreoResponsable() {
        return correoResponsable;
    }

    public void setCorreoResponsable(String correoResponsable) {
        this.correoResponsable = correoResponsable;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public List<String> getAcompaniantes() {
        return acompaniantes;
    }

    public void setAcompaniantes(List<String> acompaniantes) {
        this.acompaniantes = acompaniantes;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPlantelOrigen() {
        return plantelOrigen;
    }

    public void setPlantelOrigen(String plantelOrigen) {
        this.plantelOrigen = plantelOrigen;
    }

    public String getPlantelDestino() {
        return plantelDestino;
    }

    public void setPlantelDestino(String plantelDestino) {
        this.plantelDestino = plantelDestino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}