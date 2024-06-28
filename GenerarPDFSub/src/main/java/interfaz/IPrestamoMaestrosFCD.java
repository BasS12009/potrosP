<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author caarl
 */
import dtos.PrestamoMaestrosDTO;
import excepcion.FachadaException;

public interface IPrestamoMaestrosFCD {
    
    void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaException;
    
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author caarl
 */
import dtos.PrestamoMaestrosDTO;
import excepcion.FachadaException;

public interface IPrestamoMaestrosFCD {
    void generarPDF(PrestamoMaestrosDTO prestamo, String filePath) throws FachadaException;
>>>>>>> Stashed changes
}