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
    private static int numDevolucion;
    private static String correoAdmin;

    public int getNumDevolucion() {
        return numDevolucion;
    }

    public void setNumDevolucion(int numDevolucion) {
        Guardar.numDevolucion = numDevolucion;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public  void setCorreoAdmin(String correoAdmin) {
        Guardar.correoAdmin = correoAdmin;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        Guardar.idEmpleado = idEmpleado;
    }
    
}