/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import control.VehiculoCTL;
import excepciones.ControlException;
import excepciones.FachadaException;
import interfaz.IVehiculoFCD;
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
    public void llenarCBX(JComboBox comboBox) throws FachadaException {
        try{
            vehiculo.llenarCBX(comboBox); 
        }
        catch(ControlException ex){
            throw new FachadaException(ex.getMessage());
        }
    }
    
}
