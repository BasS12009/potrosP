/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.VehiculoMapeo;
import entidades.Vehiculo;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class ConvertidorVehiculo {
    
    /**
     * Convierte una entidad de tipo Vehiculo a una entidad de mapeo VehiculoMapeo.
     * 
     * @param vehiculo la entidad Vehiculo a convertir.
     * @return la entidad de mapeo VehiculoMapeo.
     */
    public VehiculoMapeo convertirEntidadAMapeo(Vehiculo vehiculo) {
        if (vehiculo.getId() != null) {
            ObjectId objectId = new ObjectId(vehiculo.getId());
            return new VehiculoMapeo(
                objectId,
                vehiculo.getNumVehiculo(),
                vehiculo.getMarca(),
                vehiculo.getModelo(),
                vehiculo.getAño(),
                vehiculo.getTipo(),
                vehiculo.getPlaca(),
                vehiculo.getCapacidad()
            );
        }
        return new VehiculoMapeo(
            null,
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
     * Convierte una entidad de mapeo VehiculoMapeo a una entidad Vehiculo.
     * 
     * @param vehiculoMapeo la entidad de mapeo VehiculoMapeo a convertir.
     * @return la entidad Vehiculo.
     */
    public Vehiculo convertirMapeoAEntidad(VehiculoMapeo vehiculoMapeo) {
        if (vehiculoMapeo != null) {
            String id = vehiculoMapeo.getId() != null ? vehiculoMapeo.getId().toHexString() : null;
            return new Vehiculo(
                id,
                vehiculoMapeo.getNumVehiculo(),
                vehiculoMapeo.getMarca(),
                vehiculoMapeo.getModelo(),
                vehiculoMapeo.getAño(),
                vehiculoMapeo.getTipo(),
                vehiculoMapeo.getPlaca(),
                vehiculoMapeo.getCapacidad()
            );
        }
        return null;
    }
}
