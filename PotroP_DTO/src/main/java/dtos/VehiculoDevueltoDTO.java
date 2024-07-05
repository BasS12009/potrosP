/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author caarl
 */
public class VehiculoDevueltoDTO extends VehiculoDTO{
    
    private String carroceria;  // Estado de la carrocería al devolverse
    private int combustible;    // Nivel de combustible al devolverse
    private String estadoVehiculo;  // Estado general del vehículo al devolverse
    private String llantas;     // Estado de las llantas al devolverse

    
    public VehiculoDevueltoDTO() {
    }
    
    public VehiculoDevueltoDTO(String carroceria, int combustible, 
            String estadoVehiculo, String llantas, int numVehiculo, 
            String marca, String modelo, int año, String tipo, String placa, 
            String capacidad) {
        super(numVehiculo, marca, modelo, año, tipo, placa, capacidad);
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
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

    @Override
    public int getNumVehiculo() {
        return numVehiculo;
    }

    @Override
    public void setNumVehiculo(int numVehiculo) {
        this.numVehiculo = numVehiculo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getAño() {
        return año;
    }

    @Override
    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "VehiculoDevueltoDTO{" + "carroceria=" + carroceria + 
                ", combustible=" + combustible + ", estadoVehiculo=" + 
                estadoVehiculo + ", llantas=" + llantas + '}';
    }
    
    
}
