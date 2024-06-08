/**
 * IVehiculoBO.java
 * 
 * Interfaz que define las operaciones de negocio relacionadas con los vehículos;
 * 
 * Esta interfaz define métodos para realizar operaciones relacionadas con los vehículos,
 * como agregar, eliminar, actualizar y buscar vehículos en el sistema;
 * 
 * Implementaciones de esta interfaz pueden manejar la lógica de negocio asociada con los vehículos
 * y proporcionar acceso a la capa de datos para interactuar con la persistencia de vehículos en
 * la base de datos.
 */
package interfaces;

import DTO.VehiculoDTO;
import Exceptions.BisnessException;
import entidades.Vehiculo;
import java.util.List;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IVehiculoBO {
    
    /**
     * Agrega un nuevo vehículo al sistema.
     * 
     * @param vehiculoDTO objeto de tipo VehiculoDTO que representa el vehículo a agregar.
     * @throws BisnessException si ocurre un error durante la operación de agregar.
     */
    public void agregar(VehiculoDTO vehiculoDTO) throws BisnessException;
    
    /**
     * Elimina un vehículo del sistema.
     * 
     * @param vehiculoDTO objeto de tipo VehiculoDTO que representa el vehículo a eliminar.
     * @throws BisnessException si ocurre un error durante la operación de eliminar.
     */
    public void eliminar(VehiculoDTO vehiculoDTO) throws BisnessException;
    
    /**
     * Actualiza un vehículo en el sistema.
     * 
     * @param vehiculoDTO objeto de tipo VehiculoDTO que representa el vehículo a actualizar.
     * @throws BisnessException si ocurre un error durante la operación de actualizar.
     */
    public void actualizar(VehiculoDTO vehiculoDTO) throws BisnessException;
    
    /**
     * Busca un vehículo por su identificador único.
     * 
     * @param id el identificador único del vehículo a buscar.
     * @return el vehículo encontrado.
     * @throws BisnessException si ocurre un error durante la operación de búsqueda.
     */
     public Vehiculo buscarPorId(int id) throws BisnessException;
     
     /**
      * Obtiene una lista de todos los vehículos almacenados en el sistema.
      * 
      * @return una lista de objetos de tipo VehiculoDTO.
      * @throws BisnessException si ocurre un error durante la operación de obtener la lista.
      */
     public List<VehiculoDTO> listaVehiculos() throws BisnessException;
     
}