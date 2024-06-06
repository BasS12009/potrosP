/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Excepcion.NegocioException;
import Excepcion.PersistenciaException;
import dtos.EmpleadoDTO;
import java.util.List;

/**
 *
 * @author skevi
 */
public interface IEmpleadoBO {
    
    public void registrarEmpleado(EmpleadoDTO empleadoDTO) throws NegocioException;
    
    public void registrarAdministrador(EmpleadoDTO empleadoDTO) throws NegocioException;
    
    public void registrarChofer(EmpleadoDTO empleadoDTO) throws NegocioException;
    
    public EmpleadoDTO buscarEmpleado(int id)throws NegocioException;
    
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit)throws NegocioException;
    
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO)throws NegocioException;
    
}
