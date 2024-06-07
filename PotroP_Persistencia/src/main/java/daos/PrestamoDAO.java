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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO implements IPrestamoDAO {

    private static final List<Prestamo> lista = new ArrayList<>();

    @Override
    public void agregar(Prestamo prestamo) throws DAOException {
        lista.add(prestamo);
    }

    @Override
    public void eliminar(Prestamo prestamo) throws DAOException {
        Prestamo prestamos = buscarPorId(prestamo.getId());
        if (prestamos != null) {
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
    public Prestamo buscarPorId(int id) throws DAOException {
        for (Prestamo prestamo : lista) {
            if (prestamo.getId() == (id)) {
                return prestamo;
            }
        }
        throw new DAOException("Prestamo no encontrado");
    }

    @Override
    public List<Prestamo> listaPrestamos() throws DAOException {
        return new ArrayList<>(lista);
    }

    @Override
    public List<Prestamo> listaPaginada(int offset, int limit) throws DAOException {
        
    }

    @Override
    public boolean listaPorFechas(LocalDate begin, LocalDate end) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}