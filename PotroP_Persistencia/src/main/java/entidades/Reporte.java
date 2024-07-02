/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
/**
 * La clase Reporte representa un reporte que contiene información sobre dos objetos Traslado:
 * uno original y uno comparado.
 * 
 * 
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
     * @param original el objeto Traslado original.
     * @param comparado el objeto Traslado comparado.
     */
    public Reporte(Traslado original, Traslado comparado) {
        this.original = original;
        this.comparado = comparado;
    }

    /**
     * Obtiene el objeto Traslado original.
     * 
     * @return el objeto Traslado original.
     */
    public Traslado getOriginal() {
        return original;
    }

    /**
     * Establece el objeto Traslado original.
     * 
     * @param original el objeto Traslado original a establecer.
     */
    public void setOriginal(Traslado original) {
        this.original = original;
    }

    /**
     * Obtiene el objeto Traslado comparado.
     * 
     * @return el objeto TrasladoDTO comparado.
     */
    public Traslado getComparado() {
        return comparado;
    }

    /**
     * Establece el objeto Traslado comparado.
     * 
     * @param comparado el objeto Traslado comparado a establecer.
     */
    public void setComparado(Traslado comparado) {
        this.comparado = comparado;
    }
}
