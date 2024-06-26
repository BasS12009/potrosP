/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDateTime;

/**
 *
 * @author skevi
 */
public class Traslado {
    
    // Atributos del traslado
    private int id;                           // identificador del traslado
    private int numTraslado;                  // Número de traslado
    private String destino;                   // Destino del traslado
    private int personas;                     // Número de personas en el traslado
    private LocalDateTime fechaHoraSalida;    // Fecha y hora de salida del traslado
    private LocalDateTime fechaHoraRegreso;   // Fecha y hora de regreso del traslado
    private String motivo;                    // Motivo del traslado
    private String carroceria;                // Descripción de la carrocería del vehículo
    private String llantas;                   // Descripción de las llantas del vehículo
    private int combustible;                  // Cantidad de combustible al momento del traslado
    private String placa;                     // Placa del vehículo utilizado
    private String correoEmpleado;            // Correo del empleado responsable
    private String correoChofer;              // Correo del chofer
    private boolean estado;                   // Estado del traslado (activo/inactivo)

    /**
     * Constructor por defecto.
     */
    public Traslado() {
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos 
     * excepto el id.
     * 
     * @param numTraslado número de traslado.
     * @param destino destino del traslado.
     * @param personas número de personas en el traslado.
     * @param fechaHoraSalida fecha y hora de salida del traslado.
     * @param fechaHoraRegreso fecha y hora de regreso del traslado.
     * @param motivo motivo del traslado.
     * @param carroceria descripción de la carrocería del vehículo.
     * @param llantas descripción de las llantas del vehículo.
     * @param combustible cantidad de combustible.
     * @param placa placa del vehículo.
     * @param correoEmpleado correo del empleado responsable.
     * @param correoChofer correo del chofer.
     * @param estado estado del traslado.
     */
    public Traslado(int numTraslado, String destino, int personas, 
            LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso, 
            String motivo, String carroceria, String llantas, int combustible, 
            String placa, String correoEmpleado, String correoChofer, boolean estado) {
        this.numTraslado = numTraslado;
        this.destino = destino;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.motivo = motivo;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.combustible = combustible;
        this.placa = placa;
        this.correoEmpleado = correoEmpleado;
        this.correoChofer = correoChofer;
        this.estado = estado;
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos.
     * 
     * @param id identificador 
     * @param numTraslado número de traslado.
     * @param destino destino del traslado.
     * @param personas número de personas en el traslado.
     * @param fechaHoraSalida fecha y hora de salida del traslado.
     * @param fechaHoraRegreso fecha y hora de regreso del traslado.
     * @param motivo motivo del traslado.
     * @param carroceria descripción de la carrocería del vehículo.
     * @param llantas descripción de las llantas del vehículo.
     * @param combustible cantidad de combustible.
     * @param placa placa del vehículo.
     * @param correoEmpleado correo del empleado responsable.
     * @param correoChofer correo del chofer.
     * @param estado estado del traslado.
     */
    public Traslado(int id, int numTraslado, String destino, int personas, 
            LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraRegreso,
            String motivo, String carroceria, String llantas, int combustible, 
            String placa, String correoEmpleado, String correoChofer, boolean estado) {
        this.id = id;
        this.numTraslado = numTraslado;
        this.destino = destino;
        this.personas = personas;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraRegreso = fechaHoraRegreso;
        this.motivo = motivo;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.combustible = combustible;
        this.placa = placa;
        this.correoEmpleado = correoEmpleado;
        this.correoChofer = correoChofer;
        this.estado = estado;
    }
    

    // Métodos getter y setter para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumTraslado() {
        return numTraslado;
    }

    public void setNumTraslado(int numTraslado) {
        this.numTraslado = numTraslado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
}
