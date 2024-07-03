/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.VehiculoDevueltoDTO;
import entidades.VehiculoDevuelto;

/**
 *
 * @author caarl
 */
public class VehiculoDevueltoCVR {
    
    public VehiculoDevuelto convertir_Devuelto(VehiculoDevueltoDTO vehiculoDTO){
        
        String carroceria = vehiculoDTO.getCarroceria();  
        int combustible = vehiculoDTO.getCombustible();    
        String estadoVehiculo = vehiculoDTO.getEstadoVehiculo();  
        String llantas = vehiculoDTO.getLlantas();
        return new VehiculoDevuelto(carroceria, combustible, estadoVehiculo, llantas);
    }
    
    public VehiculoDevueltoDTO convertir_DevueltoDTO(VehiculoDevuelto vehiculo){
        String carroceria = vehiculo.getCarroceria();  
        int combustible = vehiculo.getCombustible();    
        String estadoVehiculo = vehiculo.getEstadoVehiculo();  
        String llantas = vehiculo.getLlantas();
        return new VehiculoDevueltoDTO(carroceria, combustible, estadoVehiculo, llantas);
    }
}
