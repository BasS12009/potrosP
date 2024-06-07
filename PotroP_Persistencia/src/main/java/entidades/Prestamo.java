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
    private int id;
    private String motivo;
    private LocalDate inicio;
    private LocalDate fin;
    private String placaVehiculo;
    private String correoEmpleado;

    public Prestamo() {
    }

    public Prestamo(String motivo, LocalDate Inicio, LocalDate Fin, String placaVehiculo, String correoEmpleado) {
        this.motivo = motivo;
        this.inicio = Inicio;
        this.fin = Fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    public Prestamo(int id, String motivo, LocalDate Inicio, LocalDate Fin, String placaVehiculo, String correoEmpleado) {
        this.id = id;
        this.motivo = motivo;
        this.inicio = Inicio;
        this.fin = Fin;
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
        return inicio;
    }

    public void setInicio(LocalDate Inicio) {
        this.inicio = Inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate Fin) {
        this.fin = Fin;
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
