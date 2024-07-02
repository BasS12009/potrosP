/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


import java.time.LocalDateTime;

/**
 *
 * @author diana
 */
/**
 * La clase Traslado representa el traslado de un vehículo con atributos tales como id, folio, motivo, número de personas, fechas y horas de salida y regreso,
 * disponibilidad, vehículo, estado del vehículo, llantas, carrocería, combustible, correo del empleado, correo del chofer y estado del traslado.
 * Esta clase proporciona métodos para obtener y establecer estos atributos, así como constructores para crear instancias de Traslado.
 */
public class Traslado {
    
    
    private String id;  // Identificador único del traslado
    private String Folio;  // Folio del traslado
    private String motivo;  // Motivo del traslado
    private int personas;  // Número de personas involucradas en el traslado
    private LocalDateTime fechaHoraSalida;  // Fecha y hora de salida del traslado
    private LocalDateTime fechaHoraRegreso;  // Fecha y hora de regreso del traslado
    private boolean disponibilidad;  // Disponibilidad del vehículo para el traslado
    private Vehiculo vehiculo;  // Vehículo utilizado para el traslado
    private String estadoVehiculo;  // Estado del vehículo al momento del traslado
    private String llantas;  // Estado de las llantas del vehículo
    private String carroceria;  // Estado de la carrocería del vehículo
    private int combustible;  // Nivel de combustible del vehículo
    private String correoEmpleado;  // Correo electrónico del empleado
    private String correoChofer;  // Correo electrónico del chofer
    private boolean estado;  // Estado del traslado (activo o inactivo)


     /**
     * Constructor completo de la clase Traslado.
     * 
     * @param id Identificador único del traslado
     * @param Folio Folio del traslado
     * @param motivo Motivo del traslado
     * @param personas Número de personas involucradas en el traslado
     * @param fechaHoraSalida Fecha y hora de salida del traslado
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado
     * @param disponibilidad Disponibilidad del vehículo para el traslado
     * @param vehiculo Vehículo utilizado para el traslado
     * @param estadoVehiculo Estado del vehículo al momento del traslado
     * @param llantas Estado de las llantas del vehículo
     * @param carroceria Estado de la carrocería del vehículo
     * @param combustible Nivel de combustible del vehículo
     * @param correoEmpleado Correo electrónico del empleado
     * @param correoChofer Correo electrónico del chofer
     * @param estado Estado del traslado (activo o inactivo)
     */
    public Traslado(String id, String Folio, String motivo, int personas, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, boolean disponibilidad, Vehiculo vehiculo, String estadoVehiculo, String llantas, String carroceria, int combustible, String correoEmpleado, String correoChofer, boolean estado) {
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
        this.correoEmpleado = correoEmpleado;
        this.correoChofer = correoChofer;
        this.estado = estado;
    }

    /**
     * Constructor de la clase Traslado sin el atributo id.
     * 
     * @param Folio Folio del traslado
     * @param motivo Motivo del traslado
     * @param personas Número de personas involucradas en el traslado
     * @param fechaHoraSalida Fecha y hora de salida del traslado
     * @param fechaHoraRegreso Fecha y hora de regreso del traslado
     * @param disponibilidad Disponibilidad del vehículo para el traslado
     * @param vehiculo Vehículo utilizado para el traslado
     * @param estadoVehiculo Estado del vehículo al momento del traslado
     * @param llantas Estado de las llantas del vehículo
     * @param carroceria Estado de la carrocería del vehículo
     * @param combustible Nivel de combustible del vehículo
     * @param correoEmpleado Correo electrónico del empleado
     * @param correoChofer Correo electrónico del chofer
     * @param estado Estado del traslado (activo o inactivo)
     */
    public Traslado(String Folio, String motivo, int personas, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, boolean disponibilidad, Vehiculo vehiculo, String estadoVehiculo, String llantas, String carroceria, int combustible, String correoEmpleado, String correoChofer, boolean estado) {
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
        this.correoEmpleado = correoEmpleado;
        this.correoChofer = correoChofer;
        this.estado = estado;
    }

    /**
     * Obtiene el identificador único del traslado.
     * 
     * @return El identificador único del traslado
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único del traslado.
     * 
     * @param id El identificador único del traslado
     */
    public void setId(String id) {
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
     * Obtiene la disponibilidad del vehículo para el traslado.
     * 
     * @return La disponibilidad del vehículo para el traslado
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del vehículo para el traslado.
     * 
     * @param disponibilidad La disponibilidad del vehículo para el traslado
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Obtiene el vehículo utilizado para el traslado.
     * 
     * @return El vehículo utilizado para el traslado
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo utilizado para el traslado.
     * 
     * @param vehiculo El vehículo utilizado para el traslado
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el estado del vehículo al momento del traslado.
     * 
     * @return El estado del vehículo al momento del traslado
     */
    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    /**
     * Establece el estado del vehículo al momento del traslado.
     * 
     * @param estadoVehiculo El estado del vehículo al momento del traslado
     */
    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    /**
     * Obtiene el estado de las llantas del vehículo.
     * 
     * @return El estado de las llantas del vehículo
     */
    public String getLlantas() {
        return llantas;
    }

    /**
     * Establece el estado de las llantas del vehículo.
     * 
     * @param llantas El estado de las llantas del vehículo
     */
    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    /**
     * Obtiene el estado de la carrocería del vehículo.
     * 
     * @return El estado de la carrocería del vehículo
     */
    public String getCarroceria() {
        return carroceria;
    }

    /**
     * Establece el estado de la carrocería del vehículo.
     * 
     * @param carroceria El estado de la carrocería del vehículo
     */
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    /**
     * Obtiene el nivel de combustible del vehículo.
     * 
     * @return El nivel de combustible del vehículo
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * Establece el nivel de combustible del vehículo.
     * 
     * @param combustible El nivel de combustible del vehículo
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    /**
     * Obtiene el correo electrónico del empleado.
     * 
     * @return El correo electrónico del empleado
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Establece el correo electrónico del empleado.
     * 
     * @param correoEmpleado El correo electrónico del empleado
     */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Obtiene el correo electrónico del chofer.
     * 
     * @return El correo electrónico del chofer
     */
    public String getCorreoChofer() {
        return correoChofer;
    }

    /**
     * Establece el correo electrónico del chofer.
     * 
     * @param correoChofer El correo electrónico del chofer
     */
    public void setCorreoChofer(String correoChofer) {
        this.correoChofer = correoChofer;
    }

    /**
     * Obtiene el estado del traslado (activo o inactivo).
     * 
     * @return El estado del traslado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado del traslado (activo o inactivo).
     * 
     * @param estado El estado del traslado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Traslado{" + "id=" + id + ", Folio=" + Folio + ", motivo=" + motivo 
                + ", personas=" + personas + ", fechaHoraSalida=" + fechaHoraSalida 
                + ", fechaHoraRegreso=" + fechaHoraRegreso + ", disponibilidad=" 
                + disponibilidad + ", vehiculo=" + vehiculo + ", estadoVehiculo=" + estadoVehiculo 
                + ", llantas=" + llantas + ", carroceria=" + carroceria + ", combustible=" + combustible 
                + ", correoEmpleado=" + correoEmpleado + ", correoChofer=" + correoChofer + ", estado=" + estado + '}';
    }
    
}
    
    

