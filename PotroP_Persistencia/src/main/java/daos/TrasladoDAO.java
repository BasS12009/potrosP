/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Interfaces.IConexion;
import Interfaces.ITrasladoDAO;
import conexion.Conexion;
import entidades.Traslado;
import excepciones.DAOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Clase que implementa la interfaz ITrasladoDAO y maneja la persistencia de datos de traslados.
 * 
 * @autor skevi
 */
public class TrasladoDAO implements ITrasladoDAO {

    // Atributo para manejar la conexión a la base de datos
    IConexion conexion;

    /**
     * Constructor por defecto que inicializa la conexión.
     */
    public TrasladoDAO() {
        this.conexion = new Conexion();
    }
    
    /**
     * Método para agregar un nuevo traslado a la base de datos.
     * Actualmente, este método está vacío y necesita ser implementado.
     * 
     * @param traslado El objeto Traslado que se desea agregar.
     * @throws DAOException si ocurre un error al agregar el traslado.
     */
    @Override
    public void agregar(Traslado traslado) throws DAOException {
        System.out.println("El traslado se agrego con exito");
    }

    /**
     * Método para actualizar un traslado existente en la base de datos.
     * 
     * @param traslado El objeto Traslado con los nuevos datos.
     * @throws DAOException si ocurre un error al actualizar el traslado.
     */
    @Override
    public void actualizar(Traslado traslado) throws DAOException {
        System.out.println("Se actualizó con éxito");
    }

    /**
     * Método para buscar un traslado en la base de datos por su número de traslado.
     * 
     * @param numTraslado El número del traslado que se desea buscar.
     * @return El objeto Traslado si se encuentra, null en caso contrario.
     * @throws DAOException si ocurre un error al buscar el traslado.
     */
    @Override
    public Traslado buscar(int numTraslado) throws DAOException {
        
            // Variable que representa el día de hoy a las 11:30
            LocalDateTime inicio = LocalDateTime.now().with(LocalTime.of(11, 30));
            
            // Variable que representa dos días después a la misma hora (11:30)
            LocalDateTime fin = inicio.plus(2, ChronoUnit.DAYS);
            
            return new Traslado(1, 213, "Campus centro", 2, inicio, fin, "traslado",
            "EXCELENTE", "AIRE BAJO", 25, "WYZ-212-AS", "example@gmail.com", "chofer@gmail.com", false);
        
        
    }

    /**
     * Método para verificar si existe un traslado en la base de datos por su número de traslado.
     * 
     * @param numTraslado El número del traslado que se desea verificar.
     * @return true si el traslado existe, false en caso contrario.
     * @throws DAOException si ocurre un error al verificar la existencia del traslado.
     */
    @Override
    public boolean existe(int numTraslado) throws DAOException {
        return true;
    }
}
