/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.PrestamoDTO;
import excepcion.FachadaException;

/**
 *
 * @author skevi
 */
public interface ILoanFCD {
    
    public void agregar(PrestamoDTO prestamoDTO) throws FachadaException;
    
}
