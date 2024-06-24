/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import DTO.PrestamoMaestrosDTO;
import entidades.PrestamoMaestros;

public class PrestamoMaestrosCVR {
    
    public PrestamoMaestros convertir_PrestamoMaestros(PrestamoMaestrosDTO dto) {
        return new PrestamoMaestros(
            dto.getFechaPrestamo(),
            dto.getDepartamento(),
            dto.getCantidadPersonas(),
            dto.getMotivo(),
            dto.getPlantelOrigen(),
            dto.getPlantelDestino(),
            dto.getVehiculo(),
            dto.getCorreoResponsable(),
            dto.getAcompaniantes()
        );
    }

    public PrestamoMaestrosDTO convertir_DTO(PrestamoMaestros entidad) {
        return new PrestamoMaestrosDTO(
            entidad.getId(),
            entidad.getFechaPrestamo(),
            entidad.getDepartamento(),
            entidad.getCantidadPersonas(),
            entidad.getMotivo(),
            entidad.getPlantelOrigen(),
            entidad.getPlantelDestino(),
            entidad.getVehiculo(),
            entidad.getCorreoResponsable(),
            entidad.getAcompaniantes()
        );
    }
}