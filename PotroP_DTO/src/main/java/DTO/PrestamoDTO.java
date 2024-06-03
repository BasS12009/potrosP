/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author diana
 */
public class PrestamoDTO {
    
    private int idDTO;
    private String motivoDTO;
    private LocalDate InicioDTO;
    private LocalDate FinDTO;
    private VehiculoDTO vechiculoDTO;

    public PrestamoDTO() {
    }

    public PrestamoDTO(String motivoDTO, LocalDate InicioDTO, LocalDate FinDTO, VehiculoDTO vechiculoDTO) {
        this.motivoDTO = motivoDTO;
        this.InicioDTO = InicioDTO;
        this.FinDTO = FinDTO;
        this.vechiculoDTO = vechiculoDTO;
    }

    public PrestamoDTO(int idDTO, String motivoDTO, LocalDate InicioDTO, LocalDate FinDTO, VehiculoDTO vechiculoDTO) {
        this.idDTO = idDTO;
        this.motivoDTO = motivoDTO;
        this.InicioDTO = InicioDTO;
        this.FinDTO = FinDTO;
        this.vechiculoDTO = vechiculoDTO;
    }

    public int getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(int idDTO) {
        this.idDTO = idDTO;
    }

    public String getMotivoDTO() {
        return motivoDTO;
    }

    public void setMotivoDTO(String motivoDTO) {
        this.motivoDTO = motivoDTO;
    }

    public LocalDate getInicioDTO() {
        return InicioDTO;
    }

    public void setInicioDTO(LocalDate InicioDTO) {
        this.InicioDTO = InicioDTO;
    }

    public LocalDate getFinDTO() {
        return FinDTO;
    }

    public void setFinDTO(LocalDate FinDTO) {
        this.FinDTO = FinDTO;
    }

    public VehiculoDTO getVechiculoDTO() {
        return vechiculoDTO;
    }

    public void setVechiculoDTO(VehiculoDTO vechiculoDTO) {
        this.vechiculoDTO = vechiculoDTO;
    }

    
}