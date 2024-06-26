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
public class TrasladoMapeo {

     private ObjectId id;
    private String Folio;
    private String motivo;
    private int personas;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraRegreso;
    private boolean disponibilidad;
    private Vehiculo vehiculo;
    private String estadoVehiculo;
    private String llantas;
    private String carroceria;
    private int combustible;
    private String correoEmpleado;
    private String correoChofer;
    private boolean estado;

    public TrasladoMapeo() {
    }

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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public LocalDateTime getFechaHoraRegreso() {
        return fechaHoraRegreso;
    }

    public void setFechaHoraRegreso(LocalDateTime fechaHoraRegreso) {
        this.fechaHoraRegreso = fechaHoraRegreso;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getCorreoChofer() {
        return correoChofer;
    }

    public void setCorreoChofer(String correoChofer) {
        this.correoChofer = correoChofer;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}