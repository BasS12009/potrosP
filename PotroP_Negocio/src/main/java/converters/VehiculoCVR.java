/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.VehiculoDTO;
import entidades.Vehiculo;
import exceptions.BisnessException;

/**
 *
 * @author diana
 */
public class VehiculoCVR {

    public Vehiculo convertir_Vehiculo(VehiculoDTO dto) throws BisnessException{
        if (dto == null) {
            throw new BisnessException("el vehiculo necesita ser diferente de nulo para ser convertido a entidad");
        }
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

    public VehiculoDTO convertir_DTO(Vehiculo entidad) throws BisnessException{
        if (entidad == null) {
            throw new BisnessException("el vehiculo necesita ser diferente de nulo para ser convertido a DTO");
        }
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