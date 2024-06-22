/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTO.TrasladoDTO;
import exceptions.BisnessException;

/**
 *
 * @author skevi
 */
public interface ITrasladoBO {
    
    public void agregar(TrasladoDTO traslado) throws BisnessException;
    
    public void actualizar(TrasladoDTO traslado) throws BisnessException;
    
    public TrasladoDTO buscar(int numTraslado) throws BisnessException;
    
    public boolean existe(int numTraslado) throws BisnessException;
}
