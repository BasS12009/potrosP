/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.PrestamoMaestros;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author caarl
 */
public interface IPrestamoMaestrosBO {
   String guardarPrestamo(PrestamoMaestros prestamo);
    PrestamoMaestros obtenerPrestamoPorId(String id);
    List<PrestamoMaestros> obtenerTodosLosPrestamos();
    void actualizarPrestamo(PrestamoMaestros prestamo);
    void eliminarPrestamo(String id);
    List<PrestamoMaestros> buscarPrestamosPorResponsable(String idResponsable);
    List<PrestamoMaestros> buscarPrestamosPorFecha(LocalDate fecha);  
}
