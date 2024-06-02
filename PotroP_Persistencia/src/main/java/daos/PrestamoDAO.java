/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 *
 * @author caarl
 */
import Interfaces.IPrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO implements IPrestamoDAO {

    private static final List<Prestamo> lista = new ArrayList<>();

    @Override
    public void agregar(Prestamo prestamo) throws DAOException {
        lista.add(prestamo);
    }

    @Override
    public void eliminar(String id) throws DAOException {
        Prestamo prestamo = buscarPorId(id);
        if (prestamo != null) {
            lista.remove(prestamo);
        } else {
            throw new DAOException("Prestamo no encontrado");
        }
    }

    @Override
    public void actualizar(Prestamo prestamo) throws DAOException {
        Prestamo prestamoExistente = buscarPorId(prestamo.getId());
        if (prestamoExistente != null) {
            int index = lista.indexOf(prestamoExistente);
            lista.set(index, prestamo);
        } else {
            throw new DAOException("Prestamo no encontrado");
        }
    }

    @Override
    public Prestamo buscarPorId(String id) throws DAOException {
        for (Prestamo prestamo : lista) {
            if (prestamo.getId().equals(id)) {
                return prestamo;
            }
        }
        throw new DAOException("Prestamo no encontrado");
    }

    @Override
    public List<Prestamo> listaPrestamos() throws DAOException {
        return new ArrayList<>(lista);
    }
}