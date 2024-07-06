/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */package Pruebas;

import daos.TrasladoDAO;
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
            // Folio del traslado que queremos buscar
            String folioBuscado = "F001";

            // Buscar traslado por folio
            System.out.println("Buscando traslado con folio: " + folioBuscado);
            Traslado trasladoEncontrado = trasladoDAO.buscar(folioBuscado);

            // Imprimir detalles del traslado encontrado
            if (trasladoEncontrado != null) {
                System.out.println("Traslado encontrado:");
                System.out.println("ID: " + trasladoEncontrado.getId());
                System.out.println("Folio: " + trasladoEncontrado.getFolio());
                System.out.println("Motivo: " + trasladoEncontrado.getMotivo());
                System.out.println("Número de personas: " + trasladoEncontrado.getPersonas());
                System.out.println("Fecha y hora de salida: " + trasladoEncontrado.getFechaHoraSalida());
                System.out.println("Fecha y hora de regreso: " + trasladoEncontrado.getFechaHoraRegreso());
                System.out.println("Disponibilidad: " + trasladoEncontrado.isDisponibilidad());
                System.out.println("Correo del empleado: " + trasladoEncontrado.getCorreoEmpleado());
                System.out.println("Estado: " + trasladoEncontrado.isEstado());

                // Imprimir detalles del vehículo
                if (trasladoEncontrado.getVehiculo() != null) {
                    System.out.println("Vehículo:");
                    System.out.println("  Marca: " + trasladoEncontrado.getVehiculo().getMarca());
                    System.out.println("  Modelo: " + trasladoEncontrado.getVehiculo().getModelo());
                    System.out.println("  Año: " + trasladoEncontrado.getVehiculo().getAño());
                    System.out.println("  Tipo: " + trasladoEncontrado.getVehiculo().getTipo());
                    System.out.println("  Placa: " + trasladoEncontrado.getVehiculo().getPlaca());
                }

                // Imprimir detalles del vehículo entregado
                if (trasladoEncontrado.getVehiculoEntregado() != null) {
                    System.out.println("Vehículo entregado:");
                    // Asume que VehiculoEntregado tiene getters similares a Vehiculo
                    System.out.println("  Estado: " + trasladoEncontrado.getVehiculoEntregado().getEstadoVehiculo());
                    // Agrega más detalles según la estructura de VehiculoEntregado
                }

                // Imprimir detalles del vehículo devuelto
                if (trasladoEncontrado.getVehiculoDevuelto() != null) {
                    System.out.println("Vehículo devuelto:");
                    // Asume que VehiculoDevuelto tiene getters similares a Vehiculo
                    System.out.println("  Estado: " + trasladoEncontrado.getVehiculoDevuelto().getEstadoVehiculo());
                    // Agrega más detalles según la estructura de VehiculoDevuelto
                }
            } else {
                System.out.println("No se encontró ningún traslado con el folio: " + folioBuscado);
            }
        } catch (DAOException e) {
            System.err.println("Error en TrasladoDAO: " + e.getMessage());
        }
    }
}