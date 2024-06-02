/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 * Esta clase se encarga de procesar las excepciones de la capa de negocio
 * 
 * @author skevi
 */
public class BisnessException extends Exception{
    
    public BisnessException() {
    }

    public BisnessException(String message) {
        super(message);
    }

    public BisnessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BisnessException(Throwable cause) {
        super(cause);
    }

    public BisnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
   
}
