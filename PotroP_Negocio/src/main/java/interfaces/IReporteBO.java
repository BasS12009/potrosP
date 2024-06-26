/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.ReporteDTO;
import exceptions.BisnessException;

/**
 *
 * @author skevi
 */
public interface IReporteBO {
    
    public void agregar(ReporteDTO reporteDTO) throws BisnessException;
    
}
