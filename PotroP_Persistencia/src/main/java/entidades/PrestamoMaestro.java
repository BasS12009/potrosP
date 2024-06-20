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


public class PrestamoMaestro {
    private String motivo;
    private LocalDate fechaPrestamo;
    private int cantidadPersonas;
    private String plantelOrigen;
    private String plantelDestino;
    private String CorreoResponsable;
    private String acompaniante1;
    private String acompaniante2;
    private String acompaniante3;
    private String acompaniante4;
    private String departamento;

    // Constructor por defecto
    public PrestamoMaestro() {
    }

    // Constructor con parámetros
    public PrestamoMaestro(String motivo, LocalDate fechaPrestamo, int cantidadPersonas, String plantelOrigen, String plantelDestino,
                           String idResponsable, String acompaniante1, String acompaniante2, String acompaniante3, String acompaniante4,
                           String departamento) {
        this.motivo = motivo;
        this.fechaPrestamo = fechaPrestamo;
        this.cantidadPersonas = cantidadPersonas;
        this.plantelOrigen = plantelOrigen;
        this.plantelDestino = plantelDestino;
        this.CorreoResponsable = CorreoResponsable;
        this.acompaniante1 = acompaniante1;
        this.acompaniante2 = acompaniante2;
        this.acompaniante3 = acompaniante3;
        this.acompaniante4 = acompaniante4;
        this.departamento = departamento;
    }

    // Getters y Setters
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
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

    public String getCorreoResponsable() {
        return CorreoResponsable;
    }

    public void setCorreoResponsable(String CorreoResponsable) {
        this.CorreoResponsable = CorreoResponsable;
    }

    public String getAcompaniante1() {
        return acompaniante1;
    }

    public void setAcompaniante1(String acompaniante1) {
        this.acompaniante1 = acompaniante1;
    }

    public String getAcompaniante2() {
        return acompaniante2;
    }

    public void setAcompaniante2(String acompaniante2) {
        this.acompaniante2 = acompaniante2;
    }

    public String getAcompaniante3() {
        return acompaniante3;
    }

    public void setAcompaniante3(String acompaniante3) {
        this.acompaniante3 = acompaniante3;
    }

    public String getAcompaniante4() {
        return acompaniante4;
    }

    public void setAcompaniante4(String acompaniante4) {
        this.acompaniante4 = acompaniante4;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "PrestamoMaestro{" + "motivo=" + motivo + ", fechaPrestamo=" + fechaPrestamo + ", cantidadPersonas=" + cantidadPersonas + ", plantelOrigen=" + plantelOrigen + ", plantelDestino=" + plantelDestino + ", CorreoResponsable=" + CorreoResponsable + ", acompaniante1=" + acompaniante1 + ", acompaniante2=" + acompaniante2 + ", acompaniante3=" + acompaniante3 + ", acompaniante4=" + acompaniante4 + ", departamento=" + departamento + '}';
    }

    public void setCantPersonas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}