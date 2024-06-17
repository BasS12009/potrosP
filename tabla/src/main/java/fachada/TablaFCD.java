/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import control.TablaCTL;
import excepciones.ControlException;
import excepciones.FachadaException;
import interfaz.ITablaFCD;
import javax.swing.JTable;

/**
 *
 * @author skevi
 */
public class TablaFCD implements ITablaFCD{

    TablaCTL tabla;

    public TablaFCD() {
        this.tabla = new TablaCTL();
    }
    
    
    @Override
    public void tablaEmpleado(JTable table, int id) throws FachadaException {
        try{
            tabla.tablaEmpleado(table, id);
        }
        catch(ControlException ex){
            throw new FachadaException(ex.getMessage());
        }
    }
    
}
