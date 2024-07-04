/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author caarl
 */
/**
 * VehiculoEntregado.java
 * 
 * La clase VehiculoEntregado extiende de Vehiculo y representa un vehículo 
 * que ha sido entregado para un traslado, incluyendo información adicional 
 * sobre su estado actual.
 */

/**
 * La clase VehiculoEntregado representa un vehículo entregado para un traslado,
 * incluyendo todos los atributos de Vehiculo más información adicional sobre
 * el estado de la carrocería, nivel de combustible, estado general del vehículo y estado de las llantas.
 */
public class VehiculoEntregado extends Vehiculo {
    
   private String carroceria;
    private int combustible;
    private String estadoVehiculo;
    private String llantas;

    public VehiculoEntregado() {
    }

    public VehiculoEntregado(String carroceria, int combustible, 
            String estadoVehiculo, String llantas, int numVehiculo, 
            String marca, String modelo, int año, String tipo, String placa,
            String capacidad) {
        super(null, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
    }

    public VehiculoEntregado(String carroceria, int combustible, 
            String estadoVehiculo, String llantas, ObjectId id, int numVehiculo, 
            String marca, String modelo, int año, String tipo, String placa, 
            String capacidad) {
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

    // No es necesario sobrescribir los getters y setters de la clase padre

    @Override
    public String toString() {
        return super.toString() + ", VehiculoEntregado{" +
               "carroceria='" + carroceria + '\'' +
               ", combustible=" + combustible +
               ", estadoVehiculo='" + estadoVehiculo + '\'' +
               ", llantas='" + llantas + '\'' +
               '}';
    }
}