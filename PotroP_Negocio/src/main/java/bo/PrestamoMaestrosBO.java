/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import DTO.PrestamoMaestrosDTO;
import converters.PrestamoMaestrosCVR;
import daos.PrestamoMaestrosDAO;
import entidades.PrestamoMaestros;
import exceptions.BisnessException;
import excepciones.DAOException;
import interfaces.IPrestamoMaestrosBO;
import Interfaces.IPrestamoMaestrosDAO;

import java.util.ArrayList;
import java.util.List;

public class PrestamoMaestrosBO implements IPrestamoMaestrosBO {

    private final IPrestamoMaestrosDAO prestamoMaestrosDAO;
    private final PrestamoMaestrosCVR prestamoMaestrosCVR;

    public PrestamoMaestrosBO() throws DAOException {
        this.prestamoMaestrosDAO = new PrestamoMaestrosDAO();
        this.prestamoMaestrosCVR = new PrestamoMaestrosCVR();
    }

    @Override
    public void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException {
        try {
            PrestamoMaestros entidad = prestamoMaestrosCVR.convertir_PrestamoMaestros(prestamoMaestrosDTO);
            prestamoMaestrosDAO.agregar(entidad);
        } catch (DAOException e) {
            throw new BisnessException("Error al agregar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException {
        try {
            PrestamoMaestros entidad = prestamoMaestrosCVR.convertir_PrestamoMaestros(prestamoMaestrosDTO);
            prestamoMaestrosDAO.eliminar(entidad);
        } catch (DAOException e) {
            throw new BisnessException("Error al eliminar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException {
        try {
            PrestamoMaestros entidad = prestamoMaestrosCVR.convertir_PrestamoMaestros(prestamoMaestrosDTO);
            prestamoMaestrosDAO.actualizar(entidad);
        } catch (DAOException e) {
            throw new BisnessException("Error al actualizar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public PrestamoMaestrosDTO buscarPorId(int id) throws BisnessException {
        try {
            PrestamoMaestros entidad = prestamoMaestrosDAO.buscarPorId(id);
            return prestamoMaestrosCVR.convertir_DTO(entidad);
        } catch (DAOException e) {
            throw new BisnessException("Error al buscar el préstamo de maestros: " + e.getMessage());
        }
    }

    @Override
    public List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws BisnessException {
        try {
            List<PrestamoMaestros> entidades = prestamoMaestrosDAO.listaPrestamosMaestros();
            List<PrestamoMaestrosDTO> dtos = new ArrayList<>();
            for (PrestamoMaestros entidad : entidades) {
                dtos.add(prestamoMaestrosCVR.convertir_DTO(entidad));
            }
            return dtos;
        } catch (DAOException e) {
            throw new BisnessException("Error al obtener la lista de préstamos de maestros: " + e.getMessage());
        }
    }
}
