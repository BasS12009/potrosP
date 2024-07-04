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
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.Arrays;


public class PruebaPrestamoMaestrosDAO {
    public static void main(String[] args) {
       // Inicializar la conexión a la base de datos
        ConexionBDM.getInstance();
        
        PrestamoMaestrosDAO prestamoMaestrosDAO = new PrestamoMaestrosDAO();

        try {
            // Crear un nuevo préstamo de maestros
            PrestamoMaestros nuevoPrestamoMaestros = new PrestamoMaestros(
                LocalDate.now(),
                "Departamento de Informática",
                3,
                "Conferencia de IA",
                "Campus Principal",
                "Campus Secundario",
                "Minivan",
                "profesor@universidad.edu",
                Arrays.asList("Asistente 1", "Asistente 2")
            );

            // Agregar el préstamo de maestros a la base de datos
            prestamoMaestrosDAO.agregar(nuevoPrestamoMaestros);
            System.out.println("Préstamo de maestros agregado con éxito a la base de datos MongoDB.");
            System.out.println("Detalles del préstamo de maestros: " + nuevoPrestamoMaestros);

        } catch (DAOException e) {
            System.err.println("Error al agregar el préstamo de maestros: " + e.getMessage());
        }
    }
}