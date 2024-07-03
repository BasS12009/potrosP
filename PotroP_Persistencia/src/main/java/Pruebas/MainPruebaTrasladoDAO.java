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
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPruebaTrasladoDAO {
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
            try {
                ObjectId idTraslado = new ObjectId(trasladoPrueba.getId());
                Traslado trasladoEncontrado = trasladoDAO.buscarPorId(idTraslado);
                System.out.println("Préstamo encontrado: " + trasladoEncontrado);

            } catch (IllegalArgumentException e) {
                // Ignoramos la excepción y continuamos
                System.err.println("Error al buscar el préstamo por ID: " + e.getMessage());
            } catch (DAOException ex) {
                Logger.getLogger(MainPruebaPrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DAOException ex) {
            Logger.getLogger(MainPruebaPrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}