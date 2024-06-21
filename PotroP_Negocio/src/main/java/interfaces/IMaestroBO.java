/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.MaestroDTO;
import exceptions.BisnessException;
import java.util.List;

/**
 *
 * @author caarl
 */


public interface IMaestroBO {
    MaestroDTO buscarPorId(int id) throws BisnessException;
    List<MaestroDTO> buscarTodos() throws BisnessException;
    MaestroDTO guardar(MaestroDTO maestroDTO) throws BisnessException;
    void actualizar(MaestroDTO maestroDTO) throws BisnessException;
    void eliminar(int id) throws BisnessException;
    List<MaestroDTO> buscarPorDepartamento(String departamento) throws BisnessException;
    MaestroDTO buscarPorCorreo(String correo) throws BisnessException;
}