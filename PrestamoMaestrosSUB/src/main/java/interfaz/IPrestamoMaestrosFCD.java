/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;


import dtos.PrestamoMaestrosDTO;
import excepcion.FachadaException;
import java.util.List;

public interface IPrestamoMaestrosFCD {
    
    void agregar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws FachadaException;
    void eliminar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws FachadaException;
    void actualizar(PrestamoMaestrosDTO prestamoMaestrosDTO) throws FachadaException;
    
    
    List<PrestamoMaestrosDTO> listaPrestamosMaestros() throws FachadaException;
    
   
   
    
}