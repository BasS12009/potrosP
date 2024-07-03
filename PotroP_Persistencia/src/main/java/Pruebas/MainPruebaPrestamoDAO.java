/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;


/**
 *
 * @author diana
 */
import conexion.ConexionBD;
import daos.PrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPruebaPrestamoDAO {
    
    

    public static void main(String[] args) {
        ConexionBD conexion = ConexionBD.getInstance();
        PrestamoDAO prestamoDAO = new PrestamoDAO(conexion.getDatabase().getCollection("Prestamos", Prestamo.class));

        try {
            // Crear un préstamo de prueba
            Prestamo prestamoPrueba = new Prestamo(
                "Viaje de negocios",
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                "ABC123",
                "empleado@ejemplo.com"
            );

            // Agregar préstamo
            System.out.println("Agregando préstamo...");
            prestamoDAO.agregar(prestamoPrueba);
            System.out.println("Préstamo agregado con ID: " + prestamoPrueba.getId());

           try {
    ObjectId idPrestamo = new ObjectId(prestamoPrueba.getId());
    Prestamo prestamoEncontrado = prestamoDAO.buscarPorId(idPrestamo);
    System.out.println("Préstamo encontrado: " + prestamoEncontrado);
} catch (IllegalArgumentException e) {
    // Ignoramos la excepción y continuamos
    System.err.println("Error al buscar el préstamo por ID: " + e.getMessage());
}           catch (DAOException ex) {
                Logger.getLogger(MainPruebaPrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DAOException ex) {
            Logger.getLogger(MainPruebaPrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}