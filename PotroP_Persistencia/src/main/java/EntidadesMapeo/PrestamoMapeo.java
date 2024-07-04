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
/**
 * La clase PrestamoMapeo representa un préstamo con atributos específicos y un identificador ObjectId.
 * Es utilizada para mapear los datos de un préstamo en un contexto de persistencia o mapeo de objetos.
 */
public class PrestamoMapeo {
    
     private ObjectId id;
    private String motivo;
    private LocalDate inicio;
    private LocalDate fin;
    private String placaVehiculo;
    private String correoEmpleado;
    private VehiculoMapeo vehiculo;

    public PrestamoMapeo() {
    }

    public PrestamoMapeo(ObjectId id, String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado, VehiculoMapeo vehiculo) {
        this.id = id;
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
        this.vehiculo = vehiculo;
    }

    public PrestamoMapeo(String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado, VehiculoMapeo vehiculo) {
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
        this.vehiculo = vehiculo;
    }

    public VehiculoMapeo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoMapeo vehiculo) {
        this.vehiculo = vehiculo;
    }

    

    
    /**
     * Obtiene el identificador único del préstamo.
     * 
     * @return El identificador único del préstamo
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del préstamo.
     * 
     * @param id El identificador único del préstamo
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el motivo del préstamo.
     * 
     * @return El motivo del préstamo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo del préstamo.
     * 
     * @param motivo El motivo del préstamo
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene la fecha de inicio del préstamo.
     * 
     * @return La fecha de inicio del préstamo
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * Establece la fecha de inicio del préstamo.
     * 
     * @param inicio La fecha de inicio del préstamo
     */
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    /**
     * Obtiene la fecha de fin del préstamo.
     * 
     * @return La fecha de fin del préstamo
     */
    public LocalDate getFin() {
        return fin;
    }

    /**
     * Establece la fecha de fin del préstamo.
     * 
     * @param fin La fecha de fin del préstamo
     */
    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    /**
     * Obtiene la placa del vehículo asociado al préstamo.
     * 
     * @return La placa del vehículo asociado al préstamo
     */
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    /**
     * Establece la placa del vehículo asociado al préstamo.
     * 
     * @param placaVehiculo La placa del vehículo asociado al préstamo
     */
    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    /**
     * Obtiene el correo del empleado responsable del préstamo.
     * 
     * @return El correo del empleado responsable del préstamo
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Establece el correo del empleado responsable del préstamo.
     * 
     * @param correoEmpleado El correo del empleado responsable del préstamo
     */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
}
    

