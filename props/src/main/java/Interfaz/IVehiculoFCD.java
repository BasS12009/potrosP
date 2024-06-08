/**
 * IVehiculoFCD.java
 * 
 * La interfaz IVehiculoFCD proporciona un método para llenar un JComboBox 
 * con datos de vehículos.
 */
package Interfaz;

import excepcion.PropsException;
import javax.swing.JComboBox;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IVehiculoFCD {
    
    /**
     * Llena un JComboBox con datos de vehículos.
     * 
     * @param comboBox El JComboBox que se llenará con los datos de vehículos.
     * @throws PropsException Si ocurre un error al obtener los datos de vehículos.
     */
    public void llenarCBX(JComboBox comboBox) throws PropsException;
    
}
