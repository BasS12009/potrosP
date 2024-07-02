/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.List;


/**
 * La clase PrestamoMaestros representa el préstamo de un vehículo para maestros, con atributos como id, fecha del préstamo,
 * departamento, cantidad de personas, motivo del préstamo, plantel de origen, plantel de destino, vehículo utilizado, 
 * correo del responsable y acompañantes.
 * Esta clase proporciona métodos para obtener y establecer estos atributos, así como constructores para crear instancias de PrestamoMaestros.
 */
public class PrestamoMaestros {
    
    private String id;  // Identificador único del préstamo
    private LocalDate fechaPrestamo;  // Fecha del préstamo
    private String departamento;  // Departamento solicitante del préstamo
    private int cantidadPersonas;  // Cantidad de personas involucradas en el préstamo
    private String motivo;  // Motivo del préstamo
    private String plantelOrigen;  // Plantel de origen del préstamo
    private String plantelDestino;  // Plantel de destino del préstamo
    private String vehiculo;  // Vehículo utilizado para el préstamo
    private String correoResponsable;  // Correo electrónico del responsable del préstamo
    private List<String> acompaniantes;  // Lista de acompañantes en el préstamo

    /**
     * Constructor vacío de la clase PrestamoMaestros.
     */
    public PrestamoMaestros() {
    }

    
    /**
     * Constructor completo de la clase PrestamoMaestros.
     * 
     * @param id Identificador único del préstamo
     * @param fechaPrestamo Fecha del préstamo
     * @param departamento Departamento solicitante del préstamo
     * @param cantidadPersonas Cantidad de personas involucradas en el préstamo
     * @param motivo Motivo del préstamo
     * @param plantelOrigen Plantel de origen del préstamo
     * @param plantelDestino Plantel de destino del préstamo
     * @param vehiculo Vehículo utilizado para el préstamo
     * @param correoResponsable Correo electrónico del responsable del préstamo
     * @param acompaniantes Lista de acompañantes en el préstamo
     */
    public PrestamoMaestros(String id, LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, String vehiculo, String correoResponsable, List<String> acompaniantes) {
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

    /**
     * Constructor de la clase PrestamoMaestros sin el atributo id.
     * 
     * @param fechaPrestamo Fecha del préstamo
     * @param departamento Departamento solicitante del préstamo
     * @param cantidadPersonas Cantidad de personas involucradas en el préstamo
     * @param motivo Motivo del préstamo
     * @param plantelOrigen Plantel de origen del préstamo
     * @param plantelDestino Plantel de destino del préstamo
     * @param vehiculo Vehículo utilizado para el préstamo
     * @param correoResponsable Correo electrónico del responsable del préstamo
     * @param acompaniantes Lista de acompañantes en el préstamo
     */
    public PrestamoMaestros(LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, String vehiculo, String correoResponsable, List<String> acompaniantes) {
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
 /**
     * Obtiene el identificador único del préstamo.
     * 
     * @return El identificador único del préstamo
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único del préstamo.
     * 
     * @param id El identificador único del préstamo
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha del préstamo.
     * 
     * @return La fecha del préstamo
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Establece la fecha del préstamo.
     * 
     * @param fechaPrestamo La fecha del préstamo
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene el departamento solicitante del préstamo.
     * 
     * @return El departamento solicitante del préstamo
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento solicitante del préstamo.
     * 
     * @param departamento El departamento solicitante del préstamo
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Obtiene la cantidad de personas involucradas en el préstamo.
     * 
     * @return La cantidad de personas involucradas en el préstamo
     */
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    /**
     * Establece la cantidad de personas involucradas en el préstamo.
     * 
     * @param cantidadPersonas La cantidad de personas involucradas en el préstamo
     */
    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
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
     * Obtiene el plantel de origen del préstamo.
     * 
     * @return El plantel de origen del préstamo
     */
    public String getPlantelOrigen() {
        return plantelOrigen;
    }

    /**
     * Establece el plantel de origen del préstamo.
     * 
     * @param plantelOrigen El plantel de origen del préstamo
     */
    public void setPlantelOrigen(String plantelOrigen) {
        this.plantelOrigen = plantelOrigen;
    }

    /**
     * Obtiene el plantel de destino del préstamo.
     * 
     * @return El plantel de destino del préstamo
     */
    public String getPlantelDestino() {
        return plantelDestino;
    }

    /**
     * Establece el plantel de destino del préstamo.
     * 
     * @param plantelDestino El plantel de destino del préstamo
     */
    public void setPlantelDestino(String plantelDestino) {
        this.plantelDestino = plantelDestino;
    }

    /**
     * Obtiene el vehículo utilizado para el préstamo.
     * 
     * @return El vehículo utilizado para el préstamo
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo utilizado para el préstamo.
     * 
     * @param vehiculo El vehículo utilizado para el préstamo
     */
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el correo electrónico del responsable del préstamo.
     * 
     * @return El correo electrónico del responsable del préstamo
     */
    public String getCorreoResponsable() {
        return correoResponsable;
    }

    /**
     * Establece el correo electrónico del responsable del préstamo.
     * 
     * @param correoResponsable El correo electrónico del responsable del préstamo
     */
    public void setCorreoResponsable(String correoResponsable) {
        this.correoResponsable = correoResponsable;
    }

    /**
     * Obtiene la lista de acompañantes en el préstamo.
     * 
     * @return La lista de acompañantes en el préstamo
     */
    public List<String> getAcompaniantes() {
        return acompaniantes;
    }

    /**
     * Establece la lista de acompañantes en el préstamo.
     * 
     * @param acompaniantes La lista de acompañantes en el préstamo
     */
    public void setAcompaniantes(List<String> acompaniantes) {
        this.acompaniantes = acompaniantes;
    }

    @Override
    public String toString() {
        return "PrestamoMaestros{" + "id=" + id + ", fechaPrestamo=" + fechaPrestamo 
                + ", departamento=" + departamento + ", cantidadPersonas=" + cantidadPersonas + ", motivo=" 
                + motivo + ", plantelOrigen=" + plantelOrigen + ", plantelDestino=" + plantelDestino + ", vehiculo=" 
                + vehiculo + ", correoResponsable=" + correoResponsable + ", acompaniantes=" + acompaniantes + '}';
    }
    
    
}
