/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcion;

/**
 *
 * @author caarl
 */
public class FachadaException extends Exception {
    public FachadaException(String message) {
        super(message);
    }

    public FachadaException(String message, Throwable cause) {
        super(message, cause);
    }
}