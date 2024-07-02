/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMapeo;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class PrestamoMaestrosMapeo {
     private ObjectId id;
    private LocalDate fechaPrestamo;
    private String departamento;
    private int cantidadPersonas;
    private String motivo;
    private String plantelOrigen;
    private String plantelDestino;
    private String vehiculo;
    private String correoResponsable;
    private List<String> acompaniantes;

    // Constructor, getters y setters
    public PrestamoMaestrosMapeo() {
    }

    public PrestamoMaestrosMapeo(ObjectId id, LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, String vehiculo, String correoResponsable, List<String> acompaniantes) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.departamento = departamento;
        this.cantidadPersonas = cantidadPersonas;
        this.motivo = motivo;
        this.plantelOrigen = plantelOrigen;
        this.plantelDestino = plantelDestino;
        this.vehiculo = vehiculo;
        this.correoResponsable = correoResponsable;
        this.acompaniantes = acompaniantes;
    }

    public PrestamoMaestrosMapeo(LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, String vehiculo, String correoResponsable, List<String> acompaniantes) {
        this.fechaPrestamo = fechaPrestamo;
        this.departamento = departamento;
        this.cantidadPersonas = cantidadPersonas;
        this.motivo = motivo;
        this.plantelOrigen = plantelOrigen;
        this.plantelDestino = plantelDestino;
        this.vehiculo = vehiculo;
        this.correoResponsable = correoResponsable;
        this.acompaniantes = acompaniantes;
    }

  

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    

    public String getCorreoResponsable() {
        return correoResponsable;
    }

    public void setCorreoResponsable(String correoResponsable) {
        this.correoResponsable = correoResponsable;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

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

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
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

}
