/**
 * PropsException.java
 * 
 * La clase PropsException representa una excepción relacionada 
 * con la configuración de propiedades;
 * 
 * Esta excepción puede ser lanzada en situaciones donde ocurren errores 
 * relacionados con la obtención o manipulación de propiedades de configuración.
 */
package excepcion;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class PropsException extends Exception{

    /**
     * Crea una nueva instancia de PropsException sin detallar el motivo.
     */
    public PropsException() {
    }

    /**
     * Crea una nueva instancia de PropsException con un mensaje de error detallado.
     * 
     * @param message El mensaje que describe el error.
     */
    public PropsException(String message) {
        super(message);
    }

    /**
     * Crea una nueva instancia de PropsException con un mensaje de error detallado y la causa subyacente.
     * 
     * @param message El mensaje que describe el error.
     * @param cause La causa subyacente del error.
     */
    public PropsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Crea una nueva instancia de PropsException con la causa subyacente del error.
     * 
     * @param cause La causa subyacente del error.
     */
    public PropsException(Throwable cause) {
        super(cause);
    }

    /**
     * Crea una nueva instancia de PropsException con un mensaje de error detallado, la causa subyacente
     * del error, la capacidad de habilitar o deshabilitar la supresión del error y la capacidad de
     * habilitar o deshabilitar la capacidad de escribir la traza de la pila.
     * 
     * @param message El mensaje que describe el error.
     * @param cause La causa subyacente del error.
     * @param enableSuppression Indica si se debe habilitar la supresión del error.
     * @param writableStackTrace Indica si se debe habilitar la capacidad de escribir la traza de la pila.
     */
    public PropsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}