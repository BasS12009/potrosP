/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author skevi
 */
public class EmpleadoDTO {
    
    private int id;
    private String correo;
    private String contraseña;
    private String tipo;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int id, String correo, String contraseña) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public EmpleadoDTO(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public EmpleadoDTO(String correo, String contraseña, String tipo) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public EmpleadoDTO(int id, String correo, String contraseña, String tipo) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
