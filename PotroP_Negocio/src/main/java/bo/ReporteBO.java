/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dtos.ReporteDTO;
import converters.ReporteCVR;
import daos.ReporteDAO;
import exceptions.BisnessException;
import interfaces.IReporteBO;
import interfaces.IReporteDAO;

/**
 *
 * @author skevi
 */
public class ReporteBO implements IReporteBO{

    IReporteDAO reporte;
    ReporteCVR reporteCVR;

    public ReporteBO() {
        this.reporte = new ReporteDAO();
        this.reporteCVR = new ReporteCVR();
    }

    @Override
    public void agregar(ReporteDTO reporteDTO) throws BisnessException {
        
    }

    
}
