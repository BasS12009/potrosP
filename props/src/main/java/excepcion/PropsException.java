/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcion;

/**
 *
 * @author skevi
 */
public class PropsException extends Exception{

    public PropsException() {
    }

    public PropsException(String message) {
        super(message);
    }

    public PropsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PropsException(Throwable cause) {
        super(cause);
    }

    public PropsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
