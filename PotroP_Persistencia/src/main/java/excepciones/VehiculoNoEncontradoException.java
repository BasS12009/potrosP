/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author caarl
 */
public class VehiculoNoEncontradoException extends RuntimeException{
     public VehiculoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
