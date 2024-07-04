
package entidades;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class PrestamoMaestros {
    
    private ObjectId id;
    private LocalDate fechaPrestamo;
    private String departamento;
    private int cantidadPersonas;
    private String motivo;
    private String plantelOrigen;
    private String plantelDestino;
    private Vehiculo vehiculo;  // Cambiado de String a Vehiculo
    private String correoResponsable;
    private List<String> acompaniantes;

    public PrestamoMaestros() {
    }

    public PrestamoMaestros(ObjectId id, LocalDate fechaPrestamo, String departamento, int cantidadPersonas, String motivo, String plantelOrigen, String plantelDestino, Vehiculo vehiculo, String correoResponsable, List<String> acompaniantes) {
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


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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
