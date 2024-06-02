/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;



/**
 *
 * @author caarl
 */
public class Prestamo {
    private int id;
    private String motivo;
    private Date fechaInicio;
    private Date fechaFin;
    private Vehiculo vechiculo;
    private Vehiculo vehiculo;

    public Prestamo() {
    }

    public Prestamo(String motivo, Date fechaInicio, Date fechaFin, Vehiculo vechiculo, Vehiculo vehiculo) {
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vechiculo = vechiculo;
        this.vehiculo = vehiculo;
    }

    public Prestamo(int id, String motivo, Date fechaInicio, Date fechaFin, Vehiculo vechiculo, Vehiculo vehiculo) {
        this.id = id;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vechiculo = vechiculo;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Vehiculo getVechiculo() {
        return vechiculo;
    }

    public void setVechiculo(Vehiculo vechiculo) {
        this.vechiculo = vechiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
