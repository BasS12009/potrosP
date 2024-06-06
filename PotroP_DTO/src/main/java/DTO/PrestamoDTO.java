/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author diana
 */
public class PrestamoDTO {
    
    private int id;
    private String motivo;
    private LocalDate Inicio;
    private LocalDate Fin;
    private String placaVehiculo;
    private String correoEmpleado;

    public PrestamoDTO() {
    }

    public PrestamoDTO(String motivo, LocalDate Inicio, LocalDate Fin, String placaVehiculo, String correoEmpleado) {
        this.motivo = motivo;
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    public PrestamoDTO(int id, String motivo, LocalDate Inicio, LocalDate Fin, String placaVehiculo, String correoEmpleado) {
        this.id = id;
        this.motivo = motivo;
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getInicio() {
        return Inicio;
    }

    public void setInicio(LocalDate Inicio) {
        this.Inicio = Inicio;
    }

    public LocalDate getFin() {
        return Fin;
    }

    public void setFin(LocalDate Fin) {
        this.Fin = Fin;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    
}