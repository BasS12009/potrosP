/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converters;

import DTO.ReporteDTO;
import DTO.TrasladoDTO;
import entidades.Reporte;
import entidades.Traslado;

/**
 *
 * @author skevi
 */
public class ReporteCVR {
    
    TrasladoCVR traslado;

    public ReporteCVR() {
        this.traslado = new TrasladoCVR();
    }
    
    
    public Reporte convertir_Reporte(ReporteDTO reporteDTO){
        Traslado original = traslado.convertir_Entidad(reporteDTO.getOriginal());
        Traslado comparado = traslado.convertir_Entidad(reporteDTO.getComparado());
        return new Reporte(original, comparado);
    }
    
    public ReporteDTO convertir_DTO(Reporte reporte){
        TrasladoDTO original = traslado.convertir_DTO(reporte.getOriginal());
        TrasladoDTO comparado = traslado.convertir_DTO(reporte.getComparado());
        return new ReporteDTO(original, comparado);
    }
    
}
