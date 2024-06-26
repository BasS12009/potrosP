/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.TrasladoDTO;
import dtos.VehiculoDTO;
import entidades.Traslado;
import entidades.Vehiculo;
import java.sql.Date;

/**
 *
 * @author diana
 */
public class TrasladoCVR {
    
    public Traslado convetir_Traslado(TrasladoDTO trasladoDTO) {

        String folio = trasladoDTO.getFolio();
        String motivo = trasladoDTO.getMotivo();
        int personas = trasladoDTO.getPersonas();
        Date fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        Date fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        boolean disponibilidad = trasladoDTO.isDisponibilidad();
        String carroceria = trasladoDTO.getCarroceria();
        String llantas = trasladoDTO.getLlantas();
        int combustible = trasladoDTO.getCombustible();
        String estadoVehiculo = trasladoDTO.getEstadoVehiculo();
        Vehiculo vehiculo = null;
        return new Traslado(folio, motivo, personas,fechaHoraSalida, fechaHoraRegreso, disponibilidad, vehiculo, estadoVehiculo, llantas, carroceria, combustible);

    }

    public TrasladoDTO convertir_TrasladoDTO(Traslado traslado) {

        String folio = traslado.getFolio();
        String motivo = traslado.getMotivo();
        int personas = traslado.getPersonas();
        Date fechaHoraSalida = traslado.getFechaHoraSalida();
        Date fechaHoraRegreso = traslado.getFechaHoraRegreso();
        boolean disponibilidad = traslado.isDisponibilidad();
        VehiculoDTO vehiculoDTO = null;
        String carroceria = traslado.getCarroceria();
        String llantas = traslado.getLlantas();
        int combustible = traslado.getCombustible();
        String estadoVehiculo = traslado.getEstadoVehiculo();
        return new TrasladoDTO(folio, motivo, personas, fechaHoraSalida, fechaHoraRegreso, disponibilidad, vehiculoDTO, estadoVehiculo, llantas, carroceria, combustible);
    }

}
