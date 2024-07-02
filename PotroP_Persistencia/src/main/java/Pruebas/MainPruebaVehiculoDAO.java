/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;


/**
 *
 * @author diana
 */
import DAOs.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;

public class MainPruebaVehiculoDAO {
    public static void main(String[] args) {
        VehiculoDAO vehiculoDAO = new VehiculoDAO();

        try {
            // Crear un vehículo de prueba
            Vehiculo vehiculoPrueba = new Vehiculo(
                "1",
                1,
                "Toyota",
                "Corolla",
                2022,
                "Sedán",
                "ABC123",
                "5"
            );

            // Agregar vehículo
            System.out.println("Agregando vehículo...");
            vehiculoDAO.agregar(vehiculoPrueba);
            System.out.println("Vehículo agregado exitosamente");

            // Obtener todos los vehículos
            System.out.println("Listando todos los vehículos:");
            vehiculoDAO.obtenerTodos().forEach(System.out::println);

        } catch (DAOException e) {
            System.err.println("Error en VehiculoDAO: " + e.getMessage());
        }
    }
}