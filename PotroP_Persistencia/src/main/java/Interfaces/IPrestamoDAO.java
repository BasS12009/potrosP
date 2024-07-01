/**
 * IPrestamoDAO.java
 * 
 * Interfaz que define las operaciones de acceso a datos relacionadas con los préstamos;
 * 
 * Esta interfaz define métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * relacionadas con los préstamos en el sistema;
 * 
 * Implementaciones de esta interfaz proporcionan la lógica necesaria para interactuar con la capa de
 * persistencia de préstamos en la base de datos.
 */
package Interfaces;

import entidades.Prestamo;
import excepciones.DAOException;
import org.bson.types.ObjectId;

/** 
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IPrestamoDAO {
   public Prestamo buscarPorId(ObjectId id) throws DAOException;
   
   public void agregar(Prestamo prestamo) throws DAOException;
}
