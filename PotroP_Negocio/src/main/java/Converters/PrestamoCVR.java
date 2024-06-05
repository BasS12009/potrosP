/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Converters;

import DTO.PrestamoDTO;
import DTO.VehiculoDTO;
import entidades.Prestamo;
import entidades.Vehiculo;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author skevi
 */
public class PrestamoCVR {
    
    VehiculoCVR vehiculoCVR;

    public PrestamoCVR() {
        this.vehiculoCVR = new VehiculoCVR();
    }
    
    public Prestamo convetir_Prestamo(PrestamoDTO prestamoDTO){
        String motivo = prestamoDTO.getMotivo();
        LocalDate Inicio = prestamoDTO.getInicio();
        LocalDate Fin = prestamoDTO.getFin();
        //convertimos utilizando el convertidor de vehiculos a entidad vehiculo
        Vehiculo vehiculo = this.vehiculoCVR.convertir_Entidad(prestamoDTO.getVechiculoDTO());
        return new Prestamo(motivo, Inicio, Fin, vehiculo);
    }
    
    public PrestamoDTO convertir_DTO(Prestamo prestamo){
        int id  = prestamo.getId();
        String motivo = prestamo.getMotivo();
        LocalDate inicio= prestamo.getFechaInicio();
        LocalDate fin = prestamo.getFechaFin();
        VehiculoDTO vehiculoDTO = this.vehiculoCVR.convertir_DTO(prestamo.getVehiculo());
        return new PrestamoDTO(id, motivo, inicio, fin, vehiculoDTO);
    }
    
}
