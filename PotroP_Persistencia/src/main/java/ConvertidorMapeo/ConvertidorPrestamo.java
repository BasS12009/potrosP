/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.PrestamoMapeo;
import entidades.Prestamo;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class ConvertidorPrestamo {
    
    /**
     * Convierte una entidad de tipo Prestamo a una entidad de mapeo PrestamoMapeo.
     * 
     * @param prestamo la entidad Prestamo a convertir.
     * @return la entidad de mapeo PrestamoMapeo.
     */
    public PrestamoMapeo convertirEntidadAMapeo(Prestamo prestamo) {
        if (prestamo.getId() != null) {
            ObjectId objectId = new ObjectId(prestamo.getId());
            return new PrestamoMapeo(
                objectId,
                prestamo.getMotivo(),
                prestamo.getInicio(),
                prestamo.getFin(),
                prestamo.getPlacaVehiculo(),
                prestamo.getCorreoEmpleado()
            );
        }
        return new PrestamoMapeo(
            prestamo.getMotivo(),
            prestamo.getInicio(),
            prestamo.getFin(),
            prestamo.getPlacaVehiculo(),
            prestamo.getCorreoEmpleado()
        );
    }

    /**
     * Convierte una entidad de mapeo PrestamoMapeo a una entidad Prestamo.
     * 
     * @param prestamoMapeo la entidad de mapeo PrestamoMapeo a convertir.
     * @return la entidad Prestamo.
     */
    public Prestamo convertirMapeoAEntidad(PrestamoMapeo prestamoMapeo) {
        if (prestamoMapeo != null) {
            String id = prestamoMapeo.getId() != null ? prestamoMapeo.getId().toHexString() : null;
            return new Prestamo(
                id,
                prestamoMapeo.getMotivo(),
                prestamoMapeo.getInicio(),
                prestamoMapeo.getFin(),
                prestamoMapeo.getPlacaVehiculo(),
                prestamoMapeo.getCorreoEmpleado()
            );
        }
        return null;
    }

}
