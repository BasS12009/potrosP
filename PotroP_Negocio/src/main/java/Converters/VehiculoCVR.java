/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Converters;

import DTO.VehiculoDTO;
import entidades.Vehiculo;

/**
 *
 * @author skevi
 */
public class VehiculoCVR {
    
    public Vehiculo convertir_Entidad(VehiculoDTO vehiculoDTO){
        String marca =  vehiculoDTO.getMarca();
        String modelo = vehiculoDTO.getModelo();
        int año = vehiculoDTO.getAño();
        String tipo = vehiculoDTO.getPlaca();
        String placa = vehiculoDTO.getPlaca();
        return new Vehiculo(marca, modelo, año, tipo, placa);
    }
    
    public VehiculoDTO convertir_DTO(Vehiculo vehiculo){
        int id = vehiculo.getId();
        String marca = vehiculo.getMarca();
        String modelo = vehiculo.getModelo();
        int año = vehiculo.getAño();
        String tipo = vehiculo.getTipo();
        String placa = vehiculo.getPlaca();
        return new VehiculoDTO(id, marca, modelo, año, tipo, placa);
    }
}
