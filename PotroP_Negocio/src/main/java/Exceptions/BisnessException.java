/**
 * BisnessException.java
 * 
 * Excepción personalizada para errores relacionados con la lógica de negocio;
 * 
 * Esta excepción se utiliza para representar errores específicos relacionados con la lógica de negocio
 * dentro de la aplicación; Puede ser lanzada cuando se producen errores durante la ejecución de operaciones
 * de lógica de negocio, como agregar, eliminar o actualizar entidades en la base de datos;
 * 
 * Los objetos de esta clase pueden contener un mensaje descriptivo del error y una causa raíz opcional,
 * así como información sobre si la supresión de la pila de seguimiento está habilitada y si la pila de
 * seguimiento es modificable;
 * 
 * Esta excepción puede ser utilizada en conjunto con otras clases y métodos relacionados con la lógica de negocio
 * para manejar y propagar errores de manera consistente en toda la aplicación.
 */
package Exceptions;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class BisnessException extends Exception{
    
    /**
     * Construye una nueva excepción de lógica de negocio sin mensaje de detalle.
     */
    public BisnessException() {
    }

    /**
     * Construye una nueva excepción de lógica de negocio con el detalle del mensaje especificado.
     * 
     * @param message el mensaje que detalla la excepción.
     */
    public BisnessException(String message) {
        super(message);
    }

    /**
     * Construye una nueva excepción de lógica de negocio con el mensaje de detalle y la causa raíz especificados.
     * 
     * @param message el mensaje que detalla la excepción.
     * @param cause la causa raíz de la excepción.
     */
    public BisnessException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Construye una nueva excepción de lógica de negocio con la causa raíz especificada y un mensaje de detalle
     * predeterminado.
     * 
     * @param cause la causa raíz de la excepción.
     */
    public BisnessException(Throwable cause) {
        super(cause);
    }

    /**
     * Construye una nueva excepción de lógica de negocio con el mensaje de detalle, la causa raíz, la supresión de la
     * pila de seguimiento habilitada o deshabilitada y la capacidad de la pila de seguimiento modificable especificados.
     * 
     * @param message el mensaje que detalla la excepción.
     * @param cause la causa raíz de la excepción.
     * @param enableSuppression indica si la supresión de la pila de seguimiento está habilitada o deshabilitada.
     * @param writableStackTrace indica si la pila de seguimiento es modificable o no.
     */
    public BisnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
   
}