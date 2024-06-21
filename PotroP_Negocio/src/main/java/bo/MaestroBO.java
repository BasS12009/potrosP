/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import converters.MaestroCVR;
import DTO.MaestroDTO;
import exceptions.BisnessException;
import Interfaces.IMaestroDAO;
import daos.MaestroDAO;
import entidades.Maestro;
import excepciones.DAOException;
import interfaces.IMaestroBO;
import java.util.ArrayList;
import java.util.List;

public class MaestroBO implements IMaestroBO {

    private final IMaestroDAO maestroDAO;
    private final MaestroCVR maestroCVR;

    public MaestroBO() {
        this.maestroDAO = new MaestroDAO();
        this.maestroCVR = new MaestroCVR();
    }

    @Override
    public MaestroDTO buscarPorId(int id) throws BisnessException {
        try {
            Maestro maestro = maestroDAO.buscarPorId(id);
            return maestroCVR.convertir_DTO(maestro);
        } catch (DAOException e) {
            throw new BisnessException("Error al buscar maestro por ID: " + e.getMessage());
        }
    }

    @Override
    public List<MaestroDTO> buscarTodos() throws BisnessException {
        try {
            List<Maestro> maestros = maestroDAO.buscarTodos();
            List<MaestroDTO> maestrosDTO = new ArrayList<>();
            for (Maestro maestro : maestros) {
                maestrosDTO.add(maestroCVR.convertir_DTO(maestro));
            }
            return maestrosDTO;
        } catch (DAOException e) {
            throw new BisnessException("Error al buscar todos los maestros: " + e.getMessage());
        }
    }

    @Override
    public MaestroDTO guardar(MaestroDTO maestroDTO) throws BisnessException {
        try {
            Maestro maestro = maestroCVR.convertir_Maestro(maestroDTO);
            Maestro maestroGuardado = maestroDAO.guardar(maestro);
            return maestroCVR.convertir_DTO(maestroGuardado);
        } catch (DAOException e) {
            throw new BisnessException("Error al guardar maestro: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(MaestroDTO maestroDTO) throws BisnessException {
        try {
            Maestro maestro = maestroCVR.convertir_Maestro(maestroDTO);
            maestroDAO.actualizar(maestro);
        } catch (DAOException e) {
            throw new BisnessException("Error al actualizar maestro: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) throws BisnessException {
        try {
            maestroDAO.eliminar(id);
        } catch (DAOException e) {
            throw new BisnessException("Error al eliminar maestro: " + e.getMessage());
        }
    }

    @Override
    public List<MaestroDTO> buscarPorDepartamento(String departamento) throws BisnessException {
        try {
            List<Maestro> maestros = maestroDAO.buscarPorDepartamento(departamento);
            List<MaestroDTO> maestrosDTO = new ArrayList<>();
            for (Maestro maestro : maestros) {
                maestrosDTO.add(maestroCVR.convertir_DTO(maestro));
            }
            return maestrosDTO;
        } catch (DAOException e) {
            throw new BisnessException("Error al buscar maestros por departamento: " + e.getMessage());
        }
    }

    @Override
    public MaestroDTO buscarPorCorreo(String correo) throws BisnessException {
        try {
            Maestro maestro = maestroDAO.buscarPorCorreo(correo);
            return maestroCVR.convertir_DTO(maestro);
        } catch (DAOException e) {
            throw new BisnessException("Error al buscar maestro por correo: " + e.getMessage());
        }
    }
}