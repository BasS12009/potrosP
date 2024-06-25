/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IPrestamoMaestrosDAO;
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrestamoMaestrosDAO implements IPrestamoMaestrosDAO {
    private static final List<PrestamoMaestros> lista = new ArrayList<>();
    private static int nextId = 1;

    public PrestamoMaestrosDAO() {
        try {
            // Agregar algunos préstamos predeterminados
            agregar(new PrestamoMaestros(LocalDate.now(), "Matemáticas", 2, "Conferencia", "Plantel A", "Plantel B", "Automóvil", "prof1@ejemplo.com", Arrays.asList("acomp1@ejemplo.com")));
            agregar(new PrestamoMaestros(LocalDate.now().plusDays(1), "Física", 3, "Visita de campo", "Plantel B", "Plantel C", "Camioneta", "prof2@ejemplo.com", Arrays.asList("acomp2@ejemplo.com", "acomp3@ejemplo.com")));
        } catch (DAOException ex) {
            Logger.getLogger(PrestamoMaestrosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            prestamoMaestros.setId(nextId++);
            lista.add(prestamoMaestros);
        } catch (Exception e) {
            throw new DAOException("Error interno al agregar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            PrestamoMaestros prestamo = buscarPorId(prestamoMaestros.getId());
            if (prestamo != null) {
                lista.remove(prestamo);
            } else {
                throw new DAOException("El préstamo de maestros no existe");
            }
        } catch (DAOException e) {
            throw new DAOException("Error al eliminar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
            PrestamoMaestros prestamoExistente = buscarPorId(prestamoMaestros.getId());
            if (prestamoExistente != null) {
                int index = lista.indexOf(prestamoExistente);
                lista.set(index, prestamoMaestros);
            } else {
                throw new DAOException("El préstamo de maestros no existe");
            }
        } catch (DAOException e) {
            throw new DAOException("Error al actualizar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public PrestamoMaestros buscarPorId(int id) throws DAOException {
        try {
            for (PrestamoMaestros prestamo : lista) {
                if (prestamo.getId() == id) {
                    return prestamo;
                }
            }
            return null;
        } catch (Exception e) {
            throw new DAOException("Error al obtener el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public List<PrestamoMaestros> listaPrestamosMaestros() throws DAOException {
        try {
            return new ArrayList<>(lista);
        } catch (Exception e) {
            throw new DAOException("Error al obtener la lista de préstamos de maestros: " + e.getMessage());
        }
    }
}