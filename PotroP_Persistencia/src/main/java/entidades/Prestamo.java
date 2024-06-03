/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.Date;



/**
 *
 * @author caarl
 */
public class Prestamo {
    private int id;
    private String motivo;
    private LocalDate Inicio;
    private LocalDate Fin;
    private Vehiculo vehiculo;

    public Prestamo() {
    }

    public Prestamo(String motivo, LocalDate Inicio, LocalDate Fin, Vehiculo vehiculo) {
        this.motivo = motivo;
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.vehiculo = vehiculo;
    }

    public Prestamo(int id, String motivo, LocalDate Inicio, LocalDate Fin, Vehiculo vehiculo) {
        this.id = id;
        this.motivo = motivo;
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.vehiculo = vehiculo;
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

    public LocalDate getFechaInicio() {
        return Inicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.Inicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return Fin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.Fin = fechaFin;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
