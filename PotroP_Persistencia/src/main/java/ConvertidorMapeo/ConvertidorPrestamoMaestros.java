/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.PrestamoMaestrosMapeo;
import entidades.PrestamoMaestros;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class ConvertidorPrestamoMaestros {
    /**
     * Convierte una entidad de tipo PrestamoMaestros a una entidad de mapeo PrestamoMaestrosMapeo.
     * 
     * @param prestamoMaestros la entidad PrestamoMaestros a convertir.
     * @return la entidad de mapeo PrestamoMaestrosMapeo.
     */
    public PrestamoMaestrosMapeo convertirEntidadAMapeo(PrestamoMaestros prestamoMaestros) {
        if (prestamoMaestros.getId() != null) {
            ObjectId objectId = new ObjectId(prestamoMaestros.getId());
            return new PrestamoMaestrosMapeo(
                objectId,
                prestamoMaestros.getFechaPrestamo(),
                prestamoMaestros.getDepartamento(),
                prestamoMaestros.getCantidadPersonas(),
                prestamoMaestros.getMotivo(),
                prestamoMaestros.getPlantelOrigen(),
                prestamoMaestros.getPlantelDestino(),
                prestamoMaestros.getVehiculo(),
                prestamoMaestros.getCorreoResponsable(),
                prestamoMaestros.getAcompaniantes()
            );
        }
        return new PrestamoMaestrosMapeo(
            prestamoMaestros.getFechaPrestamo(),
            prestamoMaestros.getDepartamento(),
            prestamoMaestros.getCantidadPersonas(),
            prestamoMaestros.getMotivo(),
            prestamoMaestros.getPlantelOrigen(),
            prestamoMaestros.getPlantelDestino(),
            prestamoMaestros.getVehiculo(),
            prestamoMaestros.getCorreoResponsable(),
            prestamoMaestros.getAcompaniantes()
        );
    }

    /**
     * Convierte una entidad de mapeo PrestamoMaestrosMapeo a una entidad PrestamoMaestros.
     * 
     * @param prestamoMaestrosMapeo la entidad de mapeo PrestamoMaestrosMapeo a convertir.
     * @return la entidad PrestamoMaestros.
     */
    public PrestamoMaestros convertirMapeoAEntidad(PrestamoMaestrosMapeo prestamoMaestrosMapeo) {
        if (prestamoMaestrosMapeo != null) {
            String id = prestamoMaestrosMapeo.getId() != null ? prestamoMaestrosMapeo.getId().toHexString() : null;
            return new PrestamoMaestros(
                id,
                prestamoMaestrosMapeo.getFechaPrestamo(),
                prestamoMaestrosMapeo.getDepartamento(),
                prestamoMaestrosMapeo.getCantidadPersonas(),
                prestamoMaestrosMapeo.getMotivo(),
                prestamoMaestrosMapeo.getPlantelOrigen(),
                prestamoMaestrosMapeo.getPlantelDestino(),
                prestamoMaestrosMapeo.getVehiculo(),
                prestamoMaestrosMapeo.getCorreoResponsable(),
                prestamoMaestrosMapeo.getAcompaniantes()
            );
        }
        return null;
    }
}


