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

    private List<Empleado> lista = new ArrayList();
    
    @Override
    public void registrar(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("Empleado nulo");
        }
        else{
            lista.add(empleado);
        }

    }

    @Override
    public Empleado buscarPorID(int id) throws PersistenciaException {
        
        if (id < 1) {
            throw new PersistenciaException("El Empleado no existe");
        }
        else{
           for(Empleado empleado : lista){
               if (empleado.getId() == id) {
                   return empleado;
               }
        }
        }
        return null;
    }

    @Override
    public List<Empleado> ListaEmpleados(int offset, int limit) throws PersistenciaException {
       //Lista que guarda la lista despues del offset
       List<Empleado> listaAlterna = new ArrayList();
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() >= offset) {
                listaAlterna.add(lista.get(i));
            }
        }
 
        List<Empleado> listaPaginada = new ArrayList();
        
        for (int i = 0; i < limit; i++) {
            listaPaginada.add(listaAlterna.get(i));
        }
        
        return listaPaginada;
    }

}
