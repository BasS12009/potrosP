/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.VehiculoDTO;
import Exceptions.BisnessException;
import entidades.Vehiculo;
import java.util.List;

/**
 *
 * @author skevi
 */
public interface IVehiculoBO {
    
    public void agregar(VehiculoDTO vehiculoDTO) throws BisnessException;
    
    public void eliminar(VehiculoDTO vehiculoDTO) throws BisnessException;
    
    public void actualizar(VehiculoDTO vehiculoDTO) throws BisnessException;
    
     public Vehiculo buscarPorId(int id) throws BisnessException;
     
     public List<VehiculoDTO> listaVehiculos() throws BisnessException;
     
}
