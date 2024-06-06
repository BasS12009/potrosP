/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import excepcion.PropsException;
import javax.swing.JComboBox;

/**
 *
 * @author skevi
 */
public interface IAdministradorFCD {

    public void llenarTablaAdmin(JComboBox comboBox) throws PropsException;
    
}
