/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Maestro;
import java.util.List;

/**
 *
 * @author caarl
 */
public interface IMaestroDAO {
   Maestro obtenerMaestroPorId(int id);
    List<Maestro> obtenerTodosMaestros();
    List<Maestro> buscarMaestroPorNombre(String nombre); 
}
