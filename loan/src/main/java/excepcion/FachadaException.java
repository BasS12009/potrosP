/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcion;

/**
 *
 * @author skevi
 */
public class FachadaException extends Exception{

    public FachadaException() {
    }

    public FachadaException(String message) {
        super(message);
    }

    public FachadaException(String message, Throwable cause) {
        super(message, cause);
    }

    public FachadaException(Throwable cause) {
        super(cause);
    }

    public FachadaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
