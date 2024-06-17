/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import insertar.Inserciones;
1
/**
 *
 * @author skevi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inserciones inserciones = new Inserciones();
        
        try{
        inserciones.insertar();
        Menu menu = new Menu();
        menu.setVisible(true);
            System.out.println("inserciones agregadas con exito");
        }
        catch(Exception ex){
            System.out.println("Los datos no fueron agregados correctamente");
        }
    }
    
    
}
