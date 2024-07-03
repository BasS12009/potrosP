/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.TrasladoDTO;
import exceptions.BisnessException;

/**
 *
 * @author diana
 */
public interface ITrasladoBO {
     // Método que se implementa para agregar un nuevo traslado
    // Recibe un objeto TrasladoDTO como parámetro y puede lanzar una excepción
    public void agregar(TrasladoDTO traslado) throws BisnessException;
    
    public boolean existe(int numTraslado) throws BisnessException;
    
    public TrasladoDTO buscar(int Folio) throws BisnessException;
    
    public void actualizar(TrasladoDTO trasladoDTO) throws BisnessException;
    
}
