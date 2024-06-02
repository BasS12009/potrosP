/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasDeDAOS;

/**
 *
 * @author caarl
 */
import Interfaces.IPrestamoDAO;
import Interfaces.IVehiculoDAO;
import daos.PrestamoDAO;
import daos.VehiculoDAO;
import entidades.Prestamo;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class PrestamoDAOprueba {
    public static void main(String[] args) {
        try {
            // Crear instancia DAO
            IPrestamoDAO prestamoDAO = new PrestamoDAO();
            IVehiculoDAO vehiculoDAO = new VehiculoDAO();

            // Crear y agregar vehículos
            Vehiculo vehiculo1 = new Vehiculo("1", "Toyota", "Corolla", 2020, "ccccssserrrr3333", "Sedan");
            Vehiculo vehiculo2 = new Vehiculo("2", "Honda", "Civic", 2019, "olsd13444", "Sedan");
            vehiculoDAO.agregar(vehiculo1);
            vehiculoDAO.agregar(vehiculo2);

            // Crear y agregar préstamos
            Calendar calendar = Calendar.getInstance();
            Date fechaInicio = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, 7); // Añadir 7 días
            Date fechaFin = calendar.getTime();
            Prestamo prestamo1 = new Prestamo("1", "Viaje", fechaInicio, fechaFin, vehiculo1, vehiculo1);
            Prestamo prestamo2 = new Prestamo("2", "Negocios", fechaInicio, fechaFin, vehiculo2, vehiculo2);
            prestamoDAO.agregar(prestamo1);
            prestamoDAO.agregar(prestamo2);

            // Buscar y mostrar préstamo
            Prestamo encontrado = prestamoDAO.buscarPorId("1");
            System.out.println("Prestamo encontrado: " + encontrado.getMotivo());

            // Listar todos los préstamos
            List<Prestamo> prestamos = prestamoDAO.listaPrestamos();
            System.out.println("Total de préstamos: " + prestamos.size());
            for (Prestamo prestamo : prestamos) {
                System.out.println("ID: " + prestamo.getId() + ", Motivo: " + prestamo.getMotivo() +
                        ", Vehiculo: " + prestamo.getVehiculo().getMarca() + " " + prestamo.getVehiculo().getModelo());
            }

            // Actualizar préstamo
            prestamo1.setMotivo("Vacaciones");
            prestamoDAO.actualizar(prestamo1);

            // Eliminar préstamo
            prestamoDAO.eliminar("2");

        } catch (DAOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
