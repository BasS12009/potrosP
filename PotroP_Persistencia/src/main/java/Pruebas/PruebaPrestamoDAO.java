/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;


/**
 *
 * @author diana
 */

import conexion.ConexionBDM;
import daos.PrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;

import java.time.LocalDate;

public class PruebaPrestamoDAO {   
    public static void main(String[] args) {


        // Inicializar la conexión a la base de datos
        ConexionBDM.getInstance();
        
        PrestamoDAO prestamoDAO = new PrestamoDAO();

        try {
            // Crear un nuevo préstamo
            Prestamo nuevoPrestamo = new Prestamo(
                "Viaje de negocios",
                LocalDate.now(),
                LocalDate.now().plusDays(3),
                "ABC-123",
                "empleado@ejemplo.com"
            );

            // Agregar el préstamo a la base de datos
            prestamoDAO.agregar(nuevoPrestamo);
            System.out.println("Préstamo agregado con éxito a la base de datos MongoDB.");
            System.out.println("Detalles del préstamo: " + nuevoPrestamo);

        } catch (DAOException e) {
            System.err.println("Error al agregar el préstamo: " + e.getMessage());
        }
    }
    
}
