/**
 * Guardar.java
 * 
 * La clase Guardar proporciona métodos para almacenar y recuperar 
 * identificadores únicos para diferentes entidades;
 * 
 * Esta clase se utiliza para almacenar temporalmente identificadores que se 
 * necesitan en varias partes del sistema.
 */
package guardar;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class Guardar {

    private static int idEmpleado;
    private static int idAdministrador;
    private static int idChofer;
    private static int idVehiculo;
    private static int idPrestamo;

    /**
     * Obtiene el identificador del empleado guardado.
     * 
     * @return El identificador del empleado.
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Establece el identificador del empleado.
     * 
     * @param idEmpleado El identificador del empleado a establecer.
     */
    public void setIdEmpleado(int idEmpleado) {
        Guardar.idEmpleado = idEmpleado;
    }

    /**
     * Obtiene el identificador del administrador guardado.
     * 
     * @return El identificador del administrador.
     */
    public int getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * Establece el identificador del administrador.
     * 
     * @param idAdministrador El identificador del administrador a establecer.
     */
    public void setIdAdministrador(int idAdministrador) {
        Guardar.idAdministrador = idAdministrador;
    }

    /**
     * Obtiene el identificador del chofer guardado.
     * 
     * @return El identificador del chofer.
     */
    public int getIdChofer() {
        return idChofer;
    }

    /**
     * Establece el identificador del chofer.
     * 
     * @param idChofer El identificador del chofer a establecer.
     */
    public void setIdChofer(int idChofer) {
        Guardar.idChofer = idChofer;
    }

    /**
     * Obtiene el identificador del vehículo guardado.
     * 
     * @return El identificador del vehículo.
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * Establece el identificador del vehículo.
     * 
     * @param idVehiculo El identificador del vehículo a establecer.
     */
    public void setIdVehiculo(int idVehiculo) {
        Guardar.idVehiculo = idVehiculo;
    }

    /**
     * Obtiene el identificador del préstamo guardado.
     * 
     * @return El identificador del préstamo.
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * Establece el identificador del préstamo.
     * 
     * @param idPrestamo El identificador del préstamo a establecer.
     */
    public void setIdPrestamo(int idPrestamo) {
        Guardar.idPrestamo = idPrestamo;
    }

}