/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDateTime;
import org.bson.types.ObjectId;

public class Traslado {
  
    private ObjectId id;                   // Identificador único del traslado
    private String folio;                // Folio del traslado
    private String motivo;               // Motivo del traslado
    private int personas;                // Número de personas en el traslado
    private LocalDateTime fechaHoraSalida;   // Fecha y hora de salida del traslado
    private LocalDateTime fechaHoraRegreso;  // Fecha y hora de regreso del traslado
    private boolean disponibilidad;      // Disponibilidad del vehículo para el traslado
    private Vehiculo vehiculo;           // Vehículo utilizado en el traslado
    private VehiculoEntregado vehiculoEntregado;   // Información sobre la entrega del vehículo
    private VehiculoDevuelto vehiculoDevuelto;     // Información sobre la devolución del vehículo
    private String correoEmpleado;       // Correo electrónico del empleado responsable del traslado
    private boolean estado;              // Estado actual del traslado (activo o inactivo)

    /**
     * Constructor vacío de la clase Traslado.
     */
    public Traslado() {
    }

    /**
     * Constructor con parámetros para inicializar los atributos de la clase.
     *
     * @param folio Folio del traslado.
     * @param motivo Motivo del traslado.
     * @param personas Número de personas en el traslado.
     * @param fechaHoraSalida Fecha y hora de salida del traslado.
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado.
     * @param disponibilidad Disponibilidad del vehículo para el traslado.
     * @param vehiculo Vehículo utilizado en el traslado.
     * @param vehiculoEntregado Información sobre la entrega del vehículo.
     * @param vehiculoDevuelto Información sobre la devolución del vehículo.
     * @param correoEmpleado Correo electrónico del empleado responsable del
     * traslado.
     * @param estado Estado actual del traslado (activo o inactivo).
     */
    public Traslado(String folio, String motivo, int personas, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso,
            boolean disponibilidad, Vehiculo vehiculo,VehiculoEntregado vehiculoEntregado, VehiculoDevuelto vehiculoDevuelto,
            String correoEmpleado, boolean estado) {
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
     * Constructor con parámetros para inicializar los atributos de la clase,
     * incluyendo el identificador único del traslado.
     *
     * @param id Identificador único del traslado.
     * @param folio Folio del traslado.
     * @param motivo Motivo del traslado.
     * @param personas Número de personas en el traslado.
     * @param fechaHoraSalida Fecha y hora de salida del traslado.
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado.
     * @param disponibilidad Disponibilidad del vehículo para el traslado.
     * @param vehiculo Vehículo utilizado en el traslado.
     * @param vehiculoEntregado Información sobre la entrega del vehículo.
     * @param vehiculoDevuelto Información sobre la devolución del vehículo.
     * @param correoEmpleado Correo electrónico del empleado responsable del
     * traslado.
     * @param estado Estado actual del traslado (activo o inactivo).
     */
    public Traslado(ObjectId id, String folio, String motivo, int personas,  LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso,
            boolean disponibilidad, Vehiculo vehiculo, VehiculoEntregado vehiculoEntregado, VehiculoDevuelto vehiculoDevuelto,
            String correoEmpleado, boolean estado) {
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
     * @return Identificador único del traslado.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del traslado.
     *
     * @param id Identificador único del traslado.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el folio del traslado.
     *
     * @return Folio del traslado.
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Establece el folio del traslado.
     *
     * @param folio Folio del traslado.
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * Obtiene el motivo del traslado.
     *
     * @return Motivo del traslado.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo del traslado.
     *
     * @param motivo Motivo del traslado.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene el número de personas en el traslado.
     *
     * @return Número de personas en el traslado.
     */
    public int getPersonas() {
        return personas;
    }

    /**
     * Establece el número de personas en el traslado.
     *
     * @param personas Número de personas en el traslado.
     */
    public void setPersonas(int personas) {
        this.personas = personas;
    }

    /**
     * Obtiene la fecha y hora de salida del traslado.
     *
     * @return Fecha y hora de salida del traslado.
     */
    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    /**
     * Establece la fecha y hora de salida del traslado.
     *
     * @param fechaHoraSalida Fecha y hora de salida del traslado.
     */
    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    /**
     * Obtiene la fecha y hora de regreso del traslado.
     *
     * @return Fecha y hora de regreso del traslado.
     */
    public LocalDateTime getFechaHoraRegreso() {
        return fechaHoraRegreso;
    }

    /**
     * Establece la fecha y hora de regreso del traslado.
     *
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado.
     */
    public void setFechaHoraRegreso(LocalDateTime fechaHoraRegreso) {
        this.fechaHoraRegreso = fechaHoraRegreso;
    }

    /**
     * Verifica la disponibilidad del vehículo para el traslado.
     *
     * @return true si el vehículo está disponible para el traslado, false de lo
     * contrario.
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del vehículo para el traslado.
     *
     * @param disponibilidad Disponibilidad del vehículo para el traslado.
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Obtiene el vehículo utilizado en el traslado.
     *
     * @return Vehículo utilizado en el traslado.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo utilizado en el traslado.
     *
     * @param vehiculo Vehículo utilizado en el traslado.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene la información sobre la entrega del vehículo en el traslado.
     *
     * @return Información sobre la entrega del vehículo en el traslado.
     */
    public VehiculoEntregado getVehiculoEntregado() {
        return vehiculoEntregado;
    }

    /**
     * Establece la información sobre la entrega del vehículo en el traslado.
     *
     * @param vehiculoEntregado Información sobre la entrega del vehículo en el
     * traslado.
     */
    public void setVehiculoEntregado(VehiculoEntregado vehiculoEntregado) {
        this.vehiculoEntregado = vehiculoEntregado;
    }

    /**
     * Obtiene la información sobre la devolución del vehículo en el traslado.
     *
     * @return Información sobre la devolución del vehículo en el traslado.
     */
    public VehiculoDevuelto getVehiculoDevuelto() {
        return vehiculoDevuelto;
    }

    /**
     * Establece la información sobre la devolución del vehículo en el traslado.
     *
     * @param vehiculoDevuelto Información sobre la devolución del vehículo en
     * el traslado.
     */
    public void setVehiculoDevuelto(VehiculoDevuelto vehiculoDevuelto) {
        this.vehiculoDevuelto = vehiculoDevuelto;
    }

    /**
     * Obtiene el correo electrónico del empleado responsable del traslado.
     *
     * @return Correo electrónico del empleado responsable del traslado.
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Establece el correo electrónico del empleado responsable del traslado.
     *
     * @param correoEmpleado Correo electrónico del empleado responsable del
     * traslado.
     */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Verifica el estado actual del traslado.
     *
     * @return true si el traslado está activo, false de lo contrario.
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del traslado.
     *
     * @param estado Estado actual del traslado.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Sobrescribe el método toString para representar los atributos de la
     * clase.
     *
     * @return Representación en cadena de texto de los atributos del traslado.
     */
    @Override
    public String toString() {
        return "Traslado{"
                + "id='" + id + '\''
                + ", folio='" + folio + '\''
                + ", motivo='" + motivo + '\''
                + ", personas=" + personas
                + ", fechaHoraSalida=" + fechaHoraSalida
                + ", fechaHoraRegreso=" + fechaHoraRegreso
                + ", disponibilidad=" + disponibilidad
                + ", vehiculo=" + vehiculo
                + ", vehiculoEntregado=" + vehiculoEntregado
                + ", vehiculoDevuelto=" + vehiculoDevuelto
                + ", correoEmpleado='" + correoEmpleado + '\''
                + ", estado=" + estado
                + '}';
    }
}
