/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author diana
 */
import DAOs.TrasladoDAO;
import entidades.Traslado;
import entidades.Vehiculo;
import excepciones.DAOException;

import java.time.LocalDateTime;

public class PruebaTrasladoDAO {
    public static void main(String[] args) {
        TrasladoDAO trasladoDAO = new TrasladoDAO();

        try {
            // Crear un traslado de prueba
            Traslado trasladoPrueba = new Traslado(
                "F001",
                "Viaje de estudios",
                30,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                true,
                new Vehiculo("f",12,"eeecc","eee",13,"hhhhh","vvv","ccc"),
                "Buen estado",
                "Buen estado",
                "Buen estado",
                100,
                "profesor@universidad.edu",
                "chofer@universidad.edu",
                true
            );

            // Agregar traslado
            System.out.println("Agregando traslado...");
            trasladoDAO.agregar(trasladoPrueba);
            System.out.println("Traslado agregado con ID: " + trasladoPrueba.getId());

            // Buscar traslado por ID
            Traslado trasladoEncontrado = trasladoDAO.buscarPorId(trasladoPrueba.getId());
            System.out.println("Traslado encontrado: " + trasladoEncontrado);

        } catch (DAOException e) {
            System.err.println("Error en TrasladoDAO: " + e.getMessage());
        }
    }
}