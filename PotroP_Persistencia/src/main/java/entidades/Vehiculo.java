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

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String placa;

    /**
     * Constructor por omisión de la clase Prestamo.
     */
    public Vehiculo() {
    }

    /**
     * Crea un nuevo objeto Vehiculo con los atributos especificados.
     * 
     * @param marca la marca del vehículo.
     * @param modelo el modelo del vehículo.
     * @param año el año del vehículo.
     * @param tipo el tipo del vehículo.
     * @param placa la placa del vehículo.
     */
    public Vehiculo(String marca, String modelo, int año, String tipo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
    }

    /**
     * Crea un nuevo objeto Vehiculo con los atributos especificados, incluyendo su identificador.
     * 
     * @param id el identificador del vehículo.
     * @param marca la marca del vehículo.
     * @param modelo el modelo del vehículo.
     * @param año el año del vehículo.
     * @param tipo el tipo del vehículo.
     * @param placa la placa del vehículo.
     */
    public Vehiculo(int id, String marca, String modelo, int año, String tipo, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
    }

    /**
     * Devuelve el identificador del vehículo.
     * 
     * @return el identificador del vehículo.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del vehículo.
     * 
     * @param id el nuevo identificador del vehículo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve la marca del vehículo.
     * 
     * @return la marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * 
     * @param marca la nueva marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve el modelo del vehículo.
     * 
     * @return el modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     * 
     * @param modelo el nuevo modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve el año del vehículo.
     * 
     * @return el año del vehículo.
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece el año del vehículo.
     * 
     * @param año el nuevo año del vehículo.
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Devuelve el tipo del vehículo.
     * 
     * @return el tipo del vehículo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del vehículo.
     * 
     * @param tipo el nuevo tipo del vehículo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve la placa del vehículo.
     * 
     * @return la placa del vehículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del vehículo.
     * 
     * @param placa la nueva placa del vehículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Devuelve una representación de cadena de texto del vehículo.
     * 
     * @return una representación de cadena de texto del vehículo.
     */
    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + tipo;
    }
}
