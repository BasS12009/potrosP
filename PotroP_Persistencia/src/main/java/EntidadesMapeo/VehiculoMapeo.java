/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMapeo;

import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
/**
 * La clase VehiculoMapeo representa un vehículo con atributos básicos y un identificador ObjectId.
 * Es utilizada para mapear los datos de un vehículo en un contexto de persistencia o mapeo de objetos.
 */
public class VehiculoMapeo {
    
    private ObjectId id;  // Identificador único del vehículo
    private int numVehiculo;  // Número de vehículo
    private String marca;  // Marca del vehículo
    private String modelo;  // Modelo del vehículo
    private int año;  // Año de fabricación del vehículo
    private String tipo;  // Tipo de vehículo (por ejemplo, sedan, SUV, etc.)
    private String placa;  // Placa del vehículo
    private String capacidad;  // Capacidad del vehículo (por ejemplo, número de asientos)
  

     /**
     * Constructor de la clase VehiculoMapeo.
     * 
     * @param id Identificador único del vehículo
     * @param numVehiculo Número de vehículo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param año Año de fabricación del vehículo
     * @param tipo Tipo de vehículo
     * @param placa Placa del vehículo
     * @param capacidad Capacidad del vehículo
     */
    public VehiculoMapeo(ObjectId id, int numVehiculo, String marca, String modelo, int año, String tipo, String placa, String capacidad) {
        this.id = id;
        this.numVehiculo = numVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
        this.capacidad = capacidad;
    }

     /**
     * Obtiene el identificador único del vehículo.
     * 
     * @return El identificador único del vehículo
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del vehículo.
     * 
     * @param id El identificador único del vehículo
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el número de vehículo.
     * 
     * @return El número de vehículo
     */
    public int getNumVehiculo() {
        return numVehiculo;
    }

    /**
     * Establece el número de vehículo.
     * 
     * @param numVehiculo El número de vehículo
     */
    public void setNumVehiculo(int numVehiculo) {
        this.numVehiculo = numVehiculo;
    }

    /**
     * Obtiene la marca del vehículo.
     * 
     * @return La marca del vehículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * 
     * @param marca La marca del vehículo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del vehículo.
     * 
     * @return El modelo del vehículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     * 
     * @param modelo El modelo del vehículo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el año de fabricación del vehículo.
     * 
     * @return El año de fabricación del vehículo
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece el año de fabricación del vehículo.
     * 
     * @param año El año de fabricación del vehículo
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Obtiene el tipo de vehículo.
     * 
     * @return El tipo de vehículo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de vehículo.
     * 
     * @param tipo El tipo de vehículo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la placa del vehículo.
     * 
     * @return La placa del vehículo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del vehículo.
     * 
     * @param placa La placa del vehículo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtiene la capacidad del vehículo.
     * 
     * @return La capacidad del vehículo
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad del vehículo.
     * 
     * @param capacidad La capacidad del vehículo
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
    

