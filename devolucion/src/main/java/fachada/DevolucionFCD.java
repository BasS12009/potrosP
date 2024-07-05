/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import dtos.TrasladoDTO;
import control.DevolucionCTL;
import excepcion.FachadaException;
import exceptions.BisnessException;
import interfaz.IDevolucionFCD;
import javax.swing.JOptionPane;

/**
 * Clase que implementa la interfaz IDevolucionFCD y se encarga de la 
 * gestión de devoluciones. La clase utiliza un objeto DevolucionCTL para 
 * realizar operaciones relacionadas con devoluciones.
 * 
 * @autor skevi
 */
public class DevolucionFCD implements IDevolucionFCD {
    
    // Objeto DevolucionCTL utilizado para realizar las operaciones de devolución
    private DevolucionCTL devolucion;

    /**
     * Constructor de la clase que inicializa el objeto DevolucionCTL.
     */
    public DevolucionFCD() {
        this.devolucion = new DevolucionCTL();
    }

    /**
     * Método que verifica si existe un traslado con el número especificado.
     * 
     * @param numTraslado El número del traslado a verificar.
     * @return true si el traslado existe, false en caso contrario.
     * @throws FachadaException si ocurre un error en la capa de negocio.
     */
    @Override
    public boolean existe(String folio) throws FachadaException {
        try {
             return devolucion.existe(folio);
        } catch (BisnessException ex) {
            throw new FachadaException(ex.getMessage());
        }
    }

    /**
     * Método que busca y retorna un traslado con el número especificado.
     * 
     * @param folio El número del traslado a buscar.
     * @return El objeto TrasladoDTO correspondiente al número de traslado 
     *         especificado.
     * @throws FachadaException si ocurre un error en la capa de negocio.
     */
    @Override
    public TrasladoDTO buscar(String folio) throws FachadaException {
        try {
            // Buscar el traslado con el número especificado
            return devolucion.buscar(folio);
        } catch (BisnessException ex) {
            // Capturar la excepción de negocio y lanzar una FachadaException
            throw new FachadaException(ex.getMessage());
        }
    }

    /**
     * Método que agrega un traslado original y uno devuelto, comparando sus 
     * campos.
     * 
     * @param original El objeto TrasladoDTO del traslado original.
     * @throws FachadaException si ocurre un error en la capa de negocio.
     */
    @Override
    public void agregar(TrasladoDTO original, String motivo) throws FachadaException {
        try {
            // Validar los campos del traslado original antes de proceder
            if (devolucion.validaCampos(original)) {
                // Comparar los campos del traslado original y el traslado devuelto
                if (devolucion.compararCampos(original)) {
                    devolucion.agregar(original, motivo);
                    devolucion.actualizar(original);
                    JOptionPane.showMessageDialog(null, "El traslado ha sido agregado con exito");
                } else {
                    devolucion.agregar(original, motivo);
                    devolucion.enviarCorreo(original, motivo);
                    devolucion.actualizar(original);
                    JOptionPane.showMessageDialog(null, """
                                                        El traslado ha sido agregado con exito
                                                        Correo de reporte por incosistencia en devolucion ennviado""");
                }
            }
        } catch (BisnessException ex) {
            // Capturar la excepción de negocio y lanzar una FachadaException
            throw new FachadaException(ex.getMessage());
        }
    }
}
