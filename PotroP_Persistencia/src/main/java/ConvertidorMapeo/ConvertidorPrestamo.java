/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorMapeo;

import EntidadesMapeo.PrestamoMapeo;
import entidades.Prestamo;

/**
 *
 * @author diana
 */
/**
 * Clase encargada de convertir entre Entidad Prestamo y PrestamoMapeo.
 */
public class ConvertidorPrestamo {
    
    // Instancia de ConvertidorVehiculo para realizar conversiones de Vehiculo y VehiculoMapeo. 
    private ConvertidorVehiculo convertidorVehiculo = new ConvertidorVehiculo();
    
    
    /**
     * Convierte un objeto Prestamo a un objeto PrestamoMapeo.
     * 
     * @param prestamo el objeto Prestamo a convertir.
     * @return el objeto PrestamoMapeo resultante de la conversión, o null si el objeto Prestamo es null.
     */
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
    
    
     /**
     * Convierte un objeto PrestamoMapeo a un objeto Prestamo.
     * 
     * @param prestamoMapeo el objeto PrestamoMapeo a convertir.
     * @return el objeto Prestamo resultante de la conversión, o null si el objeto PrestamoMapeo es null.
     */
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