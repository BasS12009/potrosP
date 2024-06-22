/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author skevi
 */
public class Reporte {
    
    private int id;
    private Traslado original;
    private Traslado comparado;

    public Reporte() {
    }

    public Reporte(Traslado original, Traslado comparado) {
        this.original = original;
        this.comparado = comparado;
    }

    public Reporte(int id, Traslado original, Traslado comparado) {
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

    public Traslado getOriginal() {
        return original;
    }

    public void setOriginal(Traslado original) {
        this.original = original;
    }

    public Traslado getComparado() {
        return comparado;
    }

    public void setComparado(Traslado comparado) {
        this.comparado = comparado;
    }
    
}
