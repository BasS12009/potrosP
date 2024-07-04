/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.VehiculoDTO;
import entidades.Vehiculo;

/**
 *
 * @author diana
 */
public class VehiculoCVR {

    public Vehiculo convertir_Vehiculo(VehiculoDTO dto) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setNumVehiculo(dto.getNumVehiculo());
        vehiculo.setMarca(dto.getMarca());
        vehiculo.setModelo(dto.getModelo());
        vehiculo.setAño(dto.getAño());
        vehiculo.setTipo(dto.getTipo());
        vehiculo.setPlaca(dto.getPlaca());
        vehiculo.setCapacidad(dto.getCapacidad());
        return vehiculo;
    }

    public VehiculoDTO convertir_DTO(Vehiculo entidad) {
        VehiculoDTO dto = new VehiculoDTO();
        dto.setNumVehiculo(entidad.getNumVehiculo());
        dto.setMarca(entidad.getMarca());
        dto.setModelo(entidad.getModelo());
        dto.setAño(entidad.getAño());
        dto.setTipo(entidad.getTipo());
        dto.setPlaca(entidad.getPlaca());
        dto.setCapacidad(entidad.getCapacidad());
        return dto;
    }
}