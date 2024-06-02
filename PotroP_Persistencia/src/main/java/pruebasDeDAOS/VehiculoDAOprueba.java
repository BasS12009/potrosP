/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasDeDAOS;

/**
 *
 * @author caarl
 */
import Interfaces.IVehiculoDAO;
import daos.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.List;

public class VehiculoDAOprueba {
    public static void main(String[] args) {
        try {
            // Crear instancia DAO
            IVehiculoDAO vehiculoDAO = new VehiculoDAO();

            // Crear y agregar vehículos
            Vehiculo vehiculo1 = new Vehiculo(1, "Toyota", "Corolla", 2020, "ccccssserrrr3333", "Sedan");
            Vehiculo vehiculo2 = new Vehiculo(2, "Honda", "Civic", 2019, "olsd13444", "Sedan");
            vehiculoDAO.agregar(vehiculo1);
            vehiculoDAO.agregar(vehiculo2);

            // Buscar y mostrar vehículo
            Vehiculo encontrado = vehiculoDAO.buscarPorId(1);
            System.out.println("Vehículo encontrado: " + encontrado.getMarca() + " " + encontrado.getModelo());

            // Listar todos los vehículos
            List<Vehiculo> vehiculos = vehiculoDAO.listaVehiculos();
            System.out.println("Total de vehículos: " + vehiculos.size());

            // Actualizar vehículo
            vehiculo1.setModelo("Corolla Actualizado");
            vehiculoDAO.actualizar(vehiculo1);

            // Eliminar vehículo
            //vehiculoDAO.eliminar(1);

        } catch (DAOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
