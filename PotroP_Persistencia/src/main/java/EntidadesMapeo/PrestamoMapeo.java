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
    
    private ObjectId id; // Identificador único del préstamo
    private String motivo; // Motivo del préstamo
    private LocalDate inicio; // Fecha de inicio del préstamo
    private LocalDate fin; // Fecha de fin del préstamo
    private String placaVehiculo; // Placa del vehículo asociado al préstamo
    private String correoEmpleado; // Correo del empleado responsable del préstamo

     /**
     * Constructor vacío de la clase PrestamoMapeo.
     */
    public PrestamoMapeo() {
    }

        /**
     * Constructor de la clase PrestamoMapeo.
     * 
     * @param id Identificador único del préstamo
     * @param motivo Motivo del préstamo
     * @param inicio Fecha de inicio del préstamo
     * @param fin Fecha de fin del préstamo
     * @param placaVehiculo Placa del vehículo asociado al préstamo
     * @param correoEmpleado Correo del empleado responsable del préstamo
     */

    public PrestamoMapeo(ObjectId id, String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.id = id;
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Constructor alternativo de la clase PrestamoMapeo.
     * 
     * @param motivo Motivo del préstamo
     * @param inicio Fecha de inicio del préstamo
     * @param fin Fecha de fin del préstamo
     * @param placaVehiculo Placa del vehículo asociado al préstamo
     * @param correoEmpleado Correo del empleado responsable del préstamo
     */
    public PrestamoMapeo(String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
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
    

