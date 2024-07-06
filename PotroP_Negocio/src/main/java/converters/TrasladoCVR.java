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
import exceptions.BisnessException;
import java.time.LocalDateTime;
import org.bson.types.ObjectId;

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
    
    
    public Traslado convetir_Traslado(TrasladoDTO trasladoDTO) throws BisnessException{
        if (trasladoDTO == null) {
            throw new BisnessException("el traslado necesita ser diferente de nulo para ser convertido a entidad");
        }
        
        ObjectId oid = new ObjectId(trasladoDTO.getId());
        
        ObjectId id = oid;
        String folio = trasladoDTO.getFolio();
        String motivo = trasladoDTO.getMotivo();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        boolean disponibilidad = trasladoDTO.isDisponibilidad();
        Vehiculo vehiculo = vehiculoCVR.convertir_Vehiculo(trasladoDTO.getVehiculo());
        VehiculoEntregado vehiculoEntregado = vehiculoEntregadoCVR.convertir_Entregado(trasladoDTO.getVehiculoEntregado());

        if (trasladoDTO.getVehiculoDevuelto() != null) {
            VehiculoDevuelto vehiculoDevuelto = vehiculoDevueltoCVR.convertir_Devuelto(trasladoDTO.getVehiculoDevuelto());
            String correoEmpleado = trasladoDTO.getCorreoEmpleado();
             boolean estado = trasladoDTO.isEstado();

        return new Traslado( id, folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
                vehiculoDevuelto, correoEmpleado,estado);
        }
        else{
            VehiculoDevuelto vehiculoDevuelto = null;
            String correoEmpleado = trasladoDTO.getCorreoEmpleado();
            boolean estado = trasladoDTO.isEstado();

        return new Traslado( id, folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
                vehiculoDevuelto, correoEmpleado,estado);
        }
    }

    public TrasladoDTO convertir_TrasladoDTO(Traslado traslado) throws BisnessException {
        if (traslado == null) {
            throw new BisnessException("el traslado necesita ser diferente de nulo para ser convertido a DTO");
        }
        String id = traslado.getId().toString();
        String folio = traslado.getFolio();
        String motivo = traslado.getMotivo();
        int personas = traslado.getPersonas();
        LocalDateTime fechaHoraSalida = traslado.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = traslado.getFechaHoraRegreso();
        boolean disponibilidad = traslado.isDisponibilidad();
        VehiculoDTO vehiculo = vehiculoCVR.convertir_DTO(traslado.getVehiculo());
        VehiculoEntregadoDTO vehiculoEntregado = vehiculoEntregadoCVR.convertir_EntregadoDTO(traslado.getVehiculoEntregado());

        if (traslado.getVehiculoDevuelto() != null) {
            VehiculoDevueltoDTO vehiculoDevuelto = vehiculoDevueltoCVR.convertir_DevueltoDTO(traslado.getVehiculoDevuelto());
            String correoEmpleado = traslado.getCorreoEmpleado();
             boolean estado = traslado.isEstado();

        return new TrasladoDTO(id,folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
                vehiculoDevuelto, correoEmpleado,estado);
        }
        else{
            VehiculoDevueltoDTO vehiculoDevuelto = null;
            String correoEmpleado = traslado.getCorreoEmpleado();
            boolean estado = traslado.isEstado();

        return new TrasladoDTO(id,folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
                vehiculoDevuelto, correoEmpleado,estado);
        }
    }
    
     public Traslado convetir_Entregar(TrasladoDTO trasladoDTO) throws BisnessException{
        if (trasladoDTO == null) {
            throw new BisnessException("el traslado necesita ser diferente de nulo para ser convertido a entidad");
        }
        
        
        String folio = trasladoDTO.getFolio();
        String motivo = trasladoDTO.getMotivo();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        boolean disponibilidad = trasladoDTO.isDisponibilidad();
        Vehiculo vehiculo = vehiculoCVR.convertir_Vehiculo(trasladoDTO.getVehiculo());
        VehiculoEntregado vehiculoEntregado = vehiculoEntregadoCVR.convertir_Entregado(trasladoDTO.getVehiculoEntregado());

        if (trasladoDTO.getVehiculoDevuelto() != null) {
            VehiculoDevuelto vehiculoDevuelto = vehiculoDevueltoCVR.convertir_Devuelto(trasladoDTO.getVehiculoDevuelto());
            String correoEmpleado = trasladoDTO.getCorreoEmpleado();
             boolean estado = trasladoDTO.isEstado();

        return new Traslado( folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
                vehiculoDevuelto, correoEmpleado,estado);
        }
        else{
            VehiculoDevuelto vehiculoDevuelto = null;
            String correoEmpleado = trasladoDTO.getCorreoEmpleado();
            boolean estado = trasladoDTO.isEstado();

        return new Traslado(  folio, motivo, personas, fechaHoraSalida, 
                fechaHoraRegreso, disponibilidad, vehiculo, vehiculoEntregado,
                vehiculoDevuelto, correoEmpleado,estado);
        }
    }

}
