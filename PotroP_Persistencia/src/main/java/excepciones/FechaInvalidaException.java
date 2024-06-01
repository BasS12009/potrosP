/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author caarl
 */
public class FechaInvalidaException extends RuntimeException {
    public FechaInvalidaException(String mensaje) {
        super(mensaje);
    }
}