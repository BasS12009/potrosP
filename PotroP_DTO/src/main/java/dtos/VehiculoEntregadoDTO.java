/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author caarl
 */
public class VehiculoEntregadoDTO extends VehiculoDTO {
     private String carroceria;  // Estado de la carrocería
    private int combustible;    // Nivel de combustible
    private String estadoVehiculo;  // Estado general del vehículo
    private String llantas;     // Estado de las llantas

    public VehiculoEntregadoDTO() {
    }

    public VehiculoEntregadoDTO(String carroceria, int combustible, String estadoVehiculo, String llantas) {
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.estadoVehiculo = estadoVehiculo;
        this.llantas = llantas;
    }

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
    
    
}
