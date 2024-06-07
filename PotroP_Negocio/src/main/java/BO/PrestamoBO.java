/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Converters.PrestamoCVR;
import DTO.PrestamoDTO;
import Exceptions.BisnessException;
import Interfaces.IPrestamoDAO;
import daos.PrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;
import interfaces.IPrestamoBO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase implementa los elementos de IPrestamoDAO para su uso en capas
 * posteriores.
 * @author diana
 */
public class PrestamoBO implements IPrestamoBO{
    
    //inicializamos varibles de clase 
    private final IPrestamoDAO prestamoDAO; //instancia de la clase DAO
    private final PrestamoCVR prestamoCVR; //instancia de la clase de convertidores

    /**
     * Constructor que inicializa las variables de la clase.
     */
    public PrestamoBO() {
        this.prestamoDAO = new PrestamoDAO();
        this.prestamoCVR = new PrestamoCVR();
    }
    
    /**
     * Metodo para agregar un nuevo prestamo.
     * 
     * @param prestamoDTO Objeto de tipo PrestamoDTO que deseamos agregar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public void agregar(PrestamoDTO prestamoDTO) throws BisnessException {
       try{
         // agregamos un prestamo convirtiendolo de DTO a Entidad.
         this.prestamoDAO.agregar(prestamoCVR.convetir_Prestamo(prestamoDTO));
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    /**
     * Metodo para eliminar un prestamo.
     * 
     * @param prestamoDTO Objeto de tipo PrestamoDTO que deseamos eliminar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public void eliminar(PrestamoDTO prestamoDTO) throws BisnessException {
       try{
         //eliminamos un prestamo convirtiendolo de DTO a Entidad.
         this.prestamoDAO.eliminar(prestamoCVR.convetir_Prestamo(prestamoDTO));
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }
 
    /**
     * Metodo para actualizar un Prestamo.
     * 
     * @param prestamoDTO Objeto de tipo PrestamoDTO que deseamos actualizar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public void actualizar(PrestamoDTO prestamoDTO) throws BisnessException {
       try{
        //actualizamos un prestamo convirtiendolo de DTO a Entidad.   
        this.prestamoDAO.actualizar(prestamoCVR.convetir_Prestamo(prestamoDTO));
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    /**
     * Metodo que nos permite obtener un prestamo buscandolo mediante su id.
     * 
     * @param id id del prestamo a buscar.
     * @return Retorna un objeto de tipo Prestamo.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public Prestamo buscarPorId(int id) throws BisnessException {
       try{
         return this.prestamoDAO.buscarPorId(id);
       }
       catch(DAOException e){
               throw  new BisnessException(e.getMessage());
       }
    }

    /**
     * Metodo para obtener una lista de todos los prestamos echos.
     * 
     * @return Retorna una lista de objetos de tipo prestamo
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public List<PrestamoDTO> listaPrestamos() throws BisnessException {
        
        List<PrestamoDTO> lista = new ArrayList();
        try{
        List<Prestamo> listaPrestamos = prestamoDAO.listaPrestamos();
        
            for (int i = 0; i < listaPrestamos.size(); i++) {
                lista.add(prestamoCVR.convertir_DTO(listaPrestamos.get(i)));
            }
        return lista;
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * 
     * @param offset
     * @param limit
     * @return
     * @throws BisnessException 
     */
    @Override
    public List<PrestamoDTO> listaPaginda(int offset, int limit) throws BisnessException {
    if (offset < 0 || limit < 0) {
        throw new BisnessException("Offset y limit deben ser mayores o iguales a 0.");
    }

    try {
        List<PrestamoDTO> listaBO = new ArrayList<>();
        List<Prestamo> listaDAO = prestamoDAO.listaPaginda(offset, limit);
        
        for (Prestamo prestamo : listaDAO) {
            listaBO.add(prestamoCVR.convertir_DTO(prestamo));
        }
        
        return listaBO;
        
    } catch (DAOException ex) {
        throw new BisnessException(ex.getMessage());
    }
    } 

    /**
     * 
     * @param begin
     * @param end
     * @return
     * @throws BisnessException 
     */
    @Override
    public List<PrestamoDTO> listaPorFechas(LocalDate begin, LocalDate end) throws BisnessException {
    if (begin == null || end == null) {
        throw new IllegalArgumentException("Las fechas no pueden ser nulas.");
    } else {
        try {
            List<PrestamoDTO> listaBO = new ArrayList<>();
            List<Prestamo> listaDAO = prestamoDAO.listaPorFechas(begin, end);
            
            for (int i = 0; i < listaDAO.size(); i++) {
                listaBO.add(prestamoCVR.convertir_DTO(listaDAO.get(i)));
            }
            
            return listaBO;
            
        } catch (DAOException ex) {
            throw new BisnessException(ex.getMessage());
        }
    }
}
    
}
