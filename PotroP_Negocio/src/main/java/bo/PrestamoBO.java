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
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public void agregar(PrestamoDTO prestamoDTO) throws BisnessException {
        try {
            // agregamos un prestamo convirtiendolo de DTO a Entidad.
            this.prestamoDAO.agregar(prestamoCVR.convetir_Prestamo(prestamoDTO));
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para eliminar un prestamo.
     *
     * @param prestamoDTO Objeto de tipo PrestamoDTO que deseamos eliminar.
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public void eliminar(PrestamoDTO prestamoDTO) throws BisnessException {
        try {
            //eliminamos un prestamo convirtiendolo de DTO a Entidad.
            this.prestamoDAO.eliminar(prestamoCVR.convetir_Prestamo(prestamoDTO));
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para actualizar un Prestamo.
     *
     * @param prestamoDTO Objeto de tipo PrestamoDTO que deseamos actualizar.
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public void actualizar(PrestamoDTO prestamoDTO) throws BisnessException {
        try {
            //actualizamos un prestamo convirtiendolo de DTO a Entidad.   
            this.prestamoDAO.actualizar(prestamoCVR.convetir_Prestamo(prestamoDTO));
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
    public Prestamo buscarPorId(int id) throws BisnessException {
        try {
            return this.prestamoDAO.buscarPorId(id);
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para obtener una lista de todos los préstamos hechos.
     *
     * @return Retorna una lista de objetos de tipo PrestamoDTO.
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public List<PrestamoDTO> listaPrestamos() throws BisnessException {

        List<PrestamoDTO> lista = new ArrayList();
        try {
            List<Prestamo> listaPrestamos = prestamoDAO.listaPrestamos();

            for (int i = 0; i < listaPrestamos.size(); i++) {
                lista.add(prestamoCVR.convertir_DTO(listaPrestamos.get(i)));    
            }
            return lista;
        } catch (DAOException e) {
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para obtener una lista paginada de préstamos.
     *
     * @param offset Índice de inicio de la lista.
     * @param limit Límite de elementos en la lista.
     * @return Retorna una lista de objetos de tipo PrestamoDTO.
     * @throws BisnessException Arroja una excepción si ocurre un error en la
     * operación.
     */
    @Override
    public List<PrestamoDTO> listaPaginda(int offset, int limit) throws BisnessException {
        
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
     * Obtiene una lista de préstamos realizados dentro de un rango de fechas
     * especificado.
     *
     * @param begin Fecha de inicio del rango.
     * @param end Fecha de fin del rango.
     * @return Lista de objetos de tipo PrestamoDTO dentro del rango de fechas
     * especificado.
     * @throws BisnessException Si ocurre un error al acceder a la base de datos
     * o al procesar los datos.
     * @throws IllegalArgumentException Si las fechas de inicio o fin son nulas.
     */
    @Override
    public List<PrestamoDTO> listaPorFechas(LocalDate begin, LocalDate end) throws BisnessException {
        
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

