/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daos;

/**
 *
 * @author caarl
 */
import Interfaces.IAdministradorDAO;
import Interfaces.IPrestamoDAO;
import Interfaces.IVehiculoDAO;
import entidades.Administrador;
import entidades.Prestamo;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.Calendar;
import java.util.Date;

public class Inserciones {
    public static void main(String[] args) {
        try {
            // Crear instancias DAO
            IPrestamoDAO prestamoDAO = new PrestamoDAO();
            IVehiculoDAO vehiculoDAO = new VehiculoDAO();
            IAdministradorDAO administradorDAO = new AdministradorDAO();

            // Crear y agregar ejemplos de vehículos
            Vehiculo vehiculo1 = new Vehiculo(1, "Toyota", "Corolla", 2020, "WIN2");
            Vehiculo vehiculo2 = new Vehiculo(2, "Honda", "Civic", 2019, "ASD33");
            Vehiculo vehiculo3 = new Vehiculo(3, "Ford", "Focus", 2018, "WWWWAAA");
            Vehiculo vehiculo4 = new Vehiculo(4, "Chevrolet", "Cruze", 2021, "WWWFFF");
            Vehiculo vehiculo5 = new Vehiculo(5, "Tesla", "Model S", 2022, "FKU2");
            vehiculoDAO.agregar(vehiculo1);
            vehiculoDAO.agregar(vehiculo2);
            vehiculoDAO.agregar(vehiculo3);
            vehiculoDAO.agregar(vehiculo4);
            vehiculoDAO.agregar(vehiculo5);

            // Crear y agregar ejemplos de administradores
            Administrador admin1 = new Administrador(1, "admin1@ejem.com", "asd23");
            Administrador admin2 = new Administrador(2, "admin2@ejem.com", "fff12344");
            Administrador admin3 = new Administrador(3, "admin3@ejem.com", "ggez4me");
            Administrador admin4 = new Administrador(4, "admin4@ejem.com", "333333fff");
            Administrador admin5 = new Administrador(5, "admin5@ejem.com", "vvvaasss22");
            administradorDAO.agregar(admin1);
            administradorDAO.agregar(admin2);
            administradorDAO.agregar(admin3);
            administradorDAO.agregar(admin4);
            administradorDAO.agregar(admin5);

            // Crear y agregar ejemplos de préstamos
            Calendar calendar = Calendar.getInstance();
            Date fechaInicio = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, 7);
            Date fechaFin1 = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, 7);
            Date fechaFin2 = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, 7);
            Date fechaFin3 = calendar.getTime();

            //Prestamo prestamo1 = new Prestamo(1, "Mantenimiento", fechaInicio, fechaFin1, vehiculo1);
            //Prestamo prestamo2 = new Prestamo(2, "Negocios", fechaInicio, fechaFin2, vehiculo2);
            //Prestamo prestamo3 = new Prestamo(3, "Excusrsion", fechaInicio, fechaFin3, vehiculo3);
            //Prestamo prestamo4 = new Prestamo(4, "Me lo robe", fechaInicio, fechaFin3, vehiculo3);
            //Prestamo prestamo5 = new Prestamo(5, "Vacaciones", fechaInicio, fechaFin3, vehiculo3);
            //prestamoDAO.agregar(prestamo1);
            //prestamoDAO.agregar(prestamo2);
            //prestamoDAO.agregar(prestamo3);

            // Mostrar los datos insertados
            System.out.println("Vehículos insertados:");
            for (Vehiculo vehiculo : vehiculoDAO.listaVehiculos()) {
                System.out.println("ID: " + vehiculo.getId() + ", Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());
            }

            System.out.println("\nAdministradores insertados:");
            for (Administrador admin : administradorDAO.listaAdministradores()) {
                System.out.println("ID: " + admin.getId() + ", Correo: " + admin.getCorreo());
            }

            System.out.println("\nPréstamos insertados:");
            for (Prestamo prestamo : prestamoDAO.listaPrestamos()) {
                System.out.println("ID: " + prestamo.getId() + ", Motivo: " + prestamo.getMotivo() +
                        ", Vehiculo: " + prestamo.getVehiculo().getMarca() + " " + prestamo.getVehiculo().getModelo());
            }

        } catch (DAOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
