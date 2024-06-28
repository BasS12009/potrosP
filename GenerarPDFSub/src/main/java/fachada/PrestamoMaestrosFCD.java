
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

/**
 *
 * @author caarl
 */
import control.PrestamoMaestrosCTL;
import dtos.PrestamoMaestrosDTO;
import excepcion.FachadaException;
import exceptions.BisnessException;

public class PrestamoMaestrosFCD {
    
    private final PrestamoMaestrosCTL control;

    public PrestamoMaestrosFCD() {
        this.control = new PrestamoMaestrosCTL(); 
    }

    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaException {
        try{
        control.generarPDF(prestamo, filePath);
        }
        catch(BisnessException ex){
            throw new FachadaException(ex.getMessage());
        }
    }
    
}