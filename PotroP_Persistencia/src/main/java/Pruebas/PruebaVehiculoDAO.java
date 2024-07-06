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
import daos.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;

public class PruebaVehiculoDAO {
    public static void main(String[] args) {
        ConexionBDM.getInstance();
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        
        try {
            // Array de 10 vehículos diferentes
            Vehiculo[] vehiculos = {
                new Vehiculo(null, 1, "Toyota", "Corolla", 2022, "Sedán", "ABC123", "5"),
                new Vehiculo(null, 2, "Honda", "Civic", 2021, "Sedán", "DEF456", "5"),
                new Vehiculo(null, 3, "Ford", "Mustang", 2023, "Coupé", "GHI789", "4"),
                new Vehiculo(null, 4, "Chevrolet", "Silverado", 2022, "Pickup", "JKL012", "5"),
                new Vehiculo(null, 5, "Volkswagen", "Golf", 2021, "Hatchback", "MNO345", "5"),
                new Vehiculo(null, 6, "BMW", "X5", 2023, "SUV", "PQR678", "7"),
                new Vehiculo(null, 7, "Mercedes-Benz", "C-Class", 2022, "Sedán", "STU901", "5"),
                new Vehiculo(null, 8, "Audi", "A4", 2021, "Sedán", "VWX234", "5"),
                new Vehiculo(null, 9, "Nissan", "Altima", 2023, "Sedán", "YZA567", "5"),
                new Vehiculo(null, 10, "Hyundai", "Tucson", 2022, "SUV", "BCD890", "5")
            };
            
            // Adicionar vehículos
            System.out.println("Adicionando vehículos...");
            for (Vehiculo vehiculo : vehiculos) {
                vehiculoDAO.agregar(vehiculo);
                System.out.println("Vehículo agregado: " + vehiculo);
            }
            System.out.println("Todos los vehículos fueron agregados con éxito");
            
            // Obtener todos los vehículos
            System.out.println("\nListando todos los vehículos:");
            vehiculoDAO.obtenerTodos().forEach(System.out::println);
        } catch (DAOException e) {
            System.err.println("Error en VehiculoDAO: " + e.getMessage());
        }
    }
}