/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.PrestamoDTO;
import excepcion.LoanException;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author skevi
 */
public interface ILoan {
    
    public void agregar(PrestamoDTO prestamoDTO) throws LoanException;
    
    public void llenarTablaHistorial(JTable tabla) throws LoanException;
    
    public void llenarCBX(JComboBox comboBox) throws LoanException;
   
    public void llenarTablaAdmin(JComboBox comboBox) throws LoanException;
    
    public boolean validarDisponibilidad(LocalDate begin, LocalDate end) throws LoanException;
}
