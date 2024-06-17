/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcion;

/**
 *
 * @author skevi
 */
public class ControlExceptionException extends Exception{

    public ControlExceptionException() {
    }

    public ControlExceptionException(String message) {
        super(message);
    }

    public ControlExceptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ControlExceptionException(Throwable cause) {
        super(cause);
    }

    public ControlExceptionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
