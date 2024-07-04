/**
 * PrestamoBO.java
 *
 * Clase que representa la lógica de negocio relacionada con los préstamos;
 *
 * Esta clase proporciona métodos para agregar, eliminar, actualizar
 * y obtener préstamos, así como obtener listas de préstamos según diferentes
 * criterios.
 */
package bo;

import converters.PrestamoCVR;
import dtos.PrestamoDTO;
import exceptions.BisnessException;
import Interfaces.IPrestamoDAO;
import daos.PrestamoDAO;
import entidades.Prestamo;
import excepciones.DAOException;    
import interfaces.IPrestamoBO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class PrestamoBO implements IPrestamoBO {

    //inicializamos varibles de clase 
    private final IPrestamoDAO prestamoDAO; //instancia de la clase DAO
    private final PrestamoCVR prestamoCVR; //instancia de la clase de convertidores


    public PrestamoBO() {
        this.prestamoDAO = new PrestamoDAO();
        this.prestamoCVR = new PrestamoCVR();
    }

    
    
    
    
    /**
     * Metodo para agregar un nuevo prestamo.
     *
     * @param prestamoDTO Objeto de tipo PrestamoDTO que deseamos agregar.
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public void agregar(PrestamoDTO prestamoDTO) throws BisnessException {
        try {
            // agregamos un prestamo convirtiendolo de DTO a Entidad.
            this.prestamoDAO.agregar(prestamoCVR.convertir_Prestamo(prestamoDTO));
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    
    /**
     * Metodo que nos permite obtener un prestamo buscándolo mediante su id.
     *
     * @param id Id del préstamo a buscar.
     * @return Retorna un objeto de tipo Prestamo.
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public Prestamo buscarPorId(String id) throws BisnessException {
        try {
            return this.prestamoDAO.buscarPorId(id);
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    @Override
    public List<PrestamoDTO> listaPaginda(int offset, int limit) throws BisnessException {
        try{
            List<Prestamo> lista = prestamoDAO.listaPaginda(offset, limit);
            List<PrestamoDTO> listaDTO = new ArrayList<>();
            for (int i = 0; i < lista.size(); i++) {
                listaDTO.add(prestamoCVR.convertir_DTO(lista.get(i)));
            }
            return listaDTO;
        }
        catch(DAOException ex){
            throw new BisnessException(ex.getMessage());
        }
    }

    @Override
    public List<PrestamoDTO> listaPorFechas(LocalDate begin, LocalDate end) throws BisnessException {
        try{
            List<Prestamo> lista = prestamoDAO.listaPorFechas(begin, end);
            List<PrestamoDTO> listaDTO = new ArrayList<>();
            for (int i = 0; i < lista.size(); i++) {
                listaDTO.add(prestamoCVR.convertir_DTO(lista.get(i)));
            }
            return listaDTO;
        }
        catch(DAOException ex){
            throw new BisnessException(ex.getMessage());
        }
    }

}