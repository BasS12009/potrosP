/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.bson.types.ObjectId;

/**
 * La clase Reporte representa un reporte que contiene información sobre dos objetos Traslado:
 * uno original y uno comparado.
 * 
 * 
 */
public class Reporte {
    
    private ObjectId id;
    
    // Atributo que representa el traslado original.
    private Traslado original;
    
    
    private String motivo;

    /**
     * Constructor por defecto.
     */
    public Reporte() {
    }

    /**
     * Constructor que inicializa los atributos original y comparado con los valores proporcionados.
     * 
     * @param original el objeto Traslado original.
     */
    public Reporte(Traslado original, String motivo) {
        this.original = original;
        this.motivo = motivo;
    }

    public Reporte(ObjectId id, Traslado original, String motivo) {
        this.id = id;
        this.original = original;
        this.motivo = motivo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el objeto Traslado comparado.
     * 
     * @param motivo el objeto Traslado comparado a establecer.
     */
    public void setMotivo(String motivo) {
        this.motivo= motivo;
    }
}
