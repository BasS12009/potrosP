/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.TrasladoDTO;
import entidades.Traslado;
import java.time.LocalDateTime;

/**
 * Clase que proporciona métodos para convertir entre objetos de tipo TrasladoDTO y Traslado.
 * Utilizada para la conversión de datos entre capas del sistema.
 * 
 * @author skevi
 */
public class TrasladoCVR {
    
    /**
     * Convierte un objeto TrasladoDTO a un objeto Traslado.
     * 
     * @param trasladoDTO El objeto TrasladoDTO que se desea convertir.
     * @return Un objeto Traslado convertido a partir del TrasladoDTO proporcionado.
     */
    public Traslado convertir_Entidad(TrasladoDTO trasladoDTO){
        int numTraslado = trasladoDTO.getNumTraslado();
        String destino = trasladoDTO.getDestino();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        String motivo = trasladoDTO.getMotivo();
        String carroceria = trasladoDTO.getCarroceria();
        String llantas = trasladoDTO.getLlantas();
        int combustible = trasladoDTO.getCombustible();
        String placa = trasladoDTO.getPlaca();
        String correoEmpleado = trasladoDTO.getCorreoEmpleado();
        String correoChofer = trasladoDTO.getCorreoChofer();
        boolean estado = trasladoDTO.getEstado();
        
        // Retornamos un objeto Traslado convertido
        return new Traslado(numTraslado, destino, personas, fechaHoraSalida,
                            fechaHoraRegreso, motivo, carroceria, llantas, combustible,
                            placa, correoEmpleado, correoChofer, estado);
    }
    
    /**
     * Convierte un objeto Traslado a un objeto TrasladoDTO.
     * 
     * @param traslado El objeto Traslado que se desea convertir.
     * @return Un objeto TrasladoDTO convertido a partir del Traslado proporcionado.
     */
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
        
        // Retornamos un objeto TrasladoDTO convertido
        return new TrasladoDTO(numTraslado, destino, personas, fechaHoraSalida,
                               fechaHoraRegreso, motivo, carroceria, llantas, combustible,
                               placa, correoEmpleado, correoChofer, estado);
    }
    
}
