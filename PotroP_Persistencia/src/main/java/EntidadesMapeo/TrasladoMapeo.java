/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMapeo;

import entidades.Vehiculo;
import entidades.VehiculoDevuelto;
import entidades.VehiculoEntregado;
import java.time.LocalDateTime;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
/**
 * La clase TrasladoMapeo representa un traslado con atributos específicos y un identificador ObjectId.
 * Es utilizada para mapear los datos de un traslado en un contexto de persistencia o mapeo de objetos.
 */
public class TrasladoMapeo {
    
     
    private ObjectId id;                      // Identificador único del traslado
    private String folio;                     // Folio del traslado
    private String motivo;                    // Motivo del traslado
    private int personas;                     // Número de personas en el traslado
    private LocalDateTime fechaHoraSalida;    // Fecha y hora de salida del traslado
    private LocalDateTime fechaHoraRegreso;   // Fecha y hora de regreso del traslado
    private boolean disponibilidad;           // Disponibilidad del traslado
    private Vehiculo vehiculo;                // Objeto Vehiculo asociado al traslado
    private VehiculoEntregado vehiculoEntregado;     // Estado de entrega del vehículo para el traslado
    private VehiculoDevuelto vehiculoDevuelto;       // Estado de devolución del vehículo tras el traslado
    private String correoEmpleado;            // Correo del empleado responsable del traslado
    private boolean estado;                   // Estado actual del traslado (activo o no)


    
     /**
     * Constructor vacío de la clase TrasladoMapeo.
     */
    public TrasladoMapeo() {
    }

    
      /**
     * Constructor con todos los atributos de la clase TrasladoMapeo.
     * 
     * @param folio el folio del traslado
     * @param motivo el motivo del traslado
     * @param personas el número de personas en el traslado
     * @param fechaHoraSalida la fecha y hora de salida del traslado
     * @param fechaHoraRegreso la fecha y hora de regreso del traslado
     * @param disponibilidad la disponibilidad del traslado
     * @param vehiculo el objeto Vehiculo asociado al traslado
     * @param vehiculoEntregado el estado de entrega del vehículo para el traslado
     * @param vehiculoDevuelto el estado de devolución del vehículo tras el traslado
     * @param correoEmpleado el correo del empleado responsable del traslado
     * @param estado el estado actual del traslado
     */
    public TrasladoMapeo(String folio, String motivo, int personas,LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, boolean disponibilidad, Vehiculo vehiculo, 
            VehiculoEntregado vehiculoEntregado, VehiculoDevuelto vehiculoDevuelto, String correoEmpleado,  boolean estado) {
        this.folio = folio;
        this.motivo = motivo;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.disponibilidad = disponibilidad;
        this.vehiculo = vehiculo;
        this.vehiculoEntregado = vehiculoEntregado;
        this.vehiculoDevuelto = vehiculoDevuelto;
        this.correoEmpleado = correoEmpleado;
        this.estado = estado;
    }

    
    /**
     * Constructor con todos los atributos de la clase TrasladoMapeo, incluyendo el identificador único.
     * 
     * @param id el identificador único del traslado
     * @param folio el folio del traslado
     * @param motivo el motivo del traslado
     * @param personas el número de personas en el traslado
     * @param fechaHoraSalida la fecha y hora de salida del traslado
     * @param fechaHoraRegreso la fecha y hora de regreso del traslado
     * @param disponibilidad la disponibilidad del traslado
     * @param vehiculo el objeto Vehiculo asociado al traslado
     * @param vehiculoEntregado el estado de entrega del vehículo para el traslado
     * @param vehiculoDevuelto el estado de devolución del vehículo tras el traslado
     * @param correoEmpleado el correo del empleado responsable del traslado
     * @param estado el estado actual del traslado
     */

    public TrasladoMapeo(ObjectId id, String folio, String motivo, int personas, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, boolean disponibilidad, 
            Vehiculo vehiculo, VehiculoEntregado vehiculoEntregado, VehiculoDevuelto vehiculoDevuelto, String correoEmpleado, boolean estado) {
        this.id = id;
        this.folio = folio;
        this.motivo = motivo;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.disponibilidad = disponibilidad;
        this.vehiculo = vehiculo;
        this.vehiculoEntregado = vehiculoEntregado;
        this.vehiculoDevuelto = vehiculoDevuelto;
        this.correoEmpleado = correoEmpleado;
        this.estado = estado;
    }

