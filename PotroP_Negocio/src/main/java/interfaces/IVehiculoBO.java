/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.VehiculoDTO;
import exceptions.BisnessException;
import java.util.List;

/**
 *
 * @author diana
 */
public interface IVehiculoBO {
    // Método que se implementa para obtener una lista de vehículos
    // Este método devuelve una lista de objetos VehiculoDTO y puede lanzar una excepción 
    public List<VehiculoDTO> listaVehiculos() throws BisnessException ;
    
    public boolean isVehiculoDisponible(String placa) throws BisnessException;
}
