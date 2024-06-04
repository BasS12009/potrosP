    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author diana
 */
public class AdministradorDTO {
    
    private int id;
    private String correo;
    private String contraseña;

    public AdministradorDTO() {
    }

    public AdministradorDTO(int id, String correo, String contraseña) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int idDTO) {
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
    