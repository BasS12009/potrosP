/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Vehiculo;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author diana
 */
/**
 * Interfaz IVehiculoDAO define métodos para operaciones CRUD relacionadas con los vehículos.
 */
public interface IVehiculoDAO {
     
    /**
     * Agrega un nuevo vehículo.
     * 
     * @param vehiculo El objeto Vehiculo que se va a agregar
     * @throws DAOException Si ocurre algún error durante la operación de agregar
     */
    public void agregar(Vehiculo vehiculo) throws DAOException;
    
    
    
    /**
     * Obtiene todos los vehículos almacenados.
     * 
     * @return Una lista de objetos Vehiculo
     * @throws DAOException Si ocurre algún error durante la obtención de la lista de vehículos
     */
    public List<Vehiculo> obtenerTodos() throws DAOException;
    
    boolean isVehiculoPrestado(String placa) throws DAOException;
   
}
