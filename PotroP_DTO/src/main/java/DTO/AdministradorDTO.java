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
    
    private int idDTO;
    private String correoDTO;
    private String contraseñaDTO;

    public AdministradorDTO() {
    }

    public AdministradorDTO(String correoDTO, String contraseñaDTO) {
        this.correoDTO = correoDTO;
        this.contraseñaDTO = contraseñaDTO;
    }

    public AdministradorDTO(int idDTO, String correoDTO, String contraseñaDTO) {
        this.idDTO = idDTO;
        this.correoDTO = correoDTO;
        this.contraseñaDTO = contraseñaDTO;
    }

    public int getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(int idDTO) {
        this.idDTO = idDTO;
    }

    public String getCorreoDTO() {
        return correoDTO;
    }

    public void setCorreoDTO(String correoDTO) {
        this.correoDTO = correoDTO;
    }

    public String getContraseñaDTO() {
        return contraseñaDTO;
    }

    public void setContraseñaDTO(String contraseñaDTO) {
        this.contraseñaDTO = contraseñaDTO;
    }

    
}
