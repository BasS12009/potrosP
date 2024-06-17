/**
 * VehiculoDAO.java
 * 
 * Esta clase permite agregar, eliminar, actualizar y buscar vehículos en una 
 * lista en memoria; Utilizando una implementación de la interfaz IVehiculoDAO, 
 * que proporciona acceso a los datos de vehículos utilizando una lista en memoria.
 */
package daos;

import Interfaces.IVehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class VehiculoDAO implements IVehiculoDAO {

    private static List<Vehiculo> lista = new ArrayList<>();

    /**
     * Agrega un vehículo a la lista.
     * 
     * @param vehiculo el vehículo a agregar.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public void agregar(Vehiculo vehiculo) throws DAOException {
        lista.add(vehiculo);
    }

    /**
     * Elimina un vehículo de la lista.
     * 
     * @param vehiculo el vehículo a eliminar.
     * @throws DAOException si el vehículo no se encuentra en la lista.
     */
    @Override
    public void eliminar(Vehiculo vehiculo) throws DAOException {
        Vehiculo vehiculos = buscarPorId(vehiculo.getId());
        if (vehiculos != null) {
            lista.remove(vehiculo);
        } else {
            throw new DAOException("Vehiculo no encontrado");
        }
    }

    /**
     * Actualiza un vehículo en la lista.
     * 
     * @param vehiculo el vehículo a actualizar.
     * @throws DAOException si el vehículo no se encuentra en la lista.
     */
    @Override
    public void actualizar(Vehiculo vehiculo) throws DAOException {
        Vehiculo vehiculoExistente = buscarPorId(vehiculo.getId());
        if (vehiculoExistente != null) {
            int index = lista.indexOf(vehiculoExistente);
            lista.set(index, vehiculo);
        } else {
            throw new DAOException("Vehiculo no encontrado");
        }
    }

    /**
     * Busca un vehículo por su identificador único.
     * 
     * @param id el identificador único del vehículo a buscar.
     * @return el vehículo encontrado.
     * @throws DAOException si el vehículo no se encuentra en la lista.
     */
    @Override
    public Vehiculo buscarPorId(int id) throws DAOException {
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getId() == id) {
                return vehiculo;
            }
        }
        throw new DAOException("Vehiculo no encontrado");
    }

    /**
     * Obtiene una lista de todos los vehículos almacenados.
     * 
     * @return una lista de todos los vehículos almacenados.
     * @throws DAOException si ocurre un error durante la operación.
     */
    @Override
    public List<Vehiculo> listaVehiculos() throws DAOException {
        return new ArrayList<>(lista);
    }
}