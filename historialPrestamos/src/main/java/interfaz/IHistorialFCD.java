/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import excepciones.ControlException;
import javax.swing.JTable;

/**
 *
 * @author skevi
 */
public interface IHistorialFCD {
    
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws ControlException;
    
}
