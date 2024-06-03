/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author skevi
 */
public class LogginException extends Exception{

    public LogginException() {
    }

    public LogginException(String message) {
        super(message);
    }

    public LogginException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogginException(Throwable cause) {
        super(cause);
    }

    public LogginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
