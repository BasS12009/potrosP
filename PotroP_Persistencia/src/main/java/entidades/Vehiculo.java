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

/**
 * La clase Vehiculo representa un vehículo con atributos tales como id, número de vehículo, marca, modelo, año, tipo, placa y capacidad.
 * Esta clase proporciona métodos para obtener y establecer estos atributos, así como un método para representar el objeto como una cadena de caracteres.
 */
public class Vehiculo {
   
   private ObjectId id;
    private int numVehiculo;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String placa;
    private String capacidad;

    public Vehiculo() {
    }

    public Vehiculo(int numVehiculo, String marca, String modelo, int año, String tipo, String placa, String capacidad) {
        this.numVehiculo = numVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public Vehiculo(ObjectId id, int numVehiculo, String marca, String modelo, int año, String tipo, String placa, String capacidad) {
        this.id = id;
        this.numVehiculo = numVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
        this.capacidad = capacidad;
    }
    
    

    // Getters y setters

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    // ... otros getters y setters ...

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    /**
     * Obtiene el número del vehículo.
     * 
     * @return El número del vehículo
     */
    public int getNumVehiculo() {
        return numVehiculo;
    }

    /**
     * Establece el número del vehículo.
     * 
     * @param numVehiculo El número del vehículo
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

    /**
     * Representa el objeto Vehiculo como una cadena de caracteres.
     * 
     * @return Una cadena de caracteres que representa el objeto Vehiculo
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", numVehiculo=" 
                + numVehiculo + ", marca=" + marca + ", modelo=" + modelo 
                + ", año=" + año + ", tipo=" + tipo + ", placa=" + placa 
                + ", capacidad=" + capacidad + '}';
    }
    
}