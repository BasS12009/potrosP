/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author caarl
 */
public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String placa;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
    }

    public Vehiculo(int id, String marca, String modelo, int año, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
