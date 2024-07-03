/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.VehiculoEntregadoDTO;
import entidades.VehiculoEntregado;

/**
 *
 * @author caarl
 */
public class VehiculoEntregadoCVR {
    
    public VehiculoEntregado convertir_Entregado(VehiculoEntregadoDTO vehiculoDTO){
        
        String carroceria = vehiculoDTO.getCarroceria();  
        int combustible = vehiculoDTO.getCombustible();    
        String estadoVehiculo = vehiculoDTO.getEstadoVehiculo();  
        String llantas = vehiculoDTO.getLlantas();
        return new VehiculoEntregado(carroceria, combustible, estadoVehiculo, llantas);
    }
    
    public VehiculoEntregadoDTO convertir_EntregadoDTO(VehiculoEntregado vehiculo){
        String carroceria = vehiculo.getCarroceria();  
        int combustible = vehiculo.getCombustible();    
        String estadoVehiculo = vehiculo.getEstadoVehiculo();  
        String llantas = vehiculo.getLlantas();
        return new VehiculoEntregadoDTO(carroceria, combustible, estadoVehiculo, llantas);
    }
    
}
