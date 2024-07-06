/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.PrestamoMaestrosDTO;
import exceptions.BisnessException;
import java.util.List;

public interface IPrestamoMaestrosBO {
    
    public void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    
    public PrestamoMaestrosDTO buscarPorId(String id) throws BisnessException;
    
    public List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws BisnessException;
    
    public void eliminar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    
    public void actualizar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    
    
}