/**
 * IVehiculoDAO.java
 * 
 * Interfaz que define las operaciones de acceso a datos relacionadas con los vehículos;
 * 
 * Esta interfaz define métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * relacionadas con los vehículos en el sistema;
 * 
 * Implementaciones de esta interfaz proporcionan la lógica necesaria para interactuar con la capa de
 * persistencia de vehículos en la base de datos.
 */
package Interfaces;

import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.List;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IVehiculoDAO {
     /**
     * Agrega un nuevo vehículo al sistema.
     * 
     * @param vehiculo objeto de tipo Vehiculo que representa el vehículo a agregar.
     * @throws DAOException si ocurre un error durante la operación de agregar.
     */
    void agregar(Vehiculo vehiculo) throws DAOException;
    
    /**
     * Elimina un vehículo del sistema.
     * 
     * @param vehiculo objeto de tipo Vehiculo que representa el vehículo a eliminar.
     * @throws DAOException si ocurre un error durante la operación de eliminar.
     */
    void eliminar(Vehiculo vehiculo) throws DAOException;
    
    /**
     * Actualiza un vehículo en el sistema.
     * 
     * @param vehiculo objeto de tipo Vehiculo que representa el vehículo a actualizar.
     * @throws DAOException si ocurre un error durante la operación de actualizar.
     */
    void actualizar(Vehiculo vehiculo) throws DAOException;
    
    /**
     * Busca un vehículo por su identificador único.
     * 
     * @param id el identificador único del vehículo a buscar.
     * @return el vehículo encontrado.
     * @throws DAOException si ocurre un error durante la operación de búsqueda.
     */
    Vehiculo buscarPorId(int id) throws DAOException;
    
    /**
     * Obtiene una lista de todos los vehículos almacenados en el sistema.
     * 
     * @return una lista de objetos de tipo Vehiculo.
     * @throws DAOException si ocurre un error durante la operación de obtener la lista.
     */
    List<Vehiculo> listaVehiculos() throws DAOException;
}