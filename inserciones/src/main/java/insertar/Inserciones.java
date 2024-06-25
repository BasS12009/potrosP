/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package insertar;


import DTO.PrestamoDTO;
import DTO.VehiculoDTO;
import bo.PrestamoBO;
import bo.VehiculoBO;
import exceptions.BisnessException;
import java.time.LocalDate;

/**
 *
 * @author skevi
 */
public class Inserciones {


    
    public void insertar() throws BisnessException {
  
    //declaramos los vehiculos 
    VehiculoDTO vehiculo1 = new VehiculoDTO(1, "AUDI", "RXZ", 2014, "COMUN", "WAP-2A-312");
    VehiculoDTO vehiculo2 = new VehiculoDTO(1, "CHEVROLET", "CAMARO", 2020, "DEPORTIVO", "WAP-2A-312");
    VehiculoDTO vehiculo3 = new VehiculoDTO(1, "TESLA", "XWING", 2019, "TECNOLOGICO", "FAS-AN-D4R");
    VehiculoDTO vehiculo4 = new VehiculoDTO(1, "MAZZERATI", "MARK1", 2021, "DEPORTIVO", "DAM-MN-SI");
    VehiculoDTO vehiculo5 = new VehiculoDTO(1, "NISSAN", "TSURU", 2009, "BESTIA", "13K-TH-ISM");
    
    //declaramos los vehiculos tipo automovil
    VehiculoDTO vehiculo6 = new VehiculoDTO(1, "TOYOTA", "COROLLA", 2022, "Automovil", "ABC-123");
    VehiculoDTO vehiculo7 = new VehiculoDTO(2, "HONDA", "CIVIC", 2021, "Automovil", "DEF-456");
    VehiculoDTO vehiculo8 = new VehiculoDTO(3, "FORD", "FOCUS", 2020, "Automovil", "GHI-789");
    VehiculoDTO vehiculo9 = new VehiculoDTO(4, "VOLKSWAGEN", "GOLF", 2023, "Automovil", "JKL-012");
    VehiculoDTO vehiculo10 = new VehiculoDTO(5, "HYUNDAI", "ELANTRA", 2022, "Automovil", "MNO-345");

    
    
    
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
    
        vehiculo.agregar(vehiculo6);
    vehiculo.agregar(vehiculo7);
    vehiculo.agregar(vehiculo8);
    vehiculo.agregar(vehiculo9);
    vehiculo.agregar(vehiculo10);
    
    //agregamos los vehiculos
    PrestamoBO prestamo = new PrestamoBO();
    
    prestamo.agregar(prestamo1);
    prestamo.agregar(prestamo2);
    
    
    }
    
}
