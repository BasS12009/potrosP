/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import bo.PrestamoBO;
import DTO.PrestamoDTO;
import exceptions.BisnessException;
import interfaces.IPrestamoBO;
import java.time.LocalDate;
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
        prestamoBO.agregar(prestamoDTO);
    }
    
    public List<PrestamoDTO> listaPaginada(int offset, int limit)throws BisnessException{
        return prestamoBO.listaPaginda(offset, limit);
    }
    
    public List<PrestamoDTO> listaPorFechas(LocalDate begin, LocalDate end) throws BisnessException{
        return prestamoBO.listaPorFechas(begin, end);
    }
 }   
