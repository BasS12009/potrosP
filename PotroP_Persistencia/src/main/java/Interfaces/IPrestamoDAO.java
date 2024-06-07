/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Prestamo;
import excepciones.DAOException;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author caarl
 */

public interface IPrestamoDAO {
    
    void agregar(Prestamo prestamo) throws DAOException;
    
    void eliminar(Prestamo prestamo) throws DAOException;
    
    void actualizar(Prestamo prestamo) throws DAOException;
    
    public Prestamo buscarPorId(int id) throws DAOException;
    
    public List<Prestamo> listaPaginda(int offset, int limit) throws DAOException;
    
    public List<Prestamo> listaPrestamos() throws DAOException;
    
    public List<Prestamo> listaPorFechas(LocalDate begin, LocalDate end) throws DAOException;
  
}
