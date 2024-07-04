/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.TrasladoDTO;
import dtos.VehiculoDTO;
import dtos.VehiculoDevueltoDTO;
import dtos.VehiculoEntregadoDTO;
import entidades.Traslado;
import entidades.Vehiculo;
import entidades.VehiculoDevuelto;
import entidades.VehiculoEntregado;
import java.time.LocalDateTime;

/**
 *
 * @author diana
 */
public class TrasladoCVR {
    
    private final VehiculoCVR vehiculoCVR;
    private final VehiculoEntregadoCVR vehiculoEntregadoCVR;
    private final VehiculoDevueltoCVR vehiculoDevueltoCVR;

    public TrasladoCVR() {
        this.vehiculoCVR = new VehiculoCVR();
        this.vehiculoDevueltoCVR = new VehiculoDevueltoCVR();
        this.vehiculoEntregadoCVR = new VehiculoEntregadoCVR();
    }
    
    
    public Traslado convetir_Traslado(TrasladoDTO trasladoDTO) {

        String folio = trasladoDTO.getFolio();
        String motivo = trasladoDTO.getMotivo();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        boolean disponibilidad = trasladoDTO.isDisponibilidad();
        Vehiculo vehiculo = vehiculoCVR.convertir_Vehiculo(trasladoDTO.getVehiculo());
        VehiculoEntregado vehiculoEntregado = vehiculoEntregadoCVR.convertir_Entregado(trasladoDTO.getVehiculoEntregado());
        VehiculoDevuelto vehiculoDevuelto = vehiculoDevueltoCVR.convertir_Devuelto(trasladoDTO.getVehiculoDevuelto());
        String correoEmpleado = trasladoDTO.getCorreoEmpleado();
        String correoChofer = trasladoDTO.getCorreoChofer();
        boolean estado = trasladoDTO.isEstado();
        
        return new Traslado(folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
        vehiculoDevuelto, correoEmpleado, correoChofer, estado);
    }

    public TrasladoDTO convertir_TrasladoDTO(Traslado traslado) {

        String folio = traslado.getFolio();
        String motivo = traslado.getMotivo();
        int personas = traslado.getPersonas();
        LocalDateTime fechaHoraSalida = traslado.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = traslado.getFechaHoraRegreso();
        boolean disponibilidad = traslado.isDisponibilidad();
        VehiculoDTO vehiculoDTO = vehiculoCVR.convertir_DTO(traslado.getVehiculo());
        VehiculoEntregadoDTO vehiculoEntregado = vehiculoEntregadoCVR.convertir_EntregadoDTO(traslado.getVehiculoEntregado());
        VehiculoDevueltoDTO vehiculoDevuelto = vehiculoDevueltoCVR.convertir_DevueltoDTO(traslado.getVehiculoDevuelto());
        String correoEmpleado = traslado.getCorreoEmpleado();
        String correoChofer = traslado.getCorreoChofer();
        boolean estado = traslado.isEstado();
        
        return new TrasladoDTO(folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculoDTO, vehiculoEntregado,
        vehiculoDevuelto, correoEmpleado, correoChofer, estado);
    }

}
