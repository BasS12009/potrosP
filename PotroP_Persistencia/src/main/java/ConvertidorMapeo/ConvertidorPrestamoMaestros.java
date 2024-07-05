/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.PrestamoMaestrosMapeo;
import entidades.PrestamoMaestros;


/**
 * Clase encargada de convertir entre Entidad PrestamoMaestros y PrestamoMaestrosMapeo.
 */
public class ConvertidorPrestamoMaestros {

    // Instancia de ConvertidorVehiculo para realizar conversiones de Vehiculo y VehiculoMapeo.
    private ConvertidorVehiculo convertidorVehiculo = new ConvertidorVehiculo();

    
    /**
     * Convierte una entidad de tipo PrestamoMaestros a una entidad de mapeo PrestamoMaestrosMapeo.
     * 
     * @param prestamoMaestros la entidad PrestamoMaestros a convertir.
     * @return la entidad de mapeo PrestamoMaestrosMapeo, o null si la entidad PrestamoMaestros es null.
     */
    public PrestamoMaestrosMapeo convertirEntidadAMapeo(PrestamoMaestros prestamoMaestros) {
        if (prestamoMaestros == null) {
            return null;
        }
        return new PrestamoMaestrosMapeo(
            prestamoMaestros.getId(),
            prestamoMaestros.getFechaPrestamo(),
            prestamoMaestros.getDepartamento(),
            prestamoMaestros.getCantidadPersonas(),
            prestamoMaestros.getMotivo(),
            prestamoMaestros.getPlantelOrigen(),
            prestamoMaestros.getPlantelDestino(),
            convertidorVehiculo.convertirEntidadAMapeo(prestamoMaestros.getVehiculo()),
            prestamoMaestros.getCorreoResponsable(),
            prestamoMaestros.getAcompaniantes()
        );
    }

    /**
     * Convierte una entidad de mapeo PrestamoMaestrosMapeo a una entidad de tipo PrestamoMaestros.
     * 
     * @param prestamoMaestrosMapeo la entidad de mapeo PrestamoMaestrosMapeo a convertir.
     * @return la entidad PrestamoMaestros, o null si la entidad de mapeo PrestamoMaestrosMapeo es null.
     */
    public PrestamoMaestros convertirMapeoAEntidad(PrestamoMaestrosMapeo prestamoMaestrosMapeo) {
        if (prestamoMaestrosMapeo == null) {
            return null;
        }
        return new PrestamoMaestros(
            prestamoMaestrosMapeo.getId(),
            prestamoMaestrosMapeo.getFechaPrestamo(),
            prestamoMaestrosMapeo.getDepartamento(),
            prestamoMaestrosMapeo.getCantidadPersonas(),
            prestamoMaestrosMapeo.getMotivo(),
            prestamoMaestrosMapeo.getPlantelOrigen(),
            prestamoMaestrosMapeo.getPlantelDestino(),
            convertidorVehiculo.convertirMapeoAEntidad(prestamoMaestrosMapeo.getVehiculo()),
            prestamoMaestrosMapeo.getCorreoResponsable(),
            prestamoMaestrosMapeo.getAcompaniantes()
        );
    }
}