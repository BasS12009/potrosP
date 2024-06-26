/**
 * VehiculoCVR.java
 * 
 * Clase encargada de convertir entre objetos de tipo VehiculoDTO y Vehiculo.
 * 
 * Esta clase proporciona métodos para convertir entre objetos de tipo 
 * VehiculoDTO y Vehiculo, permitiendo la transferencia de datos entre capas 
 * de la aplicación.
 */
package converters;

import dtos.VehiculoDTO;
import entidades.Vehiculo;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class VehiculoCVR {
    
    /**
     * Convierte un objeto VehiculoDTO en un objeto Vehiculo.
     * 
     * @param vehiculoDTO El objeto VehiculoDTO a convertir.
     * @return El objeto Vehiculo resultante de la conversión.
     */
    public Vehiculo convertir_Entidad(VehiculoDTO vehiculoDTO){
        String marca =  vehiculoDTO.getMarca();
        String modelo = vehiculoDTO.getModelo();
        int año = vehiculoDTO.getAño();
        String tipo = vehiculoDTO.getPlaca();
        String placa = vehiculoDTO.getPlaca();
        return new Vehiculo(marca, modelo, año, tipo, placa);
    }
    
    /**
     * Convierte un objeto Vehiculo en un objeto VehiculoDTO.
     * 
     * @param vehiculo El objeto Vehiculo a convertir.
     * @return El objeto VehiculoDTO resultante de la conversión.
     */
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