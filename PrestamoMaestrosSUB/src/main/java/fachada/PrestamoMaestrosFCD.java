/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;


import dtos.PrestamoMaestrosDTO;
import control.PrestamoMaestrosCTL;
import excepcion.ControlException;
import excepcion.FachadaException;
import exceptions.BisnessException;
import interfaz.IPrestamoMaestrosFCD;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrestamoMaestrosFCD implements IPrestamoMaestrosFCD {

    private final PrestamoMaestrosCTL control;
     

    public PrestamoMaestrosFCD() throws BisnessException {
        this.control = new PrestamoMaestrosCTL();
        
    }

    
    @Override
    public void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws FachadaException {
        try {
            if (control.validarDatos(prestamoMaestrosDTO)) {
                try {
                    control.agregar(prestamoMaestrosDTO);
                } catch (BisnessException ex) {
                    Logger.getLogger(PrestamoMaestrosFCD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ControlException ex) {
            throw new FachadaException("Error al agregar el préstamo de maestros: " + ex.getMessage());
        }
    }

    @Override
    public void eliminar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws FachadaException {
        try {
            try {
                control.eliminar(prestamoMaestrosDTO);
            } catch (BisnessException ex) {
                Logger.getLogger(PrestamoMaestrosFCD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ControlException ex) {
            throw new FachadaException("Error al eliminar el préstamo de maestros: " + ex.getMessage());
        }
    }

    @Override
    public void actualizar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws FachadaException {
        try {
            if (control.validarDatos(prestamoMaestrosDTO)) {
                try {
                    control.actualizar(prestamoMaestrosDTO);
                } catch (BisnessException ex) {
                    Logger.getLogger(PrestamoMaestrosFCD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ControlException ex) {
            throw new FachadaException("Error al actualizar el préstamo de maestros: " + ex.getMessage());
        }
    }


    public PrestamoMaestrosDTO buscarPorId(int id) throws FachadaException {
        try {
            try {
                return control.buscarPorId(id);
            } catch (BisnessException ex) {
                Logger.getLogger(PrestamoMaestrosFCD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ControlException ex) {
            throw new FachadaException("Error al buscar el préstamo de maestros: " + ex.getMessage());
        }
        return null;
    }


    @Override
    public List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws FachadaException {
        if (this.control == null) {
            throw new FachadaException("Error: control no ha sido inicializado");
        }
        try {
            return control.listaPrestamosMaestros();
        } catch (BisnessException | ControlException ex) {
            throw new FachadaException("Error al obtener la lista de préstamos de maestros: " + ex.getMessage());
        }
    }

    
}