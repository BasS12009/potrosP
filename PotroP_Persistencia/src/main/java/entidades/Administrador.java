/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author caarl
 */
public class Administrador {
    private String id;
    private String correo;
    private String contraseña;
    
    // Constructores
    public Administrador(String id, String correo, String contraseña) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Administrador() {
    }
    
    
    
    // Getters y Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}