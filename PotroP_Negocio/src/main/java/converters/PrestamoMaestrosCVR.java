/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.PrestamoMaestrosDTO;
import entidades.PrestamoMaestros;
import entidades.Vehiculo;
import org.bson.types.ObjectId;

public class PrestamoMaestrosCVR {
    
 public PrestamoMaestros convertir_PrestamoMaestros(PrestamoMaestrosDTO dto) {
        Vehiculo vehiculo = null;
        if (dto.getVehiculo() != null && !dto.getVehiculo().isEmpty()) {
            // Asumimos que dto.getVehiculo() regresa la placa del vehículo
            vehiculo = new Vehiculo();
            vehiculo.setPlaca(dto.getVehiculo());
            // Aquí podrías buscar los otros datos del vehículo en la base de datos si los ocupas
        }

        return new PrestamoMaestros(
            dto.getId() != null ? new ObjectId(dto.getId()) : null,
            dto.getFechaPrestamo(),
            dto.getDepartamento(),
            dto.getCantidadPersonas(),
            dto.getMotivo(),
            dto.getPlantelOrigen(),
            dto.getPlantelDestino(),
            vehiculo,
            dto.getCorreoResponsable(),
            dto.getAcompaniantes()
        );
    }

    public PrestamoMaestrosDTO convertir_DTO(PrestamoMaestros entidad) {
        PrestamoMaestrosDTO dto = new PrestamoMaestrosDTO();
        dto.setId(entidad.getId() != null ? entidad.getId().toString() : null);
        dto.setFechaPrestamo(entidad.getFechaPrestamo());
        dto.setDepartamento(entidad.getDepartamento());
        dto.setCantidadPersonas(entidad.getCantidadPersonas());
        dto.setMotivo(entidad.getMotivo());
        dto.setPlantelOrigen(entidad.getPlantelOrigen());
        dto.setPlantelDestino(entidad.getPlantelDestino());
        dto.setVehiculo(entidad.getVehiculo() != null ? entidad.getVehiculo().getPlaca() : null);
        dto.setCorreoResponsable(entidad.getCorreoResponsable());
        dto.setAcompaniantes(entidad.getAcompaniantes());
        
        return dto;
    }
}    