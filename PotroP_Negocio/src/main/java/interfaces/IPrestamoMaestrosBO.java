/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.PrestamoMaestrosDTO;
import exceptions.BisnessException;
import java.util.List;

public interface IPrestamoMaestrosBO {
    
    void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    void eliminar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    void actualizar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    PrestamoMaestrosDTO buscarPorId(int id) throws BisnessException;
    List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws BisnessException;
    
}
