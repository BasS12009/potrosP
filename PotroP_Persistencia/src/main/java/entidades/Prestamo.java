/**
 * Prestamo.java
 * 
 * La clase Prestamo representa un préstamo de un vehículo;
 * 
 * Esta clase almacena información sobre el motivo del préstamo, la fecha de inicio
 * y fin del préstamo, la placa del vehículo prestado y el correo del empleado que
 * solicita el préstamo.
 */
package entidades;


import java.time.LocalDate;

/** 
 * 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 * 
 */
public class Prestamo {
    private int id;
    private String motivo;
    private LocalDate inicio;
    private LocalDate fin;
    private String placaVehiculo;
    private String correoEmpleado;
    
    /**
     * Constructor por omisión de la clase Prestamo.
     */
    public Prestamo() {
    }

    /**
     * Constructor de la clase Prestamo que inicializa todos los atributos.
     * 
     * @param motivo el motivo del préstamo.
     * @param inicio la fecha de inicio del préstamo.
     * @param fin la fecha de fin del préstamo.
     * @param placaVehiculo la placa del vehículo prestado.
     * @param correoEmpleado el correo del empleado que realiza el préstamo.
     */
    public Prestamo(String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Constructor de la clase Prestamo que inicializa todos los atributos, incluyendo el id.
     * 
     * @param id el identificador único del préstamo.
     * @param motivo el motivo del préstamo.
     * @param inicio la fecha de inicio del préstamo.
     * @param fin la fecha de fin del préstamo.
     * @param placaVehiculo la placa del vehículo prestado.
     * @param correoEmpleado el correo del empleado que realiza el préstamo.
     */
    public Prestamo(int id, String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado) {
        this.id = id;
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
    }

    /**
     * Obtiene el identificador único del préstamo.
     * 
     * @return el identificador único del préstamo.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del préstamo.
     * 
     * @param id el identificador único del préstamo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el motivo del préstamo.
     * 
     * @return el motivo del préstamo.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo del préstamo.
     * 
     * @param motivo el motivo del préstamo.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene la fecha de inicio del préstamo.
     * 
     * @return la fecha de inicio del préstamo.
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * Establece la fecha de inicio del préstamo.
     * 
     * @param inicio la fecha de inicio del préstamo.
     */
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    /**
     * Obtiene la fecha de fin del préstamo.
     * 
     * @return la fecha de fin del préstamo.
     */
    public LocalDate getFin() {
        return fin;
    }

    /**
     * Establece la fecha de fin del préstamo.
     * 
     * @param fin la fecha de fin del préstamo.
     */
    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    /**
     * Obtiene la placa del vehículo prestado.
     * 
     * @return la placa del vehículo prestado.
     */
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    /**
     * Establece la placa del vehículo prestado.
     * 
     * @param placaVehiculo la placa del vehículo prestado.
     */
    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    /**
     * Obtiene el correo del empleado que realizó el préstamo.
     * 
     * @return el correo del empleado que realizó el préstamo.
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }
    /**
    * Establece el correo del empleado que realizó el préstamo.
    * 
    * @param correoEmpleado el correo del empleado que realizó el préstamo.
    */
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

}
