/**
 * PrestamoDTO.java
 * 
 * Clase que representa un préstamo de vehículo.
 */
package dtos;

import java.time.LocalDate;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class PrestamoDTO {
    
    private String id;
    private String motivo;
    private LocalDate inicio;
    private LocalDate fin;
    private String placaVehiculo;
    private String correoEmpleado;

    /**
     * Constructor por omisión de PrestamoDTO.
     */
    public PrestamoDTO() {
    }

    /**
     * Constructor de PrestamoDTO que inicializa todos los atributos excepto el id
     * del préstamo.
     * 
     * @param motivo El motivo del préstamo.
     * @param inicio La fecha de inicio del préstamo.
     * @param fin La fecha de fin del préstamo.
     * @param placaVehiculo La placa del vehículo prestado.
     * @param correoEmpleado El correo del empleado que realiza el préstamo.
     */
    public PrestamoDTO(String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Constructor de PrestamoDTO que inicializa todos los atributos del préstamo.
     * 
     * @param id El identificador único del préstamo.
     * @param motivo El motivo del préstamo.
     * @param Inicio La fecha de inicio del préstamo.
     * @param Fin La fecha de fin del préstamo.
     * @param placaVehiculo La placa del vehículo prestado.
     * @param correoEmpleado El correo del empleado que realiza el préstamo.
     */
    public PrestamoDTO(String id, String motivo, LocalDate Inicio, LocalDate Fin, String placaVehiculo, String correoEmpleado) {
        this.id = id;
        this.motivo = motivo;
        this.inicio = Inicio;
        this.fin = Fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Método getter para el atributo id.
     * 
     * @return El identificador único del préstamo.
     */
    public String getId() {
        return id;
    }

    /**
     * Método setter para el atributo id.
     * 
     * @param id El identificador único del préstamo.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método getter para el atributo motivo.
     * 
     * @return El motivo del préstamo.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Método setter para el atributo motivo.
     * 
     * @param motivo El motivo del préstamo.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Método getter para el atributo Inicio.
     * 
     * @return La fecha de inicio del préstamo.
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * Método setter para el atributo Inicio.
     * 
     * @param Inicio La fecha de inicio del préstamo.
     */
    public void setInicio(LocalDate Inicio) {
        this.inicio = Inicio;
    }

    /**
     * Método getter para el atributo Fin.
     * 
     * @return La fecha de fin del préstamo.
     */
    public LocalDate getFin() {
        return fin;
    }

    /**
     * Método setter para el atributo Fin.
     * 
     * @param Fin La fecha de fin del préstamo.
     */
    public void setFin(LocalDate Fin) {
        this.fin = Fin;
    }

    /**
     * Método getter para el atributo placaVehiculo.
     * 
     * @return La placa del vehículo prestado.
     */
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    /**
     * Método setter para el atributo placaVehiculo.
     * 
     * @param placaVehiculo La placa del vehículo prestado.
     */
    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    /**
     * Método getter para el atributo correoEmpleado.
     * 
     * @return El correo del empleado que realiza el préstamo.
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Método setter para el atributo correoEmpleado.
     * 
     * @param correoEmpleado El correo del empleado que realiza el préstamo.
     */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
}