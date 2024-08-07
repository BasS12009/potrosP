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
    
   
      
    private String carroceria;      // Tipo de carrocería del vehículo devuelto
    private int combustible;        // Nivel de combustible del vehículo devuelto
    private String estadoVehiculo;  // Estado general del vehículo devuelto
    private String llantas;         // Estado de las llantas del vehículo devuelto
    
     /**
     * Constructor vacío de la clase VehiculoDevuelto.
     */
    public VehiculoDevuelto() {
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos de la clase,
     * incluyendo los de la clase padre Vehiculo.
     * 
     * @param carroceria Tipo de carrocería del vehículo devuelto.
     * @param combustible Nivel de combustible del vehículo devuelto.
     * @param estadoVehiculo Estado general del vehículo devuelto.
     * @param llantas Estado de las llantas del vehículo devuelto.
     * @param numVehiculo Número de identificación del vehículo.
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param año Año de fabricación del vehículo.
     * @param tipo Tipo de vehículo.
     * @param placa Placa del vehículo.
     * @param capacidad Capacidad del vehículo.
     */
    public VehiculoDevuelto(String carroceria, int combustible, String estadoVehiculo, String llantas, int numVehiculo, String marca, String modelo, int año, String tipo, 
            String placa, String capacidad) {
        super(null, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos de la clase,
     * incluyendo los de la clase padre Vehiculo y el identificador ObjectId.
     * 
     * @param carroceria Tipo de carrocería del vehículo devuelto.
     * @param combustible Nivel de combustible del vehículo devuelto.
     * @param estadoVehiculo Estado general del vehículo devuelto.
     * @param llantas Estado de las llantas del vehículo devuelto.
     * @param id Identificador único del vehículo.
     * @param numVehiculo Número de identificación del vehículo.
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param año Año de fabricación del vehículo.
     * @param tipo Tipo de vehículo.
     * @param placa Placa del vehículo.
     * @param capacidad Capacidad del vehículo.
     */
    public VehiculoDevuelto(String carroceria, int combustible, String estadoVehiculo, String llantas, ObjectId id, 
            int numVehiculo, String marca, String modelo, int año, String tipo, String placa, String capacidad) {
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
        return super.toString() + ", VehiculoDevuelto{" +
               "carroceria='" + carroceria + '\'' +
               ", combustible=" + combustible +
               ", estadoVehiculo='" + estadoVehiculo + '\'' +
               ", llantas='" + llantas + '\'' +
               '}';
    }
}