/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMapeo;

import java.time.LocalDate;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class PrestamoMapeo {
     private ObjectId id;
    private String motivo;
    private LocalDate inicio;
    private LocalDate fin;
    private String placaVehiculo;
    private String correoEmpleado;

    public PrestamoMapeo() {
    }

    public PrestamoMapeo(ObjectId id, String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.id = id;
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    public PrestamoMapeo(String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
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
