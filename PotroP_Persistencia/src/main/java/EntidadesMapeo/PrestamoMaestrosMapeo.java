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
/**
 * La clase PrestamoMaestrosMapeo representa un préstamo de maestros con atributos específicos y un identificador ObjectId.
 * Es utilizada para mapear los datos de un préstamo de maestros en un contexto de persistencia o mapeo de objetos.
 */
public class PrestamoMaestrosMapeo {
    
    
    
    private ObjectId id; // Identificador único del préstamo de maestros
    private LocalDate fechaPrestamo; // Fecha del préstamo
    private String departamento; // Departamento responsable del préstamo
    private int cantidadPersonas; // Cantidad de personas involucradas en el préstamo
    private String motivo; // Motivo del préstamo
    private String plantelOrigen; // Plantel de origen del préstamo
    private String plantelDestino; // Plantel de destino del préstamo
    private VehiculoMapeo vehiculo;
    private String correoResponsable; // Correo del responsable del préstamo
    private List<String> acompaniantes; // Lista de acompañantes del responsable del préstamo
    
    /**
     * Constructor vacío de la clase PrestamoMaestrosMapeo.
     */
    public PrestamoMaestrosMapeo() {
    }

    
    
    /**
     * Constructor de la clase PrestamoMaestrosMapeo.
     * 
     * @param id Identificador único del préstamo de maestros
     * @param fechaPrestamo Fecha del préstamo
     * @param departamento Departamento responsable del préstamo
     * @param cantidadPersonas Cantidad de personas involucradas en el préstamo
     * @param motivo Motivo del préstamo
     * @param plantelOrigen Plantel de origen del préstamo
     * @param plantelDestino Plantel de destino del préstamo
     * @param vehiculo Vehículo asignado al préstamo (placa del vehículo)
     * @param correoResponsable Correo del responsable del préstamo
     * @param acompaniantes Lista de acompañantes del responsable del préstamo
     */
    public PrestamoMaestrosMapeo(ObjectId id, LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, VehiculoMapeo vehiculo, String correoResponsable, List<String> acompaniantes) {    
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
     * Constructor alternativo de la clase PrestamoMaestrosMapeo.
     * 
     * @param fechaPrestamo Fecha del préstamo
     * @param departamento Departamento responsable del préstamo
     * @param cantidadPersonas Cantidad de personas involucradas en el préstamo
     * @param motivo Motivo del préstamo
     * @param plantelOrigen Plantel de origen del préstamo
     * @param plantelDestino Plantel de destino del préstamo
     * @param vehiculo Vehículo asignado al préstamo (placa del vehículo)
     * @param correoResponsable Correo del responsable del préstamo
     * @param acompaniantes Lista de acompañantes del responsable del préstamo
     */
    public PrestamoMaestrosMapeo(LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, VehiculoMapeo vehiculo, String correoResponsable, List<String> acompaniantes) {    
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
     * Obtiene el identificador único del préstamo de maestros.
     * 
     * @return El identificador único del préstamo de maestros
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del préstamo de maestros.
     * 
     * @param id El identificador único del préstamo de maestros
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha del préstamo de maestros.
     * 
     * @return La fecha del préstamo de maestros
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Establece la fecha del préstamo de maestros.
     * 
     * @param fechaPrestamo La fecha del préstamo de maestros
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene el departamento responsable del préstamo de maestros.
     * 
     * @return El departamento responsable del préstamo de maestros
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento responsable del préstamo de maestros.
     * 
     * @param departamento El departamento responsable del préstamo de maestros
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Obtiene la cantidad de personas involucradas en el préstamo de maestros.
     * 
     * @return La cantidad de personas involucradas en el préstamo de maestros
     */
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    /**
     * Establece la cantidad de personas involucradas en el préstamo de maestros.
     * 
     * @param cantidadPersonas La cantidad de personas involucradas en el préstamo de maestros
     */
    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    /**
     * Obtiene el motivo del préstamo de maestros.
     * 
     * @return El motivo del préstamo de maestros
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo del préstamo de maestros.
     * 
     * @param motivo El motivo del préstamo de maestros
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene el plantel de origen del préstamo de maestros.
     * 
     * @return El plantel de origen del préstamo de maestros
     */
    public String getPlantelOrigen() {
        return plantelOrigen;
    }

    /**
     * Establece el plantel de origen del préstamo de maestros.
     * 
     * @param plantelOrigen El plantel de origen del préstamo de maestros
     */
    public void setPlantelOrigen(String plantelOrigen) {
        this.plantelOrigen = plantelOrigen;
    }

    /**
     * Obtiene el plantel de destino del préstamo de maestros.
     * 
     * @return El plantel de destino del préstamo de maestros
     */
    public String getPlantelDestino() {
        return plantelDestino;
    }

    /**
     * Establece el plantel de destino del préstamo de maestros.
     * 
     * @param plantelDestino El plantel de destino del préstamo de maestros
     */
    public void setPlantelDestino(String plantelDestino) {
        this.plantelDestino = plantelDestino;
    }

    public VehiculoMapeo getVehiculo() {
        return vehiculo;
    }

    /**
     * Obtiene el vehículo asignado al préstamo de maestros (placa del vehículo).
     * 
     * @return La placa del vehículo asignado al préstamo de maestros
     */
    public void setVehiculo(VehiculoMapeo vehiculo) {    
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el correo del responsable del préstamo de maestros.
     * 
     * @return El correo del responsable del préstamo de maestros
     */
    public String getCorreoResponsable() {
        return correoResponsable;
    }

    /**
     * Establece el correo del responsable del préstamo de maestros.
     * 
     * @param correoResponsable El correo del responsable del préstamo de maestros
     */
    public void setCorreoResponsable(String correoResponsable) {
        this.correoResponsable = correoResponsable;
    }

    /**
     * Obtiene la lista de acompañantes del responsable del préstamo de maestros.
     * 
     * @return La lista de acompañantes del responsable del préstamo de maestros
     */
    public List<String> getAcompaniantes() {
        return acompaniantes;
    }

    /**
     * Establece la lista de acompañantes del responsable del préstamo de maestros.
     * 
     * @param acompaniantes La lista de acompañantes del responsable del préstamo de maestros
     */
    public void setAcompaniantes(List<String> acompaniantes) {
        this.acompaniantes = acompaniantes;
    }
}