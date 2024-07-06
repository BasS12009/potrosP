/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 * La clase ReporteDTO representa un reporte que contiene información sobre dos objetos TrasladoDTO:
 * uno original y uno comparado.
 * 
 * @autor skevi
 */
public class ReporteDTO {
    
    // Atributo que representa el traslado original.
    private TrasladoDTO original;
    
    // Atributo que representa el traslado comparado.
    private String motivo;

    /**
     * Constructor por defecto.
     */
    public ReporteDTO() {
    }

    /**
     * Constructor que inicializa los atributos original y comparado con los valores proporcionados.
     * 
     * @param original el objeto TrasladoDTO original.
     * @param motivo el objeto TrasladoDTO comparado.
     */
    public ReporteDTO(TrasladoDTO original, String motivo) {
        this.original = original;
        this.motivo = motivo;
    }

    /**
     * Obtiene el objeto TrasladoDTO original.
     * 
     * @return el objeto TrasladoDTO original.
     */
    public TrasladoDTO getOriginal() {
        return original;
    }

    /**
     * Establece el objeto TrasladoDTO original.
     * 
     * @param original el objeto TrasladoDTO original a establecer.
     */
    public void setOriginal(TrasladoDTO original) {
        this.original = original;
    }

    /**
     * Obtiene el objeto TrasladoDTO comparado.
     * 
     * @return el objeto TrasladoDTO comparado.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el objeto TrasladoDTO comparado.
     * 
     * @param motivo el objeto TrasladoDTO comparado a establecer.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
