/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;



import Convertidor.EmpleadoCVR;
import Excepcion.NegocioException;
import Excepcion.PersistenciaException;
import dao.EmpleadoDAO;
import dtos.EmpleadoDTO;
import entidades.Empleado;
import interfaces.IEmpleadoBO;
import interfaces.IEmpleadoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skevi
 */
public class EmpleadoBO implements IEmpleadoBO{
    
    IEmpleadoDAO empleadoDAO;
    EmpleadoCVR empleadoCVR;

    public EmpleadoBO() {
        this.empleadoDAO = new EmpleadoDAO();
        this.empleadoCVR = new EmpleadoCVR();        
    }

    
    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws NegocioException
     */
    @Override
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws NegocioException {
        List<EmpleadoDTO> listaPaginada = new ArrayList();
       
        try{
        List<Empleado> lista = this.empleadoDAO.ListaEmpleados(offset, limit);
        
        for (int i = 0; i < lista.size(); i++) {
            listaPaginada.add(this.empleadoCVR.convertir_DTO(lista.get(i)));
        }
        
        return listaPaginada;
        
        }
        catch(PersistenciaException e){
            throw new NegocioException(e.getMessage());
        }
    }

    /**
     * 
     * @param empleadoDTO
     * @throws NegocioException 
     */
    @Override
    public void registrarEmpleado(EmpleadoDTO empleadoDTO) throws NegocioException {
        try{
            if (empleadoDTO == null) {
                throw new NegocioException("Administrador nulo");
            }
            else{
                this.empleadoDAO.registrarEmpleado(this.empleadoCVR.convertir_Entidad(empleadoDTO));
            } 
        }
        catch(PersistenciaException e){
            throw new NegocioException(e.getMessage());
        }    
    }

    /**
     * 
     * @param empleadoDTO
     * @throws NegocioException 
     */
    @Override
    public void registrarAdministrador(EmpleadoDTO empleadoDTO) throws NegocioException {
        try{
            if (empleadoDTO == null) {
                throw new NegocioException("Administrador nulo");
            }
            else{
                this.empleadoDAO.registrarAdministrador(this.empleadoCVR.convertir_Entidad(empleadoDTO));
            } 
        }
        catch(PersistenciaException e){
            throw new NegocioException(e.getMessage());
        }    
    }

    /**
     * 
     * @param empleadoDTO
     * @throws NegocioException 
     */
    @Override
    public void registrarChofer(EmpleadoDTO empleadoDTO) throws NegocioException {
        try{
            if (empleadoDTO == null) {
                throw new NegocioException("Chofer nulo");
            }
            else{
                this.empleadoDAO.registrarChofer(this.empleadoCVR.convertir_Entidad(empleadoDTO));
            } 
        }
        catch(PersistenciaException e){
            throw new NegocioException(e.getMessage());
        }       }

    /**
     * 
     * @param id
     * @return
     * @throws NegocioException 
     */
    @Override
    public EmpleadoDTO buscarEmpleado(int id) throws NegocioException {
        try{
           return this.empleadoCVR.convertir_DTO(this.empleadoDAO.buscarEmpleado(id));
        }
        catch(PersistenciaException e){
            throw new NegocioException(e.getMessage());
        }    
    }

    /**
     * 
     * @param empleadoDTO
     * @return
     * @throws NegocioException 
     */
    @Override
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO) throws NegocioException {
        try{
            if (empleadoDTO == null) {
                throw new NegocioException("Administrador nulo");
            }
            else{
                return this.empleadoDAO.existenciaAdmin(this.empleadoCVR.convertir_Entidad(empleadoDTO));
            }
        }
        catch(PersistenciaException e){
             throw new NegocioException(e.getMessage());
        }
    }
    
}
