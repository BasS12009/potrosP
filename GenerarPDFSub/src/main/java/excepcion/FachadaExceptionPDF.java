/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcion;

/**
 *
 * @author caarl
 */
public class FachadaExceptionPDF extends Exception {
    public FachadaExceptionPDF(String message) {
        super(message);
    }

    public FachadaExceptionPDF(String message, Throwable cause) {
        super(message, cause);
    }
}