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
import daos.PrestamoMaestrosDAO;
import daos.VehiculoDAO;
import entidades.PrestamoMaestros;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.Arrays;


public class PruebaPrestamoMaestrosDAO {
    public static void main(String[] args) {
     ConexionBDM.getInstance();
        
        PrestamoMaestrosDAO prestamoMaestrosDAO = new PrestamoMaestrosDAO();
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        
        try {
            // Primeiro, crie um veículo
            Vehiculo vehiculo = new Vehiculo(null, 1, "Toyota", "Minivan", 2022, "Minivan", "ABC123", "7");
            vehiculoDAO.agregar(vehiculo);
            
            // Agora crie o préstamo com o veículo
            PrestamoMaestros nuevoPrestamoMaestros = new PrestamoMaestros(
                null, // O ID será gerado pelo MongoDB
                LocalDate.now(),
                "Departamento de Informática",
                3,
                "Conferencia de IA",
                "Campus Principal",
                "Campus Secundario",
                vehiculo, // Agora passamos o objeto Vehiculo
                "profesor@universidad.edu",
                Arrays.asList("Asistente 1", "Asistente 2")
            );
            
            prestamoMaestrosDAO.agregar(nuevoPrestamoMaestros);
            System.out.println("Préstamo de maestros agregado con éxito a la base de datos MongoDB.");
            System.out.println("Detalles del préstamo de maestros: " + nuevoPrestamoMaestros);
        } catch (DAOException e) {
            System.err.println("Error al agregar el préstamo de maestros: " + e.getMessage());
        }
    }
}