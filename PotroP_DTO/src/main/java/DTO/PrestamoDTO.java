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
    
    private int id;
    private String motivo;
    private LocalDate Inicio;
    private LocalDate Fin;
    private VehiculoDTO vechiculoDTO;

    public PrestamoDTO() {
    }

    public PrestamoDTO(int id, String motivo, LocalDate Inicio, LocalDate Fin, VehiculoDTO vechiculoDTO) {
        this.id = id;
        this.motivo = motivo;
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.vechiculoDTO = vechiculoDTO;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getInicio() {
        return Inicio;
    }

    public void setInicio(LocalDate Inicio) {
        this.Inicio = Inicio;
    }

    public LocalDate getFin() {
        return Fin;
    }

    public void setFin(LocalDate Fin) {
        this.Fin = Fin;
    }

    public VehiculoDTO getVechiculoDTO() {
        return vechiculoDTO;
    }

    public void setVechiculoDTO(VehiculoDTO vechiculoDTO) {
        this.vechiculoDTO = vechiculoDTO;
    }

}