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
    void eliminar(Vehiculo vehiculo) throws DAOException;
    void actualizar(Vehiculo vehiculo) throws DAOException;
    Vehiculo buscarPorId(int id) throws DAOException;
    List<Vehiculo> listaVehiculos() throws DAOException;
}
