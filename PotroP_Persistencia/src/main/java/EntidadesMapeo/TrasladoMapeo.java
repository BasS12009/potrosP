/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMapeo;

import entidades.Vehiculo;
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
    
    private ObjectId id; // Identificador único del traslado
    private String Folio; // Folio del traslado
    private String motivo; // Motivo del traslado
    private int personas; // Número de personas involucradas en el traslado
    private LocalDateTime fechaHoraSalida; // Fecha y hora de salida del traslado
    private LocalDateTime fechaHoraRegreso; // Fecha y hora de regreso del traslado
    private boolean disponibilidad; // Disponibilidad del traslado
    private Vehiculo vehiculo; // Objeto Vehiculo asociado al traslado
    private String estadoVehiculo; // Estado del vehículo utilizado en el traslado
    private String llantas; // Estado de las llantas del vehículo
    private String carroceria; // Estado de la carrocería del vehículo
    private int combustible; // Nivel de combustible del vehículo
    private String correoEmpleado; // Correo del empleado responsable del traslado
    private String correoChofer; // Correo del chofer asignado al traslado
    private boolean estado; // Estado del traslado (activo/inactivo)

    
     /**
     * Constructor vacío de la clase TrasladoMapeo.
     */
    public TrasladoMapeo() {
    }

    
    /**
     * Constructor de la clase TrasladoMapeo.
     * 
     * @param id Identificador único del traslado
     * @param Folio Folio del traslado
     * @param motivo Motivo del traslado
     * @param personas Número de personas involucradas en el traslado
     * @param fechaHoraSalida Fecha y hora de salida del traslado
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado
     * @param disponibilidad Disponibilidad del traslado
     * @param vehiculo Objeto Vehiculo asociado al traslado
     * @param estadoVehiculo Estado del vehículo utilizado en el traslado
     * @param llantas Estado de las llantas del vehículo
     * @param carroceria Estado de la carrocería del vehículo
     * @param combustible Nivel de combustible del vehículo
     * @param correoEmpleado Correo del empleado responsable del traslado
     * @param correoChofer Correo del chofer asignado al traslado
     * @param estado Estado del traslado (activo/inactivo)
     */
    public TrasladoMapeo(ObjectId id, String Folio, String motivo, int personas, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, boolean disponibilidad, Vehiculo vehiculo, String estadoVehiculo, String llantas, String carroceria, int combustible, String correoEmpleado, String correoChofer, boolean estado) {
        this.id = id;
        this.Folio = Folio;
        this.motivo = motivo;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.disponibilidad = disponibilidad;
        this.vehiculo = vehiculo;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.correoChofer = correoChofer;
        this.correoEmpleado = correoEmpleado;
        this.estado = estado;
    }

   
     /**
     * Constructor alternativo de la clase TrasladoMapeo.
     * 
     * @param Folio Folio del traslado
     * @param motivo Motivo del traslado
     * @param personas Número de personas involucradas en el traslado
     * @param fechaHoraSalida Fecha y hora de salida del traslado
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado
     * @param disponibilidad Disponibilidad del traslado
     * @param vehiculo Objeto Vehiculo asociado al traslado
     * @param estadoVehiculo Estado del vehículo utilizado en el traslado
     * @param llantas Estado de las llantas del vehículo
     * @param carroceria Estado de la carrocería del vehículo
     * @param combustible Nivel de combustible del vehículo
     * @param correoEmpleado Correo del empleado responsable del traslado
     * @param correoChofer Correo del chofer asignado al traslado
     * @param estado Estado del traslado (activo/inactivo)
     */

        public TrasladoMapeo(String Folio, String motivo, int personas, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, boolean disponibilidad, Vehiculo vehiculo, String estadoVehiculo, String llantas, String carroceria, int combustible, String correoEmpleado, String correoChofer, boolean estado) {
        this.Folio = Folio;
        this.motivo = motivo;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.disponibilidad = disponibilidad;
        this.vehiculo = vehiculo;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
        this.carroceria = carroceria;
        this.combustible = combustible;
    }

   
    /**
     * Obtiene el identificador único del traslado.
     * 
     * @return El identificador único del traslado
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del traslado.
     * 
     * @param id El identificador único del traslado
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el folio del traslado.
     * 
     * @return El folio del traslado
     */
    public String getFolio() {
        return Folio;
    }

    /**
     * Establece el folio del traslado.
     * 
     * @param Folio El folio del traslado
     */
    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    /**
     * Obtiene el motivo del traslado.
     * 
     * @return El motivo del traslado
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo del traslado.
     * 
     * @param motivo El motivo del traslado
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene el número de personas involucradas en el traslado.
     * 
     * @return El número de personas involucradas en el traslado
     */
    public int getPersonas() {
        return personas;
    }

    /**
     * Establece el número de personas involucradas en el traslado.
     * 
     * @param personas El número de personas involucradas en el traslado
     */
    public void setPersonas(int personas) {
        this.personas = personas;
    }

    /**
     * Obtiene la fecha y hora de salida del traslado.
     * 
     * @return La fecha y hora de salida del traslado
     */
    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    /**
     * Establece la fecha y hora de salida del traslado.
     * 
     * @param fechaHoraSalida La fecha y hora de salida del traslado
     */
    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    /**
     * Obtiene la fecha y hora de regreso del traslado.
     * 
     * @return La fecha y hora de regreso del traslado
     */
    public LocalDateTime getFechaHoraRegreso() {
        return fechaHoraRegreso;
    }

    /**
     * Establece la fecha y hora de regreso del traslado.
     * 
     * @param fechaHoraRegreso La fecha y hora de regreso del traslado
     */
    public void setFechaHoraRegreso(LocalDateTime fechaHoraRegreso) {
        this.fechaHoraRegreso = fechaHoraRegreso;
    }

    /**
     * Verifica la disponibilidad del traslado.
     * 
     * @return true si el traslado está disponible, false si no lo está
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del traslado.
     * 
     * @param disponibilidad La disponibilidad del traslado
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Obtiene el objeto Vehiculo asociado al traslado.
     * 
     * @return El objeto Vehiculo asociado al traslado
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el objeto Vehiculo asociado al traslado.
     * 
     * @param vehiculo El objeto Vehiculo asociado al traslado
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el estado del vehículo utilizado en el traslado.
     * 
     * @return El estado del vehículo utilizado en el traslado
     */
    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    /**
     * Establece el estado del vehículo utilizado en el traslado.
     * 
     * @param estadoVehiculo El estado del vehículo utilizado en el traslado
     */
    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    /**
     * Obtiene el estado de las llantas del vehículo utilizado en el traslado.
     * 
     * @return El estado de las llantas del vehículo
     */
    public String getLlantas() {
        return llantas;
    }

    /**
     * Establece el estado de las llantas del vehículo utilizado en el traslado.
     * 
     * @param llantas El estado de las llantas del vehículo
     */
    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    /**
     * Obtiene el estado de la carrocería del vehículo utilizado en el traslado.
     * 
     * @return El estado de la carrocería del vehículo
     */
    public String getCarroceria() {
        return carroceria;
    }

    /**
     * Establece el estado de la carrocería del vehículo utilizado en el traslado.
     * 
     * @param carroceria El estado de la carrocería del vehículo
     */
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    /**
     * Obtiene el nivel de combustible del vehículo utilizado en el traslado.
     * 
     * @return El nivel de combustible del vehículo
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * Establece el nivel de combustible del vehículo utilizado en el traslado.
     * 
     * @param combustible El nivel de combustible del vehículo
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    /**
     * Obtiene el correo del empleado responsable del traslado.
     * 
     * @return El correo del empleado responsable del traslado
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Establece el correo del empleado responsable del traslado.
     * 
     * @param correoEmpleado El correo del empleado responsable del traslado
     */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Obtiene el correo del chofer asignado al traslado.
     * 
     * @return El correo del chofer asignado al traslado
     */
    public String getCorreoChofer() {
        return correoChofer;
    }

    /**
     * Establece el correo del chofer asignado al traslado.
     * 
     * @param correoChofer El correo del chofer asignado al traslado
     */
    public void setCorreoChofer(String correoChofer) {
        this.correoChofer = correoChofer;
    }

    /**
     * Verifica el estado del traslado.
     * 
     * @return true si el traslado está activo, false si no lo está
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado del traslado.
     * 
     * @param estado El estado del traslado (activo/inactivo)
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
    
