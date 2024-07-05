/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import daos.VehiculoDAO;
import Interfaces.IVehiculoDAO;
import converters.VehiculoCVR;
import dtos.VehiculoDTO;
import entidades.Vehiculo;
import excepciones.DAOException;
import exceptions.BisnessException;
import interfaces.IVehiculoBO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class VehiculoBO implements IVehiculoBO{

    IVehiculoDAO vehiculo;
    VehiculoCVR vehiculoCVR;

    public VehiculoBO() {
        this.vehiculo = new VehiculoDAO();
        this.vehiculoCVR = new VehiculoCVR();
    }
    
    
    @Override
    public List<VehiculoDTO> listaVehiculos() throws BisnessException {
        try{
            List<Vehiculo> lista = vehiculo.obtenerTodos();
            List<VehiculoDTO> listaDTO = new ArrayList<>();
            
            for (Vehiculo vehiculo : lista) {
                listaDTO.add(vehiculoCVR.convertir_DTO(vehiculo));
            }
            return listaDTO;
        }
        catch(DAOException ex){
            throw new BisnessException(ex.getMessage());
        }
    }
    
}
