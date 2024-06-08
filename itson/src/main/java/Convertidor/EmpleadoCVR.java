/**
 * EmpleadoCVR.java
 * 
 * Esta clase es un convertidor de DTO a entidad y viceversa para la clase Empleado.
 * Proporciona métodos para convertir instancias de EmpleadoDTO a Empleado
 * y viceversa.
 */
package Convertidor;

import dtos.EmpleadoDTO;
import entidades.Empleado;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class EmpleadoCVR {

    /**
     * Convierte un objeto de tipo EmpleadoDTO a un objeto de tipo Empleado.
     * 
     * @param EmpleadoDTO El objeto de tipo EmpleadoDTO que se desea convertir.
     * @return Una instancia de Empleado con los datos del EmpleadoDTO proporcionado.
     */
    public Empleado convertir_Entidad(EmpleadoDTO EmpleadoDTO) {
        String correo = EmpleadoDTO.getCorreo();
        String contraseña = EmpleadoDTO.getCorreo();
        return new Empleado(correo, contraseña);
    }

    /**
     * Convierte un objeto de tipo Empleado a un objeto de tipo EmpleadoDTO.
     * 
     * @param empleado El objeto de tipo Empleado que se desea convertir.
     * @return Una instancia de EmpleadoDTO con los datos del Empleado proporcionado.
     */
    public EmpleadoDTO convertir_DTO(Empleado empleado) {
        int id = empleado.getId();
        String correo = empleado.getCorreo();
        String contraseña = empleado.getContraseña();
        return new EmpleadoDTO(id, correo, contraseña);
    }
}
