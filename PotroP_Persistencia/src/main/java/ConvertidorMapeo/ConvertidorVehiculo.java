/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.VehiculoMapeo;
import entidades.Vehiculo;

public class ConvertidorVehiculo {
    
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