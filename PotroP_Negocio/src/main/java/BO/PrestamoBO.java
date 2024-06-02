/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTO.PrestamoDTO;
import Exceptions.BisnessException;
import Interfaces.IPrestamoDAO;
import daos.PrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;
import java.util.List;

/**
 *
 * @author diana
 */
public class PrestamoBO {
    
    private IPrestamoDAO prestamoDAO = new PrestamoDAO();

    
    
    public void agregar(Prestamo prestamo) throws BisnessException {
       try{
         this.prestamoDAO.agregar(prestamo);
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    
    public void eliminar(Prestamo prestamo) throws BisnessException {
       try{
         this.prestamoDAO.eliminar(prestamo);
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    public void actualizar(Prestamo prestamo) throws BisnessException {
       try{
        this.prestamoDAO.actualizar(prestamo);
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    
    public Prestamo buscarPorId(int id) throws BisnessException {
       try{
         return this.prestamoDAO.buscarPorId(id);
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    
    public List<PrestamoDTO> listaPrestamos() throws BisnessException {
        
        for () {
            
        }
    }

   
    
    
}
