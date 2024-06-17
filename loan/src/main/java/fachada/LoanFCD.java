/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import DTO.PrestamoDTO;
import control.LoanCTL;
import excepcion.ControlException;
import excepcion.FachadaException;
import interfaz.ILoanFCD;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author skevi
 */
public class LoanFCD implements ILoanFCD{

    private LoanCTL control;

    public LoanFCD() {
        this.control = new LoanCTL();
    }

    @Override
    public void agregar(PrestamoDTO prestamoDTO) throws FachadaException {
        try{
            
            LocalDate inicio = prestamoDTO.getInicio();
            LocalDate fin = prestamoDTO.getFin(); 
            String correo = prestamoDTO.getCorreoEmpleado();
            String placa = prestamoDTO.getPlacaVehiculo();
            
           //comenzaremos con la aplicacion de filtros 
               //validamos si los datos de prestamo son correctos
               if (control.validarDatos(prestamoDTO)) {
                   //validamos si el empleado esta disponible
                   if (control.disponibilidadEmpleado(inicio, fin, correo)) {
                       //validamos si el vehiculo esta disponible
                       if (control.disponibilidadVehiculo(inicio, fin, placa)) {
                           //si todo esta correcto agregamos el prestamo
                           control.agregar(prestamoDTO);
                           JOptionPane.showMessageDialog(null, "¡Prestamo agregado con exito!");
                    }
                }
            }
        }
        catch(ControlException ex){
            throw new FachadaException(ex.getMessage()); 
        }
    }
    
}
