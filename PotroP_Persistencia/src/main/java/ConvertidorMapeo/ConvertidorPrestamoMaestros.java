/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.PrestamoMaestrosMapeo;
import entidades.PrestamoMaestros;

public class ConvertidorPrestamoMaestros {

    private ConvertidorVehiculo convertidorVehiculo = new ConvertidorVehiculo();

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