/**
 * PrestamoCVR.java
 * 
 * Esta clase proporciona métodos para convertir entre objetos de tipo 
 * PrestamoDTO y Prestamo, permitiendo la transferencia de datos entre 
 * capas de la aplicación.
 */
package converters;

import dtos.PrestamoDTO;
import entidades.Prestamo;
import entidades.Vehiculo;
import org.bson.types.ObjectId;
import java.time.LocalDate;

public class PrestamoCVR {
    
    private VehiculoCVR vehiculoCVR;

    public PrestamoCVR() {
        this.vehiculoCVR = new VehiculoCVR();
    }

    public Prestamo convertir_Prestamo(PrestamoDTO dto) {
        if (dto == null) {
            return null;
        }

        Vehiculo vehiculo = null;
        if (dto.getPlacaVehiculo() != null && !dto.getPlacaVehiculo().isEmpty()) {
            vehiculo = new Vehiculo();
            vehiculo.setPlaca(dto.getPlacaVehiculo());
            // Aquí podrías usar vehiculoCVR para convertir más datos del vehículo si es necesario
        }

        ObjectId id = null;
        if (dto.getId() != null && !dto.getId().isEmpty()) {
            id = new ObjectId(dto.getId());
        }

        return new Prestamo(
            id,
            dto.getMotivo(),
            dto.getInicio(),
            dto.getFin(),
            dto.getPlacaVehiculo(),
            dto.getCorreoEmpleado(),
            vehiculo
        );
    }

    public PrestamoDTO convertir_DTO(Prestamo entidad) {
        if (entidad == null) {
            return null;
        }

        PrestamoDTO dto = new PrestamoDTO();
        dto.setId(entidad.getId() != null ? entidad.getId().toString() : null);
        dto.setMotivo(entidad.getMotivo());
        dto.setInicio(entidad.getInicio());
        dto.setFin(entidad.getFin());
        dto.setPlacaVehiculo(entidad.getPlacaVehiculo());
        dto.setCorreoEmpleado(entidad.getCorreoEmpleado());
        
        // Si necesitas convertir más datos del vehículo, podrías usar vehiculoCVR aquí
        if (entidad.getVehiculo() != null) {
            dto.setPlacaVehiculo(entidad.getVehiculo().getPlaca());
        }

        return dto;
    }
}