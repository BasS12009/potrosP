/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dtos.ReporteDTO;
import converters.ReporteCVR;
import daos.ReporteDAO;
import excepciones.DAOException;
import exceptions.BisnessException;
import interfaces.IReporteBO;
import interfaces.IReporteDAO;

/**
 * Clase que implementa la interfaz IReporteBO y gestiona la lógica de negocio relacionada con reportes.
 * Utiliza objetos de tipo IReporteDAO y ReporteCVR para acceder a los datos y realizar conversiones.
 * 
 * @author skevi
 */
public class ReporteBO implements IReporteBO {

    // Atributos para acceder a los datos y realizar conversiones
    IReporteDAO reporte;
    ReporteCVR reporteCVR;

    /**
     * Constructor por defecto que inicializa los atributos.
     */
    public ReporteBO() {
        this.reporte = new ReporteDAO(); // Inicializa un objeto ReporteDAO para acceder a los datos de los reportes
        this.reporteCVR = new ReporteCVR(); // Inicializa un objeto ReporteCVR para realizar conversiones
    }

    /**
     * Método para agregar un nuevo reporte.
     * 
     * @param reporteDTO El objeto ReporteDTO que se desea agregar.
     * @throws BisnessException si ocurre un error en la lógica de negocio.
     */
    @Override
    public void agregar(ReporteDTO reporteDTO) throws BisnessException {
        try{
            reporte.agregar();
        }
        catch(DAOException ex){
            throw new BisnessException(ex.getMessage());
        }
    }

}
