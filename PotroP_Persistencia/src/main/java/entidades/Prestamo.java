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
import org.bson.types.ObjectId;

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
    
    private ObjectId id;  // Identificador único del préstamo
    private String motivo;  // Motivo del préstamo
    private LocalDate inicio;  // Fecha de inicio del préstamo
    private LocalDate fin;  // Fecha de fin del préstamo
    private String placaVehiculo;  // Placa del vehículo utilizado en el préstamo
    private String correoEmpleado;  // Correo electrónico del empleado responsable del préstamo
     private Vehiculo vehiculo;  // Cambiado de String a Vehiculo
    
    
    
    /**
     * Constructor por omisión de la clase Prestamo.
     */
    public Prestamo() {
    }

    /**
     * Constructor de la clase Prestamo que inicializa todos los atributos.
     * 
     * @param id
     * @param motivo el motivo del préstamo.
     * @param inicio la fecha de inicio del préstamo.
     * @param fin la fecha de fin del préstamo.
     * @param placaVehiculo la placa del vehículo prestado.
     * @param correoEmpleado el correo del empleado que realiza el préstamo.
     * @param vehiculo
     */
    public Prestamo(ObjectId id, String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado, Vehiculo vehiculo) {    
        this.id = id;
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
        this.vehiculo = vehiculo;
    }

    public Prestamo(String motivo, LocalDate inicio, LocalDate fin, String placaVehiculo, String correoEmpleado, Vehiculo vehiculo) {
        this.motivo = motivo;
        this.inicio = inicio;
        this.fin = fin;
        this.placaVehiculo = placaVehiculo;
        this.correoEmpleado = correoEmpleado;
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    

    /**
     * Obtiene el identificador único del préstamo.
     * 
     * @return el identificador único del préstamo.
     */
    public ObjectId getId() {  
        return id;
    }

    /**
     * Establece el identificador único del préstamo.
     * 
     * @param id el identificador único del préstamo.
     */
    public void setId(ObjectId id) {    
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

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", motivo=" + motivo + ", inicio=" + inicio 
                + ", fin=" + fin + ", placaVehiculo=" + placaVehiculo + ", correoEmpleado=" + correoEmpleado + '}';
    }
   
}
