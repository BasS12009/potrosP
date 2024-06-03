/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author diana
 */
public class VehiculoDTO {
    private int idDTO;
    private String marcaDTO;
    private String modeloDTO;
    private int añoDTO;
    private String placaDTO;
    

    public VehiculoDTO() {
    }

    public VehiculoDTO(String marcaDTO, String modeloDTO, int añoDTO, String placaDTO, String tipoDTO) {
        this.marcaDTO = marcaDTO;
        this.modeloDTO = modeloDTO;
        this.añoDTO = añoDTO;
        this.placaDTO = placaDTO;
    }

    public VehiculoDTO(int idDTO, String marcaDTO, String modeloDTO, int añoDTO, String placaDTO) {
        this.idDTO = idDTO;
        this.marcaDTO = marcaDTO;
        this.modeloDTO = modeloDTO;
        this.añoDTO = añoDTO;
        this.placaDTO = placaDTO;
    }

    public int getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(int idDTO) {
        this.idDTO = idDTO;
    }

    public String getMarcaDTO() {
        return marcaDTO;
    }

    public void setMarcaDTO(String marcaDTO) {
        this.marcaDTO = marcaDTO;
    }

    public String getModeloDTO() {
        return modeloDTO;
    }

    public void setModeloDTO(String modeloDTO) {
        this.modeloDTO = modeloDTO;
    }

    public int getAñoDTO() {
        return añoDTO;
    }

    public void setAñoDTO(int añoDTO) {
        this.añoDTO = añoDTO;
    }

    public String getPlacaDTO() {
        return placaDTO;
    }

    public void setPlacaDTO(String placaDTO) {
        this.placaDTO = placaDTO;
    }

}
