/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepcion.PersistenciaException;
import entidades.Administrador;
import interfaces.IAdministradorDAO;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author skevi
 */
public class AdministradorDAO implements IAdministradorDAO{

    private List<Administrador> lista = new ArrayList();    

    @Override
    public void registrar(Administrador administrador) throws PersistenciaException {
        if (administrador == null) {
            throw new PersistenciaException("Empleado nulo");
        }
        else{
            lista.add(administrador);
        }
    }

    @Override
    public boolean existe(Administrador administrador) throws PersistenciaException {
        
        boolean existe = false;
        
        if (administrador == null) {
            throw new PersistenciaException("Empleado nulo");
        }
        else{
            for(Administrador administradores : lista){
                if (administradores.equals(administrador)) {
                    existe = true;
                }
            }
        }
        return existe;
    }
  
    
}
