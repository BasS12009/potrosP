/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import dtos.PrestamoDTO;
import excepcion.FachadaException;
import java.time.LocalDate;
import java.util.List;

/**
 * Interfaz ILoanFCD que define la operación de la fachada relacionada con los préstamos.
 * 
 * Autor: skevi
 */
public interface ILoanFCD {

    /**
     * Agrega un nuevo préstamo.
     * 
     * @param prestamoDTO El objeto PrestamoDTO que contiene los datos del préstamo.
     * @throws FachadaException Si ocurre un error en la capa de fachada.
     */
    public void agregar(PrestamoDTO prestamoDTO) throws FachadaException;
    
   
}

