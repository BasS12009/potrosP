/**
 * VehiculoCFD.java
 * 
 * La clase VehiculoFCD proporciona métodos para interactuar con vehículos 
 * a través de una interfaz gráfica;
 * 
 * Esta clase implementa la interfaz IVehiculoFCD y utiliza un controlador 
 * (VehiculoCTL) para manejar las operaciones relacionadas con los vehículos.
 */
package fachada;

import DTO.VehiculoDTO;
import exceptions.BisnessException;
import Interfaz.IVehiculoFCD;
import control.VehiculoCTL;
import excepcion.PropsException;
import javax.swing.JComboBox;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class VehiculoFCD implements IVehiculoFCD{

    VehiculoCTL vehiculo;

    /**
     * Crea una nueva instancia de VehiculoCTL.
     */
    public VehiculoFCD() {
        this.vehiculo = new VehiculoCTL();
    }
    
    /**
     * Llena un JComboBox con los vehículos disponibles.
     * 
     * @param comboBox El JComboBox que se desea llenar con los vehículos.
     * @throws PropsException Si ocurre un error relacionado con la obtención de datos de los vehículos.
     */
    @Override
    public void llenarCBX(JComboBox comboBox) throws PropsException {
        try {
            // Obtener la lista de vehículos a través del controlador
            for (VehiculoDTO vehiculoDTO : vehiculo.listaVehiculos()) {
                comboBox.addItem(vehiculoDTO);
            }
        } catch (BisnessException ex) {
            // Lanzar una PropsException si ocurre un error al obtener los datos de los vehículos
            throw new PropsException(ex.getMessage());
        }
    }
}