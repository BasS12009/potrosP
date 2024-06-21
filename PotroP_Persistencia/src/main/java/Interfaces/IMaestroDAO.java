/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Maestro;
import excepciones.DAOException;
import java.util.List;

/**
 *
 * @author caarl
 */


public interface IMaestroDAO {
    Maestro buscarPorId(int id) throws DAOException;
    List<Maestro> buscarTodos() throws DAOException;
    Maestro guardar(Maestro maestro) throws DAOException;
    void actualizar(Maestro maestro) throws DAOException;
    void eliminar(int id) throws DAOException;
    List<Maestro> buscarPorDepartamento(String departamento) throws DAOException;
    Maestro buscarPorCorreo(String correo) throws DAOException;
}
