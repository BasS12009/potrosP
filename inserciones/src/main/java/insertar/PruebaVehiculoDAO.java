/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertar;




import daos.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.List;

/**
 *
 * @author caarl
 */
public class PruebaVehiculoDAO {

    public static void main(String[] args) {
        try {
            // Crear instancia del DAO
            VehiculoDAO vehiculoDAO = new VehiculoDAO();

            // Agregar algunos vehículos de prueba
            vehiculoDAO.agregar(new Vehiculo(1, "TOYOTA", "COROLLA", 2022, "Automovil", "ABC-123"));
            vehiculoDAO.agregar(new Vehiculo(2, "HONDA", "CIVIC", 2021, "Automovil", "DEF-456"));
            vehiculoDAO.agregar(new Vehiculo(3, "FORD", "F-150", 2020, "Camioneta", "GHI-789"));
            vehiculoDAO.agregar(new Vehiculo(4, "VOLKSWAGEN", "GOLF", 2023, "Automovil", "JKL-012"));
            vehiculoDAO.agregar(new Vehiculo(5, "TOYOTA", "HILUX", 2022, "Camioneta", "MNO-345"));

            // Probar el método buscarPorTipo
            System.out.println("Resultado de buscarPorTipo('Automovil'):");
            List<Vehiculo> automoviles = vehiculoDAO.buscarPorTipo("Automovil");
            System.out.println(automoviles);

         
           
        } catch (DAOException e) {
            System.out.println("Error en la operación del DAO: " + e.getMessage());
        }
    }
}