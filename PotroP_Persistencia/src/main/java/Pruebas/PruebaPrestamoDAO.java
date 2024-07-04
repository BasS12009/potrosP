/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import conexion.ConexionBDM;
import daos.PrestamoDAO;
import daos.VehiculoDAO;
import entidades.Prestamo;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.time.LocalDate;
import org.bson.types.ObjectId;

public class PruebaPrestamoDAO {
    public static void main(String[] args) {
        // Inicializar la conexión a la base de datos
        ConexionBDM.getInstance();
        
        PrestamoDAO prestamoDAO = new PrestamoDAO();
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        
        try {
            // Primero, crear un vehículo para asociar al préstamo
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPlaca("ABC-123");
            // Aquí puedes agregar más detalles del vehículo si es necesario
            
            // Agregar el vehículo a la base de datos (asumiendo que tienes un método para esto)
            vehiculoDAO.agregar(vehiculo);
            
            // Crear un nuevo préstamo
            Prestamo nuevoPrestamo = new Prestamo(
                null, // El ID será asignado por MongoDB
                "Viaje de negocios",
                LocalDate.now(),
                LocalDate.now().plusDays(3),
                "ABC-123", // Placa del vehículo
                "empleado@ejemplo.com",
                vehiculo
            );
            
            // Agregar el préstamo a la base de datos
            prestamoDAO.agregar(nuevoPrestamo);
            System.out.println("Préstamo agregado con éxito a la base de datos MongoDB.");
            System.out.println("Detalles del préstamo: " + nuevoPrestamo);
            
            // Buscar el préstamo recién agregado
            Prestamo prestamoRecuperado = prestamoDAO.buscarPorId(nuevoPrestamo.getId().toString());
            if (prestamoRecuperado != null) {
                System.out.println("Préstamo recuperado de la base de datos: " + prestamoRecuperado);
            } else {
                System.out.println("No se pudo recuperar el préstamo.");
            }
            
        } catch (DAOException e) {
            System.err.println("Error al trabajar con el préstamo: " + e.getMessage());
        }
    }
}