/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.List;
/**
 *
 * @author caarl
 */

public interface IVehiculoDAO {
    void agregar(Vehiculo vehiculo) throws DAOException;
    void eliminar(String id) throws DAOException;
    void actualizar(Vehiculo vehiculo) throws DAOException;
    Vehiculo buscarPorId(String id) throws DAOException;
    List<Vehiculo> listaVehiculos() throws DAOException;
}
