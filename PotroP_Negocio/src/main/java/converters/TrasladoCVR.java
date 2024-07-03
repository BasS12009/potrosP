/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.TrasladoDTO;
import dtos.VehiculoDTO;
import entidades.Traslado;
import entidades.Vehiculo;
import java.time.LocalDateTime;

/**
 *
 * @author diana
 */
public class TrasladoCVR {
    
    public Traslado convetir_Traslado(TrasladoDTO trasladoDTO) {

        String folio = trasladoDTO.getFolio();
        String motivo = trasladoDTO.getMotivo();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        boolean disponibilidad = trasladoDTO.isDisponibilidad();
        String carroceria = trasladoDTO.getCarroceria();
        String llantas = trasladoDTO.getLlantas();
        int combustible = trasladoDTO.getCombustible();
        String estadoVehiculo = trasladoDTO.getEstadoVehiculo();
        Vehiculo vehiculo = null;
        
        return new Traslado();
    }

    public TrasladoDTO convertir_TrasladoDTO(Traslado traslado) {

        String folio = traslado.getFolio();
        String motivo = traslado.getMotivo();
        int personas = traslado.getPersonas();
        LocalDateTime fechaHoraSalida = traslado.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = traslado.getFechaHoraRegreso();
        boolean disponibilidad = traslado.isDisponibilidad();
        VehiculoDTO vehiculoDTO = null;

        
        return new TrasladoDTO(folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculoDTO);
    }

}
