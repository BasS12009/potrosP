/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

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

    public ReporteBO() {
        this.reporte = new ReporteDAO();
    }
    
    
    @Override
    public void agregar() throws BisnessException {
        
    }
    
}
