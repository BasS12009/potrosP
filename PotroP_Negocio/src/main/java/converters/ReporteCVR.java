/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import dtos.ReporteDTO;
import dtos.TrasladoDTO;
import entidades.Reporte;
import entidades.Traslado;

/**
 * Clase que proporciona métodos para convertir entre objetos de tipo ReporteDTO y Reporte.
 * Utilizada para la conversión de datos entre capas del sistema.
 * 
 * @author skevi
 */
public class ReporteCVR {
    
    TrasladoCVR traslado;

    /**
     * Constructor que inicializa la instancia de TrasladoCVR.
     */
    public ReporteCVR() {
        this.traslado = new TrasladoCVR();
    }
    
    /**
     * Convierte un objeto ReporteDTO a un objeto Reporte.
     * 
     * @param reporteDTO El objeto ReporteDTO que se desea convertir.
     * @return Un objeto Reporte convertido a partir del ReporteDTO proporcionado.
     */
    public Reporte convertir_Reporte(ReporteDTO reporteDTO){
        Traslado original = traslado.convetir_Traslado(reporteDTO.getOriginal());
        String motivo = reporteDTO.getMotivo();
        return new Reporte(original, motivo);
    }
    
    /**
     * Convierte un objeto Reporte a un objeto ReporteDTO.
     * 
     * @param reporte El objeto Reporte que se desea convertir.
     * @return Un objeto ReporteDTO convertido a partir del Reporte proporcionado.
     */
    public ReporteDTO convertir_DTO(Reporte reporte){
        TrasladoDTO original = traslado.convertir_TrasladoDTO(reporte.getOriginal());
        String motivo = reporte.getMotivo();
        return new ReporteDTO(original, motivo);
    }
    
}
