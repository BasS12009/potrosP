/**
 * VehiculoCTL.java
 * 
 * La clase VehiculoCTL se encarga de controlar las operaciones 
 * relacionadas con los vehículos.
 * 
 */
package control;

import bo.VehiculoBO;
import DTO.VehiculoDTO;
import exceptions.BisnessException;
import interfaces.IVehiculoBO;
import java.util.List;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class VehiculoCTL {
    
    IVehiculoBO vehiculoBO;

   /**
     * Constructor de la clase VehiculoCTL.
     * Inicializa la instancia de VehiculoBO para realizar operaciones relacionadas con vehículos.
     */
    public VehiculoCTL() {
        this.vehiculoBO = new VehiculoBO();
    }
    
    /**
     * Obtiene una lista de todos los vehículos.
     * 
     * @return Una lista de objetos VehiculoDTO que representan todos los vehículos.
     * @throws BisnessException Si ocurre un error al obtener la lista de vehículos.
     */
    public List<VehiculoDTO> listaVehiculos() throws BisnessException {
        return vehiculoBO.listaVehiculos();    
    }
}