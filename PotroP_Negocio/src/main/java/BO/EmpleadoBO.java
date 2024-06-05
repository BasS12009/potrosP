/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Converters.EmpleadoCVR;
import DTO.EmpleadoDTO;
import Excepcion.PersistenciaException;
import Exceptions.BisnessException;
import dao.EmpleadoDAO;
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
     * @param empleadoDTO
     * @throws BisnessException 
     */
    @Override
    public void registrar(EmpleadoDTO empleadoDTO) throws BisnessException {
        try{
            if (empleadoDTO == null) {
                throw new BisnessException("Administrador nulo");
            }
            else{
                this.empleadoDAO.registrar(this.empleadoCVR.convertir_Entidad(empleadoDTO));
            } 
        }
        catch(PersistenciaException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * 
     * @param id
     * @return
     * @throws BisnessException 
     */
    @Override
    public EmpleadoDTO buscarPorID(int id) throws BisnessException {
        try{
           return this.empleadoCVR.convertir_DTO(this.empleadoDAO.buscarPorID(id));
        }
        catch(PersistenciaException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws BisnessException 
     */
    @Override
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws BisnessException {
        List<EmpleadoDTO> listaPaginada = new ArrayList();
       
        try{
        List<Empleado> lista = this.empleadoDAO.ListaEmpleados(offset, limit);
        
        for (int i = 0; i < lista.size(); i++) {
            listaPaginada.add(this.empleadoCVR.convertir_DTO(lista.get(i)));
        }
        
        return listaPaginada;
        
        }
        catch(PersistenciaException e){
            throw new BisnessException(e.getMessage());
        }
    }
    
}
