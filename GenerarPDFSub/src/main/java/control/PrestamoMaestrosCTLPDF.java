/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author caarl
 */
import DTO.PrestamoMaestrosDTO;
import excepcion.FachadaExceptionPDF;
import fachada.PrestamoMaestrosFCDPDF;
import interfaz.IPrestamoMaestrosFCDPDF;

public class PrestamoMaestrosCTLPDF {
    private final IPrestamoMaestrosFCDPDF fachada;

    public PrestamoMaestrosCTLPDF() {
        this.fachada = new PrestamoMaestrosFCDPDF(); // Instanciamos la fachada concreta
    }

    public void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaExceptionPDF {
        fachada.generarPDF(prestamo, filePath);
    }
}