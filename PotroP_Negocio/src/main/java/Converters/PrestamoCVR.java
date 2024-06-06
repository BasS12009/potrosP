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
        String placa = prestamoDTO.getPlacaVehiculo();
        String correo = prestamoDTO.getCorreoEmpleado();
        return new Prestamo(motivo, Inicio, Fin, placa, correo);
    }
    
    public PrestamoDTO convertir_DTO(Prestamo prestamo){
        int id  = prestamo.getId();
        String motivo = prestamo.getMotivo();
        LocalDate inicio= prestamo.getInicio();
        LocalDate fin = prestamo.getFin();
        String placa = prestamo.getPlacaVehiculo();
        String correo = prestamo.getCorreoEmpleado();
        return new PrestamoDTO(id, motivo, inicio, fin, placa, correo);
    }
    
}
