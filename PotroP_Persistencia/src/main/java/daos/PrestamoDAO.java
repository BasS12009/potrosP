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

    private static List<Prestamo> lista = new ArrayList<>();

    /**
     * 
     * @param prestamo
     * @throws DAOException 
     */
    @Override
    public void agregar(Prestamo prestamo) throws DAOException {
        lista.add(prestamo);
    }

    /**
     * 
     * @param prestamo
     * @throws DAOException 
     */
    @Override
    public void eliminar(Prestamo prestamo) throws DAOException {
        Prestamo prestamos = buscarPorId(prestamo.getId());
        if (prestamos != null) {
            lista.remove(prestamo);
        } else {
            throw new DAOException("Prestamo no encontrado");
        }
    }

    /**
     * 
     * @param prestamo
     * @throws DAOException 
     */
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

    /**
     * 
     * @param id
     * @return
     * @throws DAOException 
     */
    @Override
    public Prestamo buscarPorId(int id) throws DAOException {
        for (Prestamo prestamo : lista) {
            if (prestamo.getId() == id) {
                return prestamo;
            }
        }
        throw new DAOException("Prestamo no encontrado");
    }

    /**
     * 
     * @return
     * @throws DAOException 
     */
    @Override
    public List<Prestamo> listaPrestamos() throws DAOException {
        return new ArrayList<>(lista);
    }

    /**
     * 
     * @param begin
     * @param end
     * @return
     * @throws DAOException 
     */
    @Override
    public List<Prestamo> listaPorFechas(LocalDate begin, LocalDate end) throws DAOException {
    if (begin == null || end == null) {
        throw new IllegalArgumentException("Las fechas no pueden ser nulas.");
    }
    List<Prestamo> prestamosEnRango = new ArrayList<>();
    for (Prestamo prestamo : lista) {
        if ((prestamo.getInicio().isEqual(begin) || prestamo.getInicio().isAfter(begin)) &&
            (prestamo.getFin().isEqual(end) || prestamo.getFin().isBefore(end))) {
            prestamosEnRango.add(prestamo);
        }
    }
    return prestamosEnRango;
    }

    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws DAOException 
     */
    @Override
    public List<Prestamo> listaPaginda(int offset, int limit) throws DAOException {
        if (offset < 0 || limit < 0) {
            throw new IllegalArgumentException("Offset y limit deben ser mayores o iguales a 0.");
        }
        if (offset >= lista.size()) {
            return new ArrayList<>();
        }
        return lista.subList(offset, Math.min(offset + limit, lista.size()));    }

}

    
