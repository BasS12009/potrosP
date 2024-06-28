<<<<<<< Updated upstream
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
import interfaz.IPrestamoMaestrosFCD;

public class PrestamoMaestrosFCD implements IPrestamoMaestrosFCD {
    
    private final PrestamoMaestrosCTL control;

    public PrestamoMaestrosFCD() {
        this.control = new PrestamoMaestrosCTL(); // Instanciamos la fachada concreta
    }

    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaException {
        try{
        control.generarPDF(prestamo, filePath);
        }
        catch(BisnessException ex){
            throw new FachadaException(ex.getMessage());
        }
    }
    
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

/**
 *
 * @author caarl
 */
import dtos.PrestamoMaestrosDTO;
import excepcion.FachadaException;


import interfaz.IPrestamoMaestrosFCD;

public class PrestamoMaestrosFCD implements IPrestamoMaestrosFCD {
    
    private final IPrestamoMaestrosFCD fachada;

    public PrestamoMaestrosFCD() {
        this.fachada = new PrestamoMaestrosFCD(); // Instanciamos la fachada concreta
    }

    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaException{
        fachada.generarPDF(prestamo, filePath);
    }
    
>>>>>>> Stashed changes
}