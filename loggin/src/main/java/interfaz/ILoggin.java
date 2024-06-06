/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import exception.FachadaException;

/**
 *
 * @author skevi
 */
public interface ILoggin {
    
    public boolean existe(String correo, String contraseña) throws FachadaException;
            
}
