/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.PrestamoMaestrosDTO;
import exceptions.BisnessException;
import java.util.List;
import org.bson.types.ObjectId;

public interface IPrestamoMaestrosBO {
    
    public void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws BisnessException;
    
    public PrestamoMaestrosDTO buscarPorId(ObjectId id) throws BisnessException;
    
    public List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws BisnessException;
    
}
