/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasDeDAOS;

/**
 *
 * @author caarl
 */
import Interfaces.IAdministradorDAO;
import daos.AdministradorDAO;
import entidades.Administrador;
import excepciones.DAOException;
import java.util.List;

import java.util.List;

import java.util.List;

public class AdministradorDAOprueba {
    public static void main(String[] args) {
        try {
            // Crear instancia DAO
            IAdministradorDAO administradorDAO = new AdministradorDAO();

            // Crear y agregar administradores
            Administrador admin1 = new Administrador("admin1@ejem.com", "kkkkkkk1");
            Administrador admin2 = new Administrador("admin2@ejem.com", "lllllllll2");
            administradorDAO.agregar(admin1);
            administradorDAO.agregar(admin2);

            // Listar todos los administradores
            List<Administrador> administradores = administradorDAO.listaAdministradores();
            System.out.println("Total de administradores: " + administradores.size());
            for (Administrador admin : administradores) {
                System.out.println("ID: " + admin.getId() + ", Correo: " + admin.getCorreo() + ", Contraseña: " + admin.getContraseña());
            }

        } catch (DAOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

