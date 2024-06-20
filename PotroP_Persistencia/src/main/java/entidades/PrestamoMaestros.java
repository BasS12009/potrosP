/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author caarl
 */





public class PrestamoMaestros {
    private String id; // Para MongoDB, usualmente se usa String para el ID
    private Maestro responsable;
    private String correoResponsable;
    private int cantidadPersonas;
    private List<String> acompaniantes;
    private String vehiculo;
    private String plantelOrigen;
    private String plantelDestino;
    private LocalDate fecha;
    private String Motivo;

    // Constructor por defecto
    public PrestamoMaestros() {
    }

    // Constructor con todos los campos
    public PrestamoMaestros(String id, Maestro responsable, String correoResponsable, 
                            int cantidadPersonas, List<String> acompaniantes, 
                            String vehiculo, String plantelOrigen, 
                            String plantelDestino, LocalDate fecha,String Motivo) {
        this.id = id;
        this.responsable = responsable;
        this.correoResponsable = correoResponsable;
        this.cantidadPersonas = cantidadPersonas;
        this.acompaniantes = acompaniantes;
        this.vehiculo = vehiculo;
        this.plantelOrigen = plantelOrigen;
        this.plantelDestino = plantelDestino;
        this.fecha = fecha;
        this.Motivo=Motivo;
    }
    

    // Getters y setters
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Maestro getResponsable() {
        return responsable;
    }

    public void setResponsable(Maestro responsable) {
        this.responsable = responsable;
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
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    @Override
    public String toString() {
        return "PrestamoMaestros{" + "id=" + id + ", responsable=" + responsable + ", correoResponsable=" + correoResponsable + ", cantidadPersonas=" + cantidadPersonas + ", acompaniantes=" + acompaniantes + ", vehiculo=" + vehiculo + ", plantelOrigen=" + plantelOrigen + ", plantelDestino=" + plantelDestino + ", fecha=" + fecha + ", Motivo=" + Motivo + '}';
    }

    
}