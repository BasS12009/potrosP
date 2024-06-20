/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Maestro;
import java.util.List;

/**
 *
 * @author caarl
 */
public interface IMaestroBO {
 Maestro buscarPorId(int id);
    Maestro buscarPorNombre(String nombre);
    List<Maestro> buscarTodos();
    Maestro guardar(Maestro maestro);
    void actualizar(Maestro maestro);
    void eliminar(int id);
    List<Maestro> buscarPorDepartamento(String departamento);
    Maestro buscarPorCorreo(String correo);   
}
