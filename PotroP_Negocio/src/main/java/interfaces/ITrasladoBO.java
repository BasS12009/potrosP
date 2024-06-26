/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.TrasladoDTO;
import exceptions.BisnessException;

/**
 * Interfaz que define los métodos que deben ser implementados por las clases que actúen
 * como capa de negocio para la gestión de objetos TrasladoDTO.
 * 
 * Los métodos definidos en esta interfaz permiten realizar operaciones relacionadas con
 * la creación, actualización, búsqueda y verificación de existencia de traslados.
 * 
 * @author skevi
 */
public interface ITrasladoBO {
    
    /**
     * Método para agregar un nuevo traslado.
     * 
     * @param traslado El objeto TrasladoDTO que se desea agregar.
     * @throws BisnessException Si ocurre un error durante la operación de agregado.
     */
    public void agregar(TrasladoDTO traslado) throws BisnessException;
    
    /**
     * Método para actualizar un traslado existente.
     * 
     * @param traslado El objeto TrasladoDTO que se desea actualizar.
     * @throws BisnessException Si ocurre un error durante la operación de actualización.
     */
    public void actualizar(TrasladoDTO traslado) throws BisnessException;
    
    /**
     * Método para buscar un traslado por su número de traslado.
     * 
     * @param numTraslado El número de traslado a buscar.
     * @return El objeto TrasladoDTO correspondiente al número de traslado proporcionado.
     * @throws BisnessException Si ocurre un error durante la operación de búsqueda.
     */
    public TrasladoDTO buscar(int numTraslado) throws BisnessException;
    
    /**
     * Método para verificar si un traslado existe dado su número de traslado.
     * 
     * @param numTraslado El número de traslado a verificar.
     * @return true si el traslado existe, false en caso contrario.
     * @throws BisnessException Si ocurre un error durante la operación de verificación.
     */
    public boolean existe(int numTraslado) throws BisnessException;
}
