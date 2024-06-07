/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

/**
 *
 * @author caarl
 */
import Excepcion.PersistenciaException;
import dao.EmpleadoDAO;
import entidades.Empleado;


import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

class EmpleadoDAOTest {
    private EmpleadoDAO empleadoDAO;


    void setUp() {
        empleadoDAO = new EmpleadoDAO();
    }


    void testListaEmpleados() {
        try {
            Empleado empleado1 = new Empleado(1, "juan@example.com", "password123", "EMPLEADO");
            Empleado empleado2 = new Empleado(2, "maria@example.com", "secret456", "ADMINISTRADOR");
            Empleado empleado3 = new Empleado(3, "pedro@example.com", "qwerty789", "CHOFER");

            empleadoDAO.registrarEmpleado(empleado1);
            empleadoDAO.registrarAdministrador(empleado2);
            empleadoDAO.registrarChofer(empleado3);

            List<Empleado> listaEmpleados = empleadoDAO.ListaEmpleados(1, 2);
            if (listaEmpleados.size() != 2 || !listaEmpleados.get(0).equals(empleado1) || !listaEmpleados.get(1).equals(empleado2)) {
                throw new AssertionError("La lista de empleados no es correcta");
            }
        } catch (PersistenciaException e) {
            e.printStackTrace();
            throw new AssertionError("Ocurrió una excepción inesperada: " + e.getMessage());
        }
    }


    void testBuscarEmpleado() {
        try {
            Empleado empleado1 = new Empleado(1, "juan@example.com", "password123", "EMPLEADO");
            empleadoDAO.registrarEmpleado(empleado1);

            Empleado empleadoEncontrado = empleadoDAO.buscarEmpleado(1);
            if (!empleadoEncontrado.equals(empleado1)) {
                throw new AssertionError("El empleado encontrado no es correcto");
            }
        } catch (PersistenciaException e) {
            e.printStackTrace();
            throw new AssertionError("Ocurrió una excepción inesperada: " + e.getMessage());
        }

        try {
            empleadoDAO.buscarEmpleado(0);
            throw new AssertionError("Se esperaba una excepción PersistenciaException");
        } catch (PersistenciaException e) {
            // Excepción esperada
        }
    }

 
    void testExistenciaAdmin() {
        try {
            Empleado empleado1 = new Empleado(1, "juan@example.com", "password123", "EMPLEADO");
            Empleado empleado2 = new Empleado(2, "maria@example.com", "secret456", "ADMINISTRADOR");

            empleadoDAO.registrarEmpleado(empleado1);
            empleadoDAO.registrarAdministrador(empleado2);

            if (!empleadoDAO.existenciaAdmin(empleado2)) {
                throw new AssertionError("Se esperaba que el administrador existiera");
            }

            if (empleadoDAO.existenciaAdmin(empleado1)) {
                throw new AssertionError("No se esperaba que el empleado existiera como administrador");
            }
        } catch (PersistenciaException e) {
            e.printStackTrace();
            throw new AssertionError("Ocurrió una excepción inesperada: " + e.getMessage());
        }

        try {
            empleadoDAO.existenciaAdmin(null);
            throw new AssertionError("Se esperaba una excepción PersistenciaException");
        } catch (PersistenciaException e) {
            // Excepción esperada
        }
    }

 
    void testRegistrarEmpleado() {
        try {
            Empleado empleado1 = new Empleado(1, "juan@example.com", "password123", "EMPLEADO");
            empleadoDAO.registrarEmpleado(empleado1);

            List<Empleado> listaEmpleados = new ArrayList<>(EmpleadoDAO.listaEmpleados);
            if (listaEmpleados.size() != 1 || !listaEmpleados.get(0).equals(empleado1)) {
                throw new AssertionError("El empleado no fue registrado correctamente");
            }
        } catch (PersistenciaException e) {
            e.printStackTrace();
            throw new AssertionError("Ocurrió una excepción inesperada: " + e.getMessage());
        }

        try {
            empleadoDAO.registrarEmpleado(null);
            throw new AssertionError("Se esperaba una excepción PersistenciaException");
        } catch (PersistenciaException e) {
            // Excepción esperada
        }
    }
}