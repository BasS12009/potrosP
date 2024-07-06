/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.VehiculoDevueltoDTO;
import entidades.VehiculoDevuelto;
import exceptions.BisnessException;

/**
 *
 * @author caarl
 */
public class VehiculoDevueltoCVR {
    
    public VehiculoDevuelto convertir_Devuelto(VehiculoDevueltoDTO vehiculoDTO) throws BisnessException{
        if (vehiculoDTO == null) {
            throw new BisnessException("el vehiculoDevuelto necesita ser diferente de nulo para ser convertido a entidad");
        }
        String carroceria = vehiculoDTO.getCarroceria();  
        int combustible = vehiculoDTO.getCombustible();    
        String estadoVehiculo = vehiculoDTO.getEstadoVehiculo();  
        String llantas = vehiculoDTO.getLlantas();
        int numVehiculo = 12;
        String marca = vehiculoDTO.getMarca();
        String modelo = vehiculoDTO.getModelo();
        int año = vehiculoDTO.getAño();
        String tipo = vehiculoDTO.getTipo();
        String placa = vehiculoDTO.getPlaca();
        String capacidad = vehiculoDTO.getCapacidad();
        
        return new VehiculoDevuelto(carroceria, combustible, estadoVehiculo, 
           llantas, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
    }
    
    public VehiculoDevueltoDTO convertir_DevueltoDTO(VehiculoDevuelto vehiculo) throws BisnessException{
        if (vehiculo == null) {
            throw new BisnessException("el vehiculoDevuelto necesita ser diferente de nulo para ser convertido a DTO");
        }
        String carroceria = vehiculo.getCarroceria();  
        int combustible = vehiculo.getCombustible();    
        String estadoVehiculo = vehiculo.getEstadoVehiculo();  
        String llantas = vehiculo.getLlantas();
        int numVehiculo = vehiculo.getNumVehiculo();
        String marca = vehiculo.getMarca();
        String modelo = vehiculo.getModelo();
        int año = vehiculo.getAño();
        String tipo = vehiculo.getTipo();
        String placa = vehiculo.getPlaca();
        String capacidad = vehiculo.getCapacidad();
        
        return new VehiculoDevueltoDTO(carroceria, combustible, estadoVehiculo, 
              llantas, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
    }
    
    
}