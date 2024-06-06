/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fachada;

import DTO.AdministradorDTO;
import exception.ControlException;
import control.LogginCTL;
import exception.FachadaException;
import interfaz.ILoggin;


/**
 *
 * @author skevi
 */
public class Loggin implements ILoggin{

    private LogginCTL login;

    public Loggin() {
        this.login = new LogginCTL();
    }

    @Override
    public boolean existe(String correo, String contraseña) throws FachadaException {
        if (correo.isEmpty()) {
            throw new FachadaException("Porfavor llene el campo de correo");
        }
        else if (contraseña.isEmpty()) {
            throw new FachadaException("Porfavor llene el campo de correo");
        }
          
        try{ 
           return login.existe(new AdministradorDTO(correo, contraseña));
        }
        catch(ControlException e){
            throw new FachadaException("Error en correo o contraseña");
        }
    }
    
    
}
