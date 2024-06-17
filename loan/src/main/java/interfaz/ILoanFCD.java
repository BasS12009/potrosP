/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import DTO.PrestamoDTO;
import excepcion.ControlExceptionException;
import java.time.LocalDate;
import javax.swing.JTable;

/**
 *
 * @author skevi
 */
public interface ILoanFCD {
    
    public void agregar(PrestamoDTO prestamoDTO) throws ControlExceptionException;
    
    public void llenarTablaHistorial(JTable tabla, int offset, int limit) throws ControlExceptionException;
    
    public boolean disponibilidadEmpleado(LocalDate begin, LocalDate end, String correo) throws ControlExceptionException;
    
    public boolean disponibilidadVehiculo(LocalDate begin, LocalDate end, String placa) throws ControlExceptionException;
    
    public boolean validarDatos (PrestamoDTO prestamoDTO) throws ControlExceptionException;
          
}
