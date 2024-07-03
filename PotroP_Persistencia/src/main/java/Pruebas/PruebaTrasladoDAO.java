/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */package Pruebas;

import dao.TrasladoDAO;
import entidades.Traslado;
import entidades.Vehiculo;
import entidades.VehiculoEntregado;
import entidades.VehiculoDevuelto;
import excepciones.DAOException;
import java.time.LocalDateTime;

public class PruebaTrasladoDAO {
    public static void main(String[] args) {
        TrasladoDAO trasladoDAO = new TrasladoDAO();
        try {
            // Crear un vehículo general de prueba
            Vehiculo vehiculo = new Vehiculo(
                null, // El ID se generará automáticamente
                12,
                "Toyota",
                "Corolla",
                2022,
                "Sedán",
                "ABC-123",
                "5"
            );

            // Crear un vehículo entregado de prueba
            VehiculoEntregado vehiculoEntregado = new VehiculoEntregado(
                null, // El ID se generará automáticamente
                12,
                "Toyota",
                "Corolla",
                2022,
                "Sedán",
                "ABC-123",
                "5",
                "Buen estado",
                100,
                "Buen estado",
                "Buen estado"
            );

            // Crear un vehículo devuelto de prueba
            VehiculoDevuelto vehiculoDevuelto = new VehiculoDevuelto(
                null, // El ID se generará automáticamente
                12,
                "Toyota",
                "Corolla",
                2022,
                "Sedán",
                "ABC-123",
                "5",
                "Buen estado",
                90,
                "Buen estado",
                "Buen estado",
                500,
                "Sin observaciones"
            );

            // Crear un traslado de prueba
            Traslado trasladoPrueba = new Traslado(
                "F001",
                "Viaje de estudios",
                30,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(1),
                true,
                vehiculo,
                vehiculoEntregado,
                vehiculoDevuelto,
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

            // Imprimir detalles del traslado encontrado
            if (trasladoEncontrado != null) {
                System.out.println("Detalles del traslado:");
                System.out.println("Folio: " + trasladoEncontrado.getFolio());
                System.out.println("Motivo: " + trasladoEncontrado.getMotivo());
                System.out.println("Vehículo general: " + trasladoEncontrado.getVehiculo());
                System.out.println("Vehículo entregado: " + trasladoEncontrado.getVehiculoEntregado());
                System.out.println("Vehículo devuelto: " + trasladoEncontrado.getVehiculoDevuelto());
            }

        } catch (DAOException e) {
            System.err.println("Error en TrasladoDAO: " + e.getMessage());
        }
    }
}