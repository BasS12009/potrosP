/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author caarl
 */
import DTO.PrestamoMaestrosDTO;
import excepcion.FachadaExceptionPDF;

public interface IPrestamoMaestrosFCDPDF {
    void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaExceptionPDF;
}