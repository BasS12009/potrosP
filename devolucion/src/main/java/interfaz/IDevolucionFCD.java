/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import dtos.TrasladoDTO;
import excepcion.FachadaException;

/**
 * Interface IDevolucionFCD define los métodos para la fachada de devoluciones.
 * 
 * @autor skevi
 */
public interface IDevolucionFCD {
    
    /**
     * Verifica si existe un traslado con el número especificado.
     * 
     * @param folio el número del traslado a verificar.
     * @return true si el traslado existe, false en caso contrario.
     * @throws FachadaException si ocurre un error durante la verificación.
     */
    public boolean existe(String folio) throws FachadaException;
    
    /**
     * Busca y retorna el traslado con el número especificado.
     * 
     * @param folio el número del traslado a buscar.
     * @return el objeto TrasladoDTO correspondiente al número de traslado.
     * @throws FachadaException si ocurre un error durante la búsqueda.
     */
    public TrasladoDTO buscar(String folio) throws FachadaException;
    
    /**
     * Agrega un nuevo traslado de devolución.
     * 
     * @param original el objeto TrasladoDTO original.
     * @param motivo
     * @throws FachadaException si ocurre un error durante la adición.
     */
    public void agregar(TrasladoDTO original, String motivo) throws FachadaException; 
}

