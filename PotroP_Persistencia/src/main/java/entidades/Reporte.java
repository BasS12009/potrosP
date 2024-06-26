/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
/**
 * La clase ReporteDTO representa un reporte que contiene información sobre dos objetos TrasladoDTO:
 * uno original y uno comparado.
 * 
 * @autor skevi
 */
public class Reporte {
    
    // Atributo que representa el traslado original.
    private Traslado original;
    
    // Atributo que representa el traslado comparado.
    private Traslado comparado;

    /**
     * Constructor por defecto.
     */
    public Reporte() {
    }

    /**
     * Constructor que inicializa los atributos original y comparado con los valores proporcionados.
     * 
     * @param original el objeto TrasladoDTO original.
     * @param comparado el objeto TrasladoDTO comparado.
     */
    public Reporte(Traslado original, Traslado comparado) {
        this.original = original;
        this.comparado = comparado;
    }

    /**
     * Obtiene el objeto TrasladoDTO original.
     * 
     * @return el objeto TrasladoDTO original.
     */
    public Traslado getOriginal() {
        return original;
    }

    /**
     * Establece el objeto TrasladoDTO original.
     * 
     * @param original el objeto TrasladoDTO original a establecer.
     */
    public void setOriginal(Traslado original) {
        this.original = original;
    }

    /**
     * Obtiene el objeto TrasladoDTO comparado.
     * 
     * @return el objeto TrasladoDTO comparado.
     */
    public Traslado getComparado() {
        return comparado;
    }

    /**
     * Establece el objeto TrasladoDTO comparado.
     * 
     * @param comparado el objeto TrasladoDTO comparado a establecer.
     */
    public void setComparado(Traslado comparado) {
        this.comparado = comparado;
    }
}
