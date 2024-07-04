/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;


/**
 *
 * @author diana
 */
import conexion.ConexionBDM;
import daos.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;

public class PruebaVehiculoDAO {
    public static void main(String[] args) {
       ConexionBDM.getInstance();
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        
        try {
            // Criar um veículo de teste
            Vehiculo vehiculoPrueba = new Vehiculo(
                null, // O ID será gerado pelo MongoDB
                1,
                "Toyota",
                "Corolla",
                2022,
                "Sedán",
                "ABC123",
                "5"
            );
            
            // Adicionar veículo
            System.out.println("Adicionando veículo...");
            vehiculoDAO.agregar(vehiculoPrueba);
            System.out.println("Veículo adicionado com sucesso");
            
            // Obter todos os veículos
            System.out.println("Listando todos os veículos:");
            vehiculoDAO.obtenerTodos().forEach(System.out::println);
        } catch (DAOException e) {
            System.err.println("Erro em VehiculoDAO: " + e.getMessage());
        }
    }
}