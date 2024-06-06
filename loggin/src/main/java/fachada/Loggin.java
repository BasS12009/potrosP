/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fachada;

import control.LogginCTL;

/**
 *
 * @author skevi
 */
public class Loggin {

    private LogginCTL login;

    public Loggin() {
        this.login = new LogginCTL();
    }

    /**
     * 
     * @param correo
     * @param contraseña
     * @return
     * @throws FachadaException 
     
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
    */
    
}
