/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.VehiculoMapeo;
import entidades.Vehiculo;

/**
 * Clase encargada de convertir entre Entidad Vehiculo y VehiculoMapeo.
 */
public class ConvertidorVehiculo {
    
    /**
     * Convierte una entidad de tipo Vehiculo a una entidad de mapeo VehiculoMapeo.
     * 
     * @param vehiculo la entidad Vehiculo a convertir.
     * @return la entidad de mapeo VehiculoMapeo, o null si la entidad Vehiculo es null.
     */
    public VehiculoMapeo convertirEntidadAMapeo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            return null;
        }
        return new VehiculoMapeo(
            vehiculo.getId(),
            vehiculo.getNumVehiculo(),
            vehiculo.getMarca(),
            vehiculo.getModelo(),
            vehiculo.getAño(),
            vehiculo.getTipo(),
            vehiculo.getPlaca(),
            vehiculo.getCapacidad()
        );
    }

    /**
     * Convierte una entidad de mapeo VehiculoMapeo a una entidad de tipo Vehiculo.
     * 
     * @param vehiculoMapeo la entidad de mapeo VehiculoMapeo a convertir.
     * @return la entidad Vehiculo, o null si la entidad de mapeo VehiculoMapeo es null.
     */
    public Vehiculo convertirMapeoAEntidad(VehiculoMapeo vehiculoMapeo) {
        if (vehiculoMapeo == null) {
            return null;
        }
        return new Vehiculo(
            vehiculoMapeo.getId(),
            vehiculoMapeo.getNumVehiculo(),
            vehiculoMapeo.getMarca(),
            vehiculoMapeo.getModelo(),
            vehiculoMapeo.getAño(),
            vehiculoMapeo.getTipo(),
            vehiculoMapeo.getPlaca(),
            vehiculoMapeo.getCapacidad()
        );
    }
}