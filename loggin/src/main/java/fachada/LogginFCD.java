/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fachada;

import control.LogginCTL;
import dtos.EmpleadoDTO;
import exception.ControlException;
import exception.FachadaException;
import interfaz.ILogginFCD;

/**
 *
 * @author skevi
 */
public class LogginFCD implements ILogginFCD{

    private LogginCTL login;

    public LogginFCD() {
        this.login = new LogginCTL();
    }

    /**
     * 
     * @param correo
     * @param contraseña
     * @return
     * @throws FachadaException 
     */
    @Override
    public boolean existe(String correo, String contraseña) throws FachadaException {      
        try{ 
           return login.existe(new EmpleadoDTO(correo, contraseña));
        }
        catch(ControlException e){
            throw new FachadaException("Error en correo o contraseña");
        }
    }

    @Override
    public boolean validar(String correo, String contraseña) throws FachadaException {
        if (correo.isEmpty()) {
            throw new FachadaException("Porfavor llene el campo de correo");
        }
        else if (contraseña.isEmpty()) {
            throw new FachadaException("Porfavor llene el campo de correo");
        }
        else{
            return true;
        }
    }
    
    
}
