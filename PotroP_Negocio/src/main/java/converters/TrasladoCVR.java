/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.TrasladoDTO;
import entidades.Traslado;
import java.time.LocalDateTime;

/**
 *
 * @author skevi
 */
public class TrasladoCVR {
    
    
    public Traslado convertir_Entidad(TrasladoDTO trasladoDTO){
        int numTraslado = trasladoDTO.getNumTraslado();
        String destino = trasladoDTO.getDestino();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraSalida();
        String motivo = trasladoDTO.getMotivo();
        String carroceria = trasladoDTO.getCarroceria();
        String llantas = trasladoDTO.getLlantas();
        int combustible = trasladoDTO.getCombustible();
        String placa = trasladoDTO.getPlaca();
        String correoEmpleado = trasladoDTO.getCorreoEmpleado();
        String correoChofer = trasladoDTO.getCorreoChofer();
        boolean estado = trasladoDTO.getEstado();
        
        //retornamos un objeto convertido
        return new Traslado(numTraslado, destino, personas, fechaHoraSalida,
        fechaHoraRegreso, motivo, carroceria, llantas, combustible, placa,
        correoEmpleado, correoChofer, estado);
    }
    
    public TrasladoDTO convertir_DTO(Traslado traslado){
        int numTraslado = traslado.getNumTraslado();
        String destino = traslado.getDestino();
        int personas = traslado.getPersonas();
        LocalDateTime fechaHoraSalida = traslado.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = traslado.getFechaHoraRegreso();
        String motivo = traslado.getMotivo();
        String carroceria = traslado.getCarroceria();
        String llantas = traslado.getLlantas();
        int combustible = traslado.getCombustible();
        String placa = traslado.getPlaca();
        String correoEmpleado = traslado.getCorreoEmpleado();
        String correoChofer = traslado.getCorreoChofer();
        boolean estado = traslado.getEstado();
        
        //retornamos un objeto convertido
        return new TrasladoDTO(numTraslado, destino, personas, fechaHoraSalida,
        fechaHoraRegreso, motivo, carroceria, llantas, combustible, placa,
        correoEmpleado, correoChofer, estado);
    }
    
    
}
