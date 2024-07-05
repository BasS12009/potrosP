/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;


/**
 *
 * @author diana
 */




import EntidadesMapeo.PrestamoMapeo;
import entidades.Prestamo;
import org.bson.types.ObjectId;

public class ConvertidorPrestamo {
    
    private ConvertidorVehiculo convertidorVehiculo = new ConvertidorVehiculo();
    
    public PrestamoMapeo convertirEntidadAMapeo(Prestamo prestamo) {
        if (prestamo == null) {
            return null;
        }
        return new PrestamoMapeo(
            prestamo.getId(),
            prestamo.getMotivo(),
            prestamo.getInicio(),
            prestamo.getFin(),
            prestamo.getPlacaVehiculo(),
            prestamo.getCorreoEmpleado(),
            convertidorVehiculo.convertirEntidadAMapeo(prestamo.getVehiculo())
        );
    }
    
    public Prestamo convertirMapeoAEntidad(PrestamoMapeo prestamoMapeo) {
        if (prestamoMapeo == null) {
            return null;
        }
        
        return new Prestamo(
            prestamoMapeo.getId(),
            prestamoMapeo.getMotivo(),
            prestamoMapeo.getInicio(),
            prestamoMapeo.getFin(),
            prestamoMapeo.getPlacaVehiculo(),
            prestamoMapeo.getCorreoEmpleado(),
            convertidorVehiculo.convertirMapeoAEntidad(prestamoMapeo.getVehiculo())
        );
    }
}