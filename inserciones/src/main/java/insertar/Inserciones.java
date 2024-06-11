/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package insertar;

import BO.PrestamoBO;
import BO.VehiculoBO;
import DTO.PrestamoDTO;
import DTO.VehiculoDTO;
import Excepcion.NegocioException;
import Exceptions.BisnessException;
import Negocio.EmpleadoBO;
import dtos.EmpleadoDTO;
import interfaces.IEmpleadoBO;
import java.time.LocalDate;

/**
 *
 * @author skevi
 */
public class Inserciones {


    
    public void insertar() throws NegocioException, BisnessException{
    
        
    //insertamos nuevos empleados
    EmpleadoDTO empleado1 = new EmpleadoDTO(1, "kevin@gmail.com", "kevin123", "EMPLEADO");
    EmpleadoDTO empleado2 = new EmpleadoDTO(2, "diana@gmail.com", "diana123", "EMPLEADO");
    EmpleadoDTO empleado3 = new EmpleadoDTO(3, "carlos@gmail.com", "carlos123", "EMPLEADO");
    EmpleadoDTO empleado4 = new EmpleadoDTO(4, "daniel@gmail.com", "daniel123", "EMPLEADO");
    
    //insertamos nuevos choferes 
    EmpleadoDTO chofer1 = new EmpleadoDTO(6, "panfilo@gmail.com", "panfilo123", "CHOFER");
    EmpleadoDTO chofer2 = new EmpleadoDTO(7, "joshua@gmail.com", "joshua123", "CHOFER");
    EmpleadoDTO chofer3 = new EmpleadoDTO(8, "panfilo@gmail.com", "panfilo123", "CHOFER");
    
    //insertamos nuevos administradores
    EmpleadoDTO administrador1 = new EmpleadoDTO(11, "arnoldo@gmail.com", "arnoldo123", "ADMINISTRADOR");
    EmpleadoDTO administrador2 = new EmpleadoDTO(12, "damian@gmail.com", "damian123", "ADMINISTRADOR");
    
    
    IEmpleadoBO empleado = new EmpleadoBO();
    
    empleado.registrarEmpleado(empleado1);
    empleado.registrarEmpleado(empleado2);
    empleado.registrarEmpleado(empleado3);
    empleado.registrarEmpleado(empleado4);
    
    empleado.registrarChofer(chofer1);
    empleado.registrarChofer(chofer2);
    empleado.registrarChofer(chofer3);
    
    empleado.registrarAdministrador(administrador1);
    empleado.registrarAdministrador(administrador2);
    
    
    //declaramos los vehiculos 
    VehiculoDTO vehiculo1 = new VehiculoDTO(1, "AUDI", "RXZ", 2014, "COMUN", "WAP-2A-312");
    VehiculoDTO vehiculo2 = new VehiculoDTO(1, "CHEVROLET", "CAMARO", 2020, "DEPORTIVO", "WAP-2A-312");
    VehiculoDTO vehiculo3 = new VehiculoDTO(1, "TESLA", "XWING", 2019, "TECNOLOGICO", "FAS-AN-D4R");
    VehiculoDTO vehiculo4 = new VehiculoDTO(1, "MAZZERATI", "MARK1", 2021, "DEPORTIVO", "DAM-MN-SI");
    VehiculoDTO vehiculo5 = new VehiculoDTO(1, "NISSAN", "TSURU", 2009, "BESTIA", "13K-TH-ISM");
    
    LocalDate inicio;
    inicio = LocalDate.now();
    
    LocalDate fin;
    fin = LocalDate.now().plusDays(5);
    
    //instanciamos los prestamos
    PrestamoDTO prestamo1 = new PrestamoDTO(1, "academicos", inicio, fin, "WAP-2A-312", "kevin@gmail.com");
    PrestamoDTO prestamo2 = new PrestamoDTO(1, "una vuelta", inicio, fin, "WAP-2A-312", "diana@gmail.com");
    
    
    VehiculoBO vehiculo = new VehiculoBO();
    
    vehiculo.agregar(vehiculo1);
    vehiculo.agregar(vehiculo2);
    vehiculo.agregar(vehiculo3);
    vehiculo.agregar(vehiculo4);
    vehiculo.agregar(vehiculo5);
    
    //agregamos los vehiculos
    PrestamoBO prestamo = new PrestamoBO();
    
    prestamo.agregar(prestamo1);
    prestamo.agregar(prestamo2);
    
    
    }
    
}
