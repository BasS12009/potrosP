/**
 * DAOException.java
 *
 * La clase DAOException es una excepción que se lanza para indicar errores
 * específicos relacionados con el acceso a datos (DAO);
 *
 * Es útil para capturar y manejar errores que puedan ocurrir durante
 * operaciones de lectura, escritura o manipulación de datos en estas capas;
 *
 * Al heredar de la clase Exception, DAOException contiene un mensaje
 * descriptivo del error y, opcionalmente, la causa subyacente del error.
 */
package excepciones;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class DAOException extends Exception {

    /**
     * Constructor predeterminado de la clase DAOException.
     */
    public DAOException() {
    }

    /**
     * Constructor que inicializa una instancia de DAOException con un mensaje
     * descriptivo del error.
     *
     * @param message El mensaje descriptivo del error.
     */
    public DAOException(String message) {
        super(message);
    }

    /**
     * Constructor que inicializa una instancia de DAOException con un mensaje
     * descriptivo y una causa subyacente del error.
     *
     * @param message El mensaje descriptivo del error.
     * @param cause La causa subyacente del error.
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor que inicializa una instancia de DAOException con una causa
     * subyacente del error.
     *
     * @param cause La causa subyacente del error.
     */
    public DAOException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor que inicializa una instancia de DAOException con un mensaje
     * descriptivo, una causa subyacente y opciones para habilitar o
     * deshabilitar la supresión y la traza de la pila.
     *
     * @param message El mensaje descriptivo del error.
     * @param cause La causa subyacente del error.
     * @param enableSuppression Indica si la supresión está habilitada o
     * deshabilitada.
     * @param writableStackTrace Indica si la traza de la pila debe ser
     * escribible.
     */
    public DAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
