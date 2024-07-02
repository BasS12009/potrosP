/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.List;

/**
 *
 * @author diana
 */
public class VehiculoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Crear una instancia de VehiculoDAO
        VehiculoDAO vehiculoDAO = new VehiculoDAO();

        // Crear un nuevo objeto Vehiculo
        Vehiculo nuevoVehiculo = new Vehiculo(null, 1234, "Toyota", "Corolla", 2020, "Sedán", "ABC123", "5");

//        // Agregar el nuevo vehículo a la base de datos
//        try {
//            vehiculoDAO.agregar(nuevoVehiculo);
//            System.out.println("Vehículo agregado exitosamente!");
//        } catch (DAOException e) {
//            System.err.println("Error al agregar el vehículo: " + e.getMessage());
//        }
//
//        // Obtener todos los vehículos de la base de datos
//        try {
//            List<Vehiculo> vehiculos = vehiculoDAO.obtenerTodos();
//            System.out.println("Vehículos obtenidos exitosamente!");
//            for (Vehiculo vehiculo : vehiculos) {
//                System.out.println(vehiculo);
//            }
//        } catch (DAOException e) {
//            System.err.println("Error al obtener los vehículos: " + e.getMessage());
//        }
//    }
}}


