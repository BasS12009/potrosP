
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

/**
 *
 * @author caarl
 */
import control.ResumenCTL;
import dtos.PrestamoMaestrosDTO;
import excepcion.FachadaException;
import exceptions.BisnessException;
import interfaz.IResumenFCD;

public class ResumenFCD implements IResumenFCD{
    
    private final ResumenCTL control;

    public ResumenFCD() {
        this.control = new ResumenCTL(); 
    }

    @Override
    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaException {
        try{
        control.generarPDF(prestamo, filePath);
        }
        catch(BisnessException ex){
            throw new FachadaException(ex.getMessage());
        }
    }
    
}