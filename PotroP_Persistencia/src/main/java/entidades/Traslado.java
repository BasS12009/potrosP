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
    
    private int id;
    private int numTraslado;
    private String destino;
    private int personas;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraRegreso;
    private String motivo;
    private String carroceria;
    private String llantas;
    private int combustible;
    private String placa;
    private String correoEmpleado;
    private String correoChofer;
    private boolean estado;

    public Traslado() {
    }

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
