/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author diana
 */
public class PrestamoDTO {
    
    private String idDTO;
    private String motivoDTO;
    private Date fechaInicioDTO;
    private Date fechaFinDTO;
    private VehiculoDTO vechiculoDTO;
    private VehiculoDTO vehiculoDTO;

    public PrestamoDTO() {
    }

    public PrestamoDTO(String motivoDTO, Date fechaInicioDTO, Date fechaFinDTO, VehiculoDTO vechiculoDTO, VehiculoDTO vehiculoDTO) {
        this.motivoDTO = motivoDTO;
        this.fechaInicioDTO = fechaInicioDTO;
        this.fechaFinDTO = fechaFinDTO;
        this.vechiculoDTO = vechiculoDTO;
        this.vehiculoDTO = vehiculoDTO;
    }

    public PrestamoDTO(String idDTO, String motivoDTO, Date fechaInicioDTO, Date fechaFinDTO, VehiculoDTO vechiculoDTO, VehiculoDTO vehiculoDTO) {
        this.idDTO = idDTO;
        this.motivoDTO = motivoDTO;
        this.fechaInicioDTO = fechaInicioDTO;
        this.fechaFinDTO = fechaFinDTO;
        this.vechiculoDTO = vechiculoDTO;
        this.vehiculoDTO = vehiculoDTO;
    }

    public String getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(String idDTO) {
        this.idDTO = idDTO;
    }

    public String getMotivoDTO() {
        return motivoDTO;
    }

    public void setMotivoDTO(String motivoDTO) {
        this.motivoDTO = motivoDTO;
    }

    public Date getFechaInicioDTO() {
        return fechaInicioDTO;
    }

    public void setFechaInicioDTO(Date fechaInicioDTO) {
        this.fechaInicioDTO = fechaInicioDTO;
    }

    public Date getFechaFinDTO() {
        return fechaFinDTO;
    }

    public void setFechaFinDTO(Date fechaFinDTO) {
        this.fechaFinDTO = fechaFinDTO;
    }

    public VehiculoDTO getVechiculoDTO() {
        return vechiculoDTO;
    }

    public void setVechiculoDTO(VehiculoDTO vechiculoDTO) {
        this.vechiculoDTO = vechiculoDTO;
    }

    public VehiculoDTO getVehiculoDTO() {
        return vehiculoDTO;
    }

    public void setVehiculoDTO(VehiculoDTO vehiculoDTO) {
        this.vehiculoDTO = vehiculoDTO;
    }

    
}
