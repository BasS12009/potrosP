/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.EmpleadoDTO;
import Exceptions.BisnessException;
import java.util.List;

/**
 *
 * @author skevi
 */
public interface IEmpleadoBO {
    
    public void registrar(EmpleadoDTO empleadoDTO) throws BisnessException;
    
    public EmpleadoDTO buscarPorID(int id)throws BisnessException;
    
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit)throws BisnessException;
}
