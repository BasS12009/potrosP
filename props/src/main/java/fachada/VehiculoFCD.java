/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import DTO.VehiculoDTO;
import Exceptions.BisnessException;
import Interfaz.IVehiculoFCD;
import control.VehiculoCTL;
import excepcion.PropsException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author skevi
 */
public class VehiculoFCD implements IVehiculoFCD{

    VehiculoCTL vehiculo;

    public VehiculoFCD() {
        this.vehiculo = new VehiculoCTL();
    }
    
    @Override
    public void llenarCBX(JComboBox comboBox) throws PropsException {
        try {
            for (VehiculoDTO vehiculoDTO : vehiculo.listaVehiculos()) {
                comboBox.addItem(vehiculoDTO);
            }
        } catch (BisnessException ex) {
            throw new PropsException(ex.getMessage());
        }
    }
    
    
}
