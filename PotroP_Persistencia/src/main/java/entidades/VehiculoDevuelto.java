/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author caarl
 */
/**
 * VehiculoDevuelto.java
 * 
 * La clase VehiculoDevuelto extiende de Vehiculo y representa un vehículo 
 * que ha sido devuelto después de un traslado, incluyendo información 
 * sobre su estado al momento de la devolución.
 */

/**
 * La clase VehiculoDevuelto representa un vehículo devuelto después de un traslado,
 * incluyendo todos los atributos de Vehiculo más información adicional sobre
 * el estado de la carrocería, nivel de combustible, estado general del vehículo,
 * estado de las llantas y kilómetros recorridos.
 */
public class VehiculoDevuelto extends Vehiculo {
    
    
    private String carroceria;  // Estado de la carrocería al devolverse
    private int combustible;    // Nivel de combustible al devolverse
    private String estadoVehiculo;  // Estado general del vehículo al devolverse
    private String llantas;     // Estado de las llantas al devolverse
    
    
    /**
     * 
     */
    public VehiculoDevuelto() {
    }

    /**
     * 
     * @param carroceria
     * @param combustible
     * @param estadoVehiculo
     * @param llantas 
     */
    public VehiculoDevuelto(String carroceria, int combustible, String 
            estadoVehiculo, String llantas) {
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
    }

    public VehiculoDevuelto(String carroceria, int combustible, 
            String estadoVehiculo, String llantas, int numVehiculo, 
            String marca, String modelo, int año, String tipo, String placa, 
            String capacidad) {
        super(numVehiculo, marca, modelo, año, tipo, placa, capacidad);
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
    }

    
    
    /**
     * Constructor de la clase VehiculoDevuelto.
     * 
     * @param id Identificador único del vehículo
     * @param numVehiculo Número de vehículo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param año Año de fabricación del vehículo
     * @param tipo Tipo de vehículo
     * @param placa Placa del vehículo
     * @param capacidad Capacidad del vehículo
     * @param carroceria Estado de la carrocería al devolverse
     * @param combustible Nivel de combustible al devolverse
     * @param estadoVehiculo Estado general del vehículo al devolverse
     * @param llantas Estado de las llantas al devolverse
     * @param kilometrosRecorridos Kilómetros recorridos durante el traslado
     * @param observaciones Observaciones adicionales sobre el estado del vehículo
     */
    public VehiculoDevuelto(String id, int numVehiculo, String marca, String modelo, 
                            int año, String tipo, String placa, String capacidad,
                            String carroceria, int combustible, String estadoVehiculo, 
                            String llantas, int kilometrosRecorridos, String observaciones) {
        super(id, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
       
    }

    // Getters y setters

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumVehiculo() {
        return numVehiculo;
    }

    public void setNumVehiculo(int numVehiculo) {
        this.numVehiculo = numVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    

    /**
     * Representa el objeto VehiculoDevuelto como una cadena de caracteres.
     * 
     * @return Una cadena de caracteres que representa el objeto VehiculoDevuelto
     */
    @Override
    public String toString() {
        return super.toString() + ", VehiculoDevuelto{" +
               "carroceria='" + carroceria + '\'' +
               ", combustible=" + combustible +
               ", estadoVehiculo='" + estadoVehiculo + '\'' +
               ", llantas='" + llantas + '\'' +
               '}';
    }
}