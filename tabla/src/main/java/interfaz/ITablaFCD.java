/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import excepciones.FachadaException;
import javax.swing.JTable;

/**
 *
 * @author skevi
 */
public interface ITablaFCD {
    
    public void tablaEmpleado(JTable table, int id) throws FachadaException;
    
}
