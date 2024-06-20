/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.PrestamoMaestros;
import java.util.List;

/**
 *
 * @author caarl
 */
public interface IPrestamoMaestrosDAO {
    String save(PrestamoMaestros prestamo);
    PrestamoMaestros findById(String id);
    List<PrestamoMaestros> findAll();
    void update(PrestamoMaestros prestamo);
    void delete(String id);
    

}
