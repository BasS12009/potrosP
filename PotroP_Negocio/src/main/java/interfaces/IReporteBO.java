/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.ReporteDTO;
import exceptions.BisnessException;

/**
 * Interfaz que define el método que debe ser implementado por las clases que actúen
 * como capa de negocio para la gestión de objetos ReporteDTO.
 * 
 * El método definido en esta interfaz permite realizar la operación de agregar un reporte.
 * 
 * @author skevi
 */
public interface IReporteBO {
    
    /**
     * Método para agregar un reporte.
     * 
     * @param reporteDTO El objeto ReporteDTO que se desea agregar.
     * @throws BisnessException Si ocurre un error durante la operación de agregado.
     */
    public void agregar(ReporteDTO reporteDTO) throws BisnessException;
}
