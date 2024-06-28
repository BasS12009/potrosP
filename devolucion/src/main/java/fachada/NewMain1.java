/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fachada;

/**
 *
 * @author skevi
 */
public class NewMain1 {

    public static void main(String[] args) {
        String correo = System.getenv("EMAIL_USERNAME");
        String contraseña = System.getenv("EMAIL_PASSWORD");

        if (correo == null || contraseña == null) {
            System.out.println("Las variables de entorno no están configuradas correctamente.");
        } else {
            System.out.println("Correo: " + correo);
            // Por razones de seguridad, no imprimas la contraseña en un entorno real.
        }
    }
    
}
