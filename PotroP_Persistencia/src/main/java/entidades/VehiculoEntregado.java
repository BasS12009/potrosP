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
    
    private String carroceria;  // Estado de la carrocería
    private int combustible;    // Nivel de combustible
    private String estadoVehiculo;  // Estado general del vehículo
    private String llantas;     // Estado de las llantas

    /**
     * Constructor de la clase VehiculoEntregado.
     * 
     * @param id Identificador único del vehículo
     * @param numVehiculo Número de vehículo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param año Año de fabricación del vehículo
     * @param tipo Tipo de vehículo
     * @param placa Placa del vehículo
     * @param capacidad Capacidad del vehículo
     * @param carroceria Estado de la carrocería
     * @param combustible Nivel de combustible
     * @param estadoVehiculo Estado general del vehículo
     * @param llantas Estado de las llantas
     */
    public VehiculoEntregado(String id, int numVehiculo, String marca, String modelo, 
                             int año, String tipo, String placa, String capacidad,
                             String carroceria, int combustible, String estadoVehiculo, String llantas) {
        super(id, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
    }

    /**
     * Obtiene el estado de la carrocería.
     * 
     * @return El estado de la carrocería
     */
    public String getCarroceria() {
        return carroceria;
    }

    /**
     * Establece el estado de la carrocería.
     * 
     * @param carroceria El estado de la carrocería
     */
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    /**
     * Obtiene el nivel de combustible.
     * 
     * @return El nivel de combustible
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * Establece el nivel de combustible.
     * 
     * @param combustible El nivel de combustible
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    /**
     * Obtiene el estado general del vehículo.
     * 
     * @return El estado general del vehículo
     */
    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    /**
     * Establece el estado general del vehículo.
     * 
     * @param estadoVehiculo El estado general del vehículo
     */
    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    /**
     * Obtiene el estado de las llantas.
     * 
     * @return El estado de las llantas
     */
    public String getLlantas() {
        return llantas;
    }

    /**
     * Establece el estado de las llantas.
     * 
     * @param llantas El estado de las llantas
     */
    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    /**
     * Representa el objeto VehiculoEntregado como una cadena de caracteres.
     * 
     * @return Una cadena de caracteres que representa el objeto VehiculoEntregado
     */
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