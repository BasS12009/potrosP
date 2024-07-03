/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;


/**
 *
 * @author diana
 */
import conexion.ConexionBD;
import daos.PrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;

import java.time.LocalDate;

public class PruebaPrestamoDAO {
//    public static void main(String[] args) {
//        ConexionBD conexion = ConexionBD.getInstance();
//        
//        PrestamoDAO prestamoDAO = new PrestamoDAO(conexion.getDatabase().getCollection("PrestamosMaestros", Prestamo.class));
//
//        try {
//            // Crear un préstamo de prueba
//            Prestamo prestamoPrueba = new Prestamo(
//                "Viaje de negocios",
//                LocalDate.now(),
//                LocalDate.now().plusDays(5),
//                "ABC123",
//                "empleado@ejemplo.com"
//            );
//
//            // Agregar préstamo
//            System.out.println("Agregando préstamo...");
//            prestamoDAO.agregar(prestamoPrueba);
//            System.out.println("Préstamo agregado con ID: " + prestamoPrueba.getId());
//
//            // Buscar préstamo por ID
//            Prestamo prestamoEncontrado = prestamoDAO.buscarPorId(prestamoPrueba.getId());
//            System.out.println("Préstamo encontrado: " + prestamoEncontrado);
//
//        } catch (DAOException e) {
//            System.err.println("Error en PrestamoDAO: " + e.getMessage());
//        } finally {
//            
//        }
//    }
}