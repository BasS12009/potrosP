/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import Interfaces.IMaestroDAO;
import daos.MaestroDAO;
import entidades.Maestro;
import excepciones.DAOException;
import exceptions.BisnessException;
import interfaces.IMaestroBO;
import java.util.List;

/**
 *
 * @author caarl
 */
public class MaestroBO implements IMaestroBO {

    private final IMaestroDAO maestroDAO;
    private final MaestroCVR maestroCVR;

    public MaestroBO() {
        this.maestroDAO = new MaestroDAO();
        this.maestroCVR = new MaestroCVR();
    }

    @Override
    public Maestro buscarPorId(Long id) throws BisnessException {
        try {
            return this.maestroDAO.buscarPorId(id);
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    @Override
    public List<MaestroDTO> listaMaestros() throws BisnessException {
        List<MaestroDTO> lista = new ArrayList<>();
        try {
            List<Maestro> listaMaestros = maestroDAO.listaMaestros();

            for (Maestro maestro : listaMaestros) {
                lista.add(maestroCVR.convertir_DTO(maestro));    
            }
            return lista;
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    @Override
    public List<MaestroDTO> buscarPorNombre(String nombre) throws BisnessException {
        try {
            List<MaestroDTO> listaBO = new ArrayList<>();
            List<Maestro> listaDAO = maestroDAO.buscarPorNombre(nombre);

            for (Maestro maestro : listaDAO) {
                listaBO.add(maestroCVR.convertir_DTO(maestro));
            }

            return listaBO;
        } catch (DAOException ex) {
            throw new BisnessException(ex.getMessage());
        }
    }

    
}