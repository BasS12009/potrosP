/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negocio;

import dtos.EmpleadoDTO;
import excepciones.NegocioException;

/**
 *
 * @author skevi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NegocioException {
        
        EmpleadoBO bo = new EmpleadoBO();

        EmpleadoDTO empleadoDTO = new EmpleadoDTO("admin1@example.com","contraseña11");
        
        if (bo.existenciaAdmin(empleadoDTO)) {
            System.out.println("validado con exito");
        }
        else{
            System.out.println("por aqui andamos ya cerca del error");
        }
  
        
    }
    
}
