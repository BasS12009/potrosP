/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Excepcion.PersistenciaException;
import entidades.Empleado;
import java.util.List;


/**
 *
 * @author skevi
 */
public interface IEmpleadoDAO {
    
    public void registrar(Empleado empleado) throws PersistenciaException;
    
    public Empleado buscarPorID(int id)throws PersistenciaException;
    
    public List<Empleado> ListaEmpleados(int offset, int limit)throws PersistenciaException;

}
