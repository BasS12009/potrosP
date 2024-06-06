/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BO.PrestamoBO;
import DTO.PrestamoDTO;
import Exceptions.BisnessException;
import interfaces.IPrestamoBO;
import java.util.List;

/**
 *
 * @author skevi
 */
public class LoanCTL {
    
    private IPrestamoBO prestamoBO;

    public LoanCTL() {
        this.prestamoBO = new PrestamoBO();
    }
    
    public void agregar(PrestamoDTO prestamoDTO) throws BisnessException{
    //    try{
            
        //}
      //  catch()
    }
    
    //public List<PrestamoDTO> listaPrestamos() throws BisnessException{
        
    //}
 }   
