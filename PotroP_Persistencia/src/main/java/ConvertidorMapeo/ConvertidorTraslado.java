/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.TrasladoMapeo;
import entidades.Traslado;
import org.bson.types.ObjectId;

/**
 *
 * @author diana
 */
public class ConvertidorTraslado {
    /**
     * Convierte una entidad de tipo Traslado a una entidad de mapeo TrasladoMapeo.
     * 
     * @param traslado la entidad Traslado a convertir.
     * @return la entidad de mapeo TrasladoMapeo.
     */
    public TrasladoMapeo convertirEntidadAMapeo(Traslado traslado) {
        if (traslado.getId() != null) {
            ObjectId objectId = new ObjectId(traslado.getId());
            return new TrasladoMapeo(
                objectId,
                traslado.getFolio(),
                traslado.getMotivo(),
                traslado.getPersonas(),
                traslado.getFechaHoraSalida(),
                traslado.getFechaHoraRegreso(),
                traslado.isDisponibilidad(),
                traslado.getVehiculo(),
                traslado.getEstadoVehiculo(),
                traslado.getLlantas(),
                traslado.getCarroceria(),
                traslado.getCombustible(),
                traslado.getCorreoEmpleado(),
                traslado.getCorreoChofer(),
                traslado.isEstado()
            );
        }
        return new TrasladoMapeo(
            traslado.getFolio(),
            traslado.getMotivo(),
            traslado.getPersonas(),
            traslado.getFechaHoraSalida(),
            traslado.getFechaHoraRegreso(),
            traslado.isDisponibilidad(),
            traslado.getVehiculo(),
            traslado.getEstadoVehiculo(),
            traslado.getLlantas(),
            traslado.getCarroceria(),
            traslado.getCombustible(),
            traslado.getCorreoEmpleado(),
            traslado.getCorreoChofer(),
            traslado.isEstado()
        );
    }

    /**
     * Convierte una entidad de mapeo TrasladoMapeo a una entidad Traslado.
     * 
     * @param trasladoMapeo la entidad de mapeo TrasladoMapeo a convertir.
     * @return la entidad Traslado.
     */
    public Traslado convertirMapeoAEntidad(TrasladoMapeo trasladoMapeo) {
        if (trasladoMapeo != null) {
            String id = trasladoMapeo.getId() != null ? trasladoMapeo.getId().toHexString() : null;
            return new Traslado(
                id,
                trasladoMapeo.getFolio(),
                trasladoMapeo.getMotivo(),
                trasladoMapeo.getPersonas(),
                trasladoMapeo.getFechaHoraSalida(),
                trasladoMapeo.getFechaHoraRegreso(),
                trasladoMapeo.isDisponibilidad(),
                trasladoMapeo.getVehiculo(),
                trasladoMapeo.getEstadoVehiculo(),
                trasladoMapeo.getLlantas(),
                trasladoMapeo.getCarroceria(),
                trasladoMapeo.getCombustible(),
                trasladoMapeo.getCorreoEmpleado(),
                trasladoMapeo.getCorreoChofer(),
                trasladoMapeo.isEstado()
            );
        }
        return null;
    }
}

