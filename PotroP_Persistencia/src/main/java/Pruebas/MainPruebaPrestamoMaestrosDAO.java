/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author diana
 */
import daos.PrestamoMaestrosDAO;
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.Arrays;

public class MainPruebaPrestamoMaestrosDAO {
    public static void main(String[] args) {
        PrestamoMaestrosDAO prestamoMaestrosDAO = new PrestamoMaestrosDAO();

        try {
            // Crear un préstamo de maestros de prueba
            PrestamoMaestros prestamoMaestrosPrueba = new PrestamoMaestros(
                LocalDate.now(),
                "Departamento de Informática",
                3,
                "Conferencia",
                "Campus Norte",
                "Campus Sur",
                "VEH001",
                "profesor@universidad.edu",
                Arrays.asList("estudiante1@universidad.edu", "estudiante2@universidad.edu")
            );

            // Agregar préstamo de maestros
            System.out.println("Agregando préstamo de maestros...");
            prestamoMaestrosDAO.agregar(prestamoMaestrosPrueba);
            System.out.println("Préstamo de maestros agregado con ID: " + prestamoMaestrosPrueba.getId());

            // Buscar préstamo de maestros por ID
            PrestamoMaestros prestamoMaestrosEncontrado = prestamoMaestrosDAO.buscarPorId(prestamoMaestrosPrueba.getId());
            System.out.println("Préstamo de maestros encontrado: " + prestamoMaestrosEncontrado);

            // Listar todos los préstamos de maestros
            System.out.println("Listando todos los préstamos de maestros:");
            prestamoMaestrosDAO.listaPrestamosMaestros().forEach(System.out::println);

        } catch (DAOException e) {
            System.err.println("Error en PrestamoMaestrosDAO: " + e.getMessage());
        }
    }
}