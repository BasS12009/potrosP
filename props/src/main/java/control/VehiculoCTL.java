/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BO.VehiculoBO;
import DTO.VehiculoDTO;
import Exceptions.BisnessException;
import interfaces.IVehiculoBO;
import java.util.List;

/**
 *
 * @author skevi
 */
public class VehiculoCTL {
    
    IVehiculoBO vehiculoBO;

    public VehiculoCTL() {
        this.vehiculoBO = new VehiculoBO();
    }
    
    public List<VehiculoDTO> listaVehiculos() throws BisnessException {
        return vehiculoBO.listaVehiculos();    
    }
}
