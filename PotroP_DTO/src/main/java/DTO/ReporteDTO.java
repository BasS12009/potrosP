/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author skevi
 */
public class ReporteDTO {
    
    private int id;
    private TrasladoDTO original;
    private TrasladoDTO comparado;

    public ReporteDTO() {
    }

    public ReporteDTO(TrasladoDTO original, TrasladoDTO comparado) {
        this.original = original;
        this.comparado = comparado;
    }

    public ReporteDTO(int id, TrasladoDTO original, TrasladoDTO comparado) {
        this.id = id;
        this.original = original;
        this.comparado = comparado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TrasladoDTO getOriginal() {
        return original;
    }

    public void setOriginal(TrasladoDTO original) {
        this.original = original;
    }

    public TrasladoDTO getComparado() {
        return comparado;
    }

    public void setComparado(TrasladoDTO comparado) {
        this.comparado = comparado;
    }
    
}
