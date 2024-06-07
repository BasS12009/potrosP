/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import excepcion.PropsException;
import javax.swing.JTable;

/**
 *
 * @author skevi
 */
public interface IEmpleadoFCD {
    
    public void tablaEmpleado(JTable table, int id) throws PropsException;
    
}
