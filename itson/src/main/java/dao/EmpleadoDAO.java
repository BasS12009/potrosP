/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepcion.PersistenciaException;
import entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import interfaces.IEmpleadoDAO;

   /**
   *
   * @author skevi
   */
    public class EmpleadoDAO implements IEmpleadoDAO{

    private static List<Empleado> listaEmpleados = new ArrayList();
    private static List<Empleado> listaAministradores = new ArrayList();
    private static List<Empleado> listaChoferes = new ArrayList();
    
    
    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws PersistenciaException 
     */
    @Override
    public List<Empleado> ListaEmpleados(int offset, int limit) throws PersistenciaException {
       //Lista que guarda la lista despues del offset
       List<Empleado> listaAlterna = new ArrayList();
        
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getId() >= offset) {
                listaAlterna.add(listaEmpleados.get(i));
            }
        }
 
        List<Empleado> listaPaginada = new ArrayList();
        
        for (int i = 0; i < limit; i++) {
            listaPaginada.add(listaAlterna.get(i));
        }
        
        return listaPaginada;
    }

    /**
     * 
     * @param id
     * @return
     * @throws PersistenciaException 
     */
    
    @Override
    public Empleado buscarEmpleado(int id) throws PersistenciaException {
        if (id < 1) {
            throw new PersistenciaException("El Empleado no existe");
        }
        else{
           for(Empleado empleado : listaEmpleados){
               if (empleado.getId() == id) {
                   return empleado;
               }
        }
        }
        return null;    
    }

    @Override
    public boolean existenciaAdmin(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Administrador nulo");
        }
        else{
            for(Empleado empleados : listaEmpleados){
                if (empleados.equals(empleado)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 
     * @param empleado
     * @throws PersistenciaException 
     */
    @Override
    public void registrarEmpleado(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Empleado nulo");
        }
        else if(empleado.getTipo().equalsIgnoreCase("EMPLEADO")){
            listaEmpleados.add(empleado);
        }    
    }

    /**
     * 
     * @param empleado
     * @throws PersistenciaException 
     */
    @Override
    public void registrarAdministrador(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Administrador nulo");
        }
        else if(empleado.getTipo().equalsIgnoreCase("ADMINISTRADOR")){
            listaEmpleados.add(empleado);
        }    
    }

    /**
     * 
     * @param empleado
     * @throws PersistenciaException 
     */
    @Override
    public void registrarChofer(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Administrador nulo");
        }
        else if(empleado.getTipo().equalsIgnoreCase("ADMINISTRADOR")){
            listaEmpleados.add(empleado);
        }    }

}
