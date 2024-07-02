/**
 * Vehículo.java
 * 
 * La clase Vehiculo representa un vehículo con sus atributos básicos como 
 * marca, modelo, año, tipo y placa;
 * 
 * Esta clase proporciona métodos para acceder y modificar estos atributos, 
 * así como un método para obtener una representación en cadena del vehículo.
 */
package entidades;

import org.bson.types.ObjectId;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class Vehiculo {
   
    private String id;
    private int numVehiculo;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String placa;
    private String capacidad;

    public Vehiculo(String id, int numVehiculo, String marca, String modelo, int año, String tipo, String placa, String capacidad) {
        this.id = id;
        this.numVehiculo = numVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
        this.capacidad = capacidad;
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
    
    
}
