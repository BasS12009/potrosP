/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author skevi
 */
public class ReporteDTO {
    
    private TrasladoDTO original;
    private TrasladoDTO comparado;

    public ReporteDTO() {
    }

    public ReporteDTO(TrasladoDTO original, TrasladoDTO comparado) {
        this.original = original;
        this.comparado = comparado;
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