     /**
     * Obtiene el identificador único del traslado.
     * 
     * @return el identificador único del traslado
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del traslado.
     * 
     * @param id el identificador único del traslado
     */
    public void setId(ObjectId id) {
        this.id = id;
    }
    /**
     * Obtiene el folio del traslado.
     * 
     * @return el folio del traslado
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Establece el folio del traslado.
     * 
     * @param folio el folio del traslado
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * Obtiene el motivo del traslado.
     * 
     * @return el motivo del traslado
     */
    public String getMotivo() {
        return motivo;
    }
    /**
     * Establece el motivo del traslado.
     * 
     * @param motivo el motivo del traslado
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
     /**
     * Obtiene el número de personas en el traslado.
     * 
     * @return el número de personas en el traslado
     */
    public int getPersonas() {
        return personas;
    }

    /**
     * Establece el número de personas en el traslado.
     * 
     * @param personas el número de personas en el traslado
     */
    public void setPersonas(int personas) {
        this.personas = personas;
    }

    /**
     * Obtiene la fecha y hora de salida del traslado.
     * 
     * @return la fecha y hora de salida del traslado
     */
    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    /**
     * Establece la fecha y hora de salida del traslado.
     * 
     * @param fechaHoraSalida la fecha y hora de salida del traslado
     */
    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

     /**
     * Obtiene la fecha y hora de regreso del traslado.
     * 
     * @return la fecha y hora de regreso del traslado
     */
    public LocalDateTime getFechaHoraRegreso() {
        return fechaHoraRegreso;
    }

    /**
     * Establece la fecha y hora de regreso del traslado.
     * 
     * @param fechaHoraRegreso la fecha y hora de regreso del traslado
     */
    public void setFechaHoraRegreso(LocalDateTime fechaHoraRegreso) {
        this.fechaHoraRegreso = fechaHoraRegreso;
    }

    
    /**
     * Verifica si el traslado está disponible.
     * 
     * @return true si el traslado está disponible, false si no
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del traslado.
     * 
     * @param disponibilidad true si el traslado está disponible, false si no
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Obtiene el objeto Vehiculo asociado al traslado.
     * 
     * @return el objeto Vehiculo asociado al traslado
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el objeto Vehiculo asociado al traslado.
     * 
     * @param vehiculo el objeto Vehiculo asociado al traslado
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el estado de entrega del vehículo para el traslado.
     * 
     * @return el estado de entrega del vehículo para el traslado
     */
    public VehiculoEntregado getVehiculoEntregado() {
        return vehiculoEntregado;
    }

    /**
     * Establece el estado de entrega del vehículo para el traslado.
     * 
     * @param vehiculoEntregado el estado de entrega del vehículo para el traslado
     */
    public void setVehiculoEntregado(VehiculoEntregado vehiculoEntregado) {
        this.vehiculoEntregado = vehiculoEntregado;
    }

    /**
     * Obtiene el estado de devolución del vehículo tras el traslado.
     * 
     * @return el estado de devolución del vehículo tras el traslado
     */
    public VehiculoDevuelto getVehiculoDevuelto() {
        return vehiculoDevuelto;
    }

    /**
     * Establece el estado de devolución del vehículo tras el traslado.
     * 
     * @param vehiculoDevuelto el estado de devolución del vehículo tras el traslado
     */
    public void setVehiculoDevuelto(VehiculoDevuelto vehiculoDevuelto) {
        this.vehiculoDevuelto = vehiculoDevuelto;
    }

     /**
     * Obtiene el correo del empleado responsable del traslado.
     * 
     * @return el correo del empleado responsable del traslado
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Establece el correo del empleado responsable del traslado.
     * 
     * @param correoEmpleado el correo del empleado responsable del traslado
     */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Verifica el estado actual del traslado.
     * 
     * @return true si el traslado está activo, false si no
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del traslado.
     * 
     * @param estado true si el traslado está activo, false si no
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    
}
