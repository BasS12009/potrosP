/**
 * VehiculoDTO.java
 * 
* Clase que representa un vehículo.
 */
package DTO;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class VehiculoDTO {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String placa;

   /**
     * Constructor por omisión de la clase VehiculoDTO.
     */
    public VehiculoDTO() {
    }

    /**
     * Constructor de la clase VehiculoDTO que inicializa todos los atributos 
     * excepto el id del vehículo.
     * 
     * @param marca La marca del vehículo.
     * @param modelo El modelo del vehículo.
     * @param año El año de fabricación del vehículo.
     * @param tipo El tipo de vehículo.
     * @param placa El número de placa del vehículo.
     */
    public VehiculoDTO(String marca, String modelo, int año, String tipo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
    }

    /**
     * Constructor de la clase VehiculoDTO que inicializa todos los atributos
     * del vehículo.
     * 
     * @param id El identificador único del vehículo.
     * @param marca La marca del vehículo.
     * @param modelo El modelo del vehículo.
     * @param año El año de fabricación del vehículo.
     * @param tipo El tipo de vehículo.
     * @param placa El número de placa del vehículo.
     */
    public VehiculoDTO(int id, String marca, String modelo, int año, String tipo, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.placa = placa;
    }

    /**
     * Método getter para el atributo id.
     * 
     * @return El identificador único del vehículo.
     */
    public int getId() {
        return id;
    }

    /**
     * Método setter para el atributo id.
     * 
     * @param id El identificador único del vehículo.
     */
    public void setId(int id) {
        this.id = id;
    }

    // Los mismos métodos getter y setter se repiten para los demás atributos de la clase

    /**
     * Método que proporciona una representación en forma de cadena de caracteres del objeto VehiculoDTO.
     * 
     * @return Una cadena que representa el vehículo, incluyendo la marca, el modelo y el tipo.
     */
    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + tipo;
    }
}