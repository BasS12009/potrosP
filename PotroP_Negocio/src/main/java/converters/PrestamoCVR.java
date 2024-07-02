/**
 * PrestamoCVR.java
 * 
 * Esta clase proporciona métodos para convertir entre objetos de tipo 
 * PrestamoDTO y Prestamo, permitiendo la transferencia de datos entre 
 * capas de la aplicación.
 */
package converters;

import dtos.PrestamoDTO;
import entidades.Prestamo;
import java.time.LocalDate;
import org.bson.types.ObjectId;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class PrestamoCVR {
    
    VehiculoCVR vehiculoCVR;

    /**
     * Constructor de la clase PrestamoCVR.
     * 
     * Inicializa un objeto de tipo VehiculoCVR para su uso en las conversiones.
     */
    public PrestamoCVR() {
        this.vehiculoCVR = new VehiculoCVR();
    }
    
    /**
     * Convierte un objeto de tipo PrestamoDTO en un objeto de tipo Prestamo.
     * 
     * @param prestamoDTO El objeto PrestamoDTO a convertir.
     * @return El objeto Prestamo resultante de la conversión.
     */
    public Prestamo convetir_Prestamo(PrestamoDTO prestamoDTO){
        String motivo = prestamoDTO.getMotivo();
        LocalDate Inicio = prestamoDTO.getInicio();
        LocalDate Fin = prestamoDTO.getFin();
        //convertimos utilizando el convertidor de vehiculos a entidad vehiculo
        String placa = prestamoDTO.getPlacaVehiculo();
        String correo = prestamoDTO.getCorreoEmpleado();
        return new Prestamo(motivo, Inicio, Fin, placa, correo);
    }
    
    /**
     * Convierte un objeto de tipo Prestamo en un objeto de tipo PrestamoDTO.
     * 
     * @param prestamo El objeto Prestamo a convertir.
     * @return El objeto PrestamoDTO resultante de la conversión.
     */
    public PrestamoDTO convertir_DTO(Prestamo prestamo){
        String id  = prestamo.getId();
        String motivo = prestamo.getMotivo();
        LocalDate inicio= prestamo.getInicio();
        LocalDate fin = prestamo.getFin();
        String placa = prestamo.getPlacaVehiculo();
        String correo = prestamo.getCorreoEmpleado();
        return new PrestamoDTO(id, motivo, inicio, fin, placa, correo);
    }
}