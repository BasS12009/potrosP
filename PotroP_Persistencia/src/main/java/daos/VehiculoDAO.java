/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IVehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caarl
 */
public class VehiculoDAO implements IVehiculoDAO {

    private static final List<Vehiculo> lista = new ArrayList<>();

    @Override
    public void agregar(Vehiculo vehiculo) throws DAOException {
        lista.add(vehiculo);
    }

    @Override
    public void eliminar(String id) throws DAOException {
        Vehiculo vehiculo = buscarPorId(id);
        if (vehiculo != null) {
            lista.remove(vehiculo);
        } else {
            throw new DAOException("Vehiculo no encontrado");
        }
    }

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

    @Override
    public Vehiculo buscarPorId(String id) throws DAOException {
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getId().equals(id)) {
                return vehiculo;
            }
        }
        throw new DAOException("Vehiculo no encontrado");
    }

    @Override
    public List<Vehiculo> listaVehiculos() throws DAOException {
        return new ArrayList<>(lista);
    }
}