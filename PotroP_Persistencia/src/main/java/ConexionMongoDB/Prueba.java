/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConexionMongoDB;

import com.mongodb.client.MongoDatabase;
import daos.PrestamoMaestroDAO;
import entidades.PrestamoMaestro;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author caarl
 */


public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
// Obtener la instancia de la conexión a la base de datos
        MongoDBConnection connection = MongoDBConnection.getInstance();
        MongoDatabase database = connection.getDatabase();

        // Crear una instancia de PrestamoMaestroDAO
        PrestamoMaestroDAO prestamoMaestroDAO = new PrestamoMaestroDAO(database);

         //creamos una nueva fecha
        LocalDate fecha;
        LocalDate fechaPrestamo = LocalDate.now();
        
        // Crear un nuevo prestamo
        PrestamoMaestro nuevoPrestamo = new PrestamoMaestro();
        nuevoPrestamo.setMotivo("Evento");
        nuevoPrestamo.setFechaPrestamo(fechaPrestamo);
        nuevoPrestamo.setCantPersonas(3);
        nuevoPrestamo.setPlantelOrigen("Campus Obregón Centro");
        nuevoPrestamo.setPlantelDestino("Campus Navojoa Sur");
        nuevoPrestamo.setCorreoResponsable("responsable@example.com");
        nuevoPrestamo.setAcompaniante1("ID-1");
        nuevoPrestamo.setAcompaniante2("ID-2");

        // Insertar el prestamo en la base de datos
        prestamoMaestroDAO.insert(nuevoPrestamo);

        // Buscar un prestamo por correo del responsable
        PrestamoMaestro prestamoEncontrado = prestamoMaestroDAO.findByCorreoResponsable(nuevoPrestamo.getCorreoResponsable());
        System.out.println(prestamoEncontrado.getMotivo());

        // Obtener todos los prestamos
        List<PrestamoMaestro> todosLosPrestamos = prestamoMaestroDAO.findAll();
        for (PrestamoMaestro prestamo : todosLosPrestamos) {
            System.out.println(prestamo.getMotivo());
        }

        // Actualizar un prestamo
        prestamoEncontrado.setMotivo("Junta Administrativa");
        prestamoMaestroDAO.update(prestamoEncontrado);

        // Eliminar un prestamo por correo del responsable
        prestamoMaestroDAO.delete(prestamoEncontrado.getCorreoResponsable());

        // Cerrar la conexión a la base de datos
        connection.close();
    }
}
