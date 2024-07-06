/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.VehiculoEntregadoDTO;
import entidades.VehiculoEntregado;
import exceptions.BisnessException;

/**
 *
 * @author caarl
 */
public class VehiculoEntregadoCVR {
    
    public VehiculoEntregado convertir_Entregado(VehiculoEntregadoDTO vehiculoDTO) throws BisnessException{
        if (vehiculoDTO == null) {
            throw new BisnessException("el vehiculoEntregado necesita ser diferente de nulo para ser convertido a entidad");
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
        
        return new VehiculoEntregado(carroceria, combustible, estadoVehiculo, 
           llantas, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
    }
    
    public VehiculoEntregadoDTO convertir_EntregadoDTO(VehiculoEntregado vehiculo) throws BisnessException{
        if (vehiculo == null) {
            throw new BisnessException("el vehiculoEntregado necesita ser diferente de nulo para ser convertido a entidad");
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
        
        return new VehiculoEntregadoDTO(carroceria, combustible, estadoVehiculo, 
              llantas, numVehiculo, marca, modelo, año, tipo, placa, capacidad);
    }
    
}
