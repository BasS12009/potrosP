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

    /**
     * Devuelve la marca del vehículo.
     *
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca La nueva marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo El nuevo modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve el año de fabricación del vehículo.
     *
     * @return El año de fabricación del vehículo.
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece el año de fabricación del vehículo.
     *
     * @param año El nuevo año de fabricación del vehículo.
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Devuelve el tipo de vehículo.
     *
     * @return El tipo de vehículo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de vehículo.
     *
     * @param tipo El nuevo tipo de vehículo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve la placa del vehículo.
     *
     * @return La placa del vehículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del vehículo.
     *
     * @param placa La nueva placa del vehículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

 

    @Override
    public String toString() {
        return  modelo +  placa ;
    }



   
    

    /**
     * Método que proporciona una representación en forma de cadena de
     * caracteres del objeto VehiculoDTO.
     *
     * @return Una cadena que representa el vehículo, incluyendo la marca, el
     * modelo y el tipo.
     */
    
}
