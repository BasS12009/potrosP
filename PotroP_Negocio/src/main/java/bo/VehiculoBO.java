/**
 * VehiculoBO.java
 * 
 * Esta clase se encarga de gestionar la lógica de negocio relacionada con los vehículos,
 * incluyendo operaciones como agregar, eliminar, actualizar y buscar vehículos en la base de datos;
 * Además, proporciona métodos para obtener listas de vehículos almacenados en la base de datos;
 * 
 * Esta clase se comunica con la capa de acceso a datos (DAO) y utiliza un convertidor de DTO a entidad
 * para convertir los objetos de transferencia de datos (DTO) a objetos de entidad y viceversa.
 * 
 */
package bo;

import converters.VehiculoCVR;
import DTO.VehiculoDTO;
import exceptions.BisnessException;
import Interfaces.IVehiculoDAO;
import daos.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;
import interfaces.IVehiculoBO;
import java.util.ArrayList;
import java.util.List;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class VehiculoBO implements IVehiculoBO{
    
    //inicializamos varibles de clase 
    private final IVehiculoDAO vehiculoDAO; //instancia de la clase DAO
    private final VehiculoCVR vehiculoCVR; // intancia de la clase de convertidores

    /**
     * Constructor que inicializa las variables de la clase.
     */
    public VehiculoBO() {
        this.vehiculoDAO = new VehiculoDAO();
        this.vehiculoCVR = new VehiculoCVR();
    }
    
    
    /**
     * Metodo que agregar un nuevo Vehiculo.
     * 
     * @param vehiculoDTO Objeto de tipo Vehiculo a agregar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public void agregar(VehiculoDTO vehiculoDTO) throws BisnessException {
        try{
            //agregamos un vehiculo convirtiendolo de DTO a Entidad.
            this.vehiculoDAO.agregar(vehiculoCVR.convertir_Entidad(vehiculoDTO));
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para eliminar un Vehiculo.
     * 
     * @param vehiculoDTO Objeto de tipo Vehiculo a eliminar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public void eliminar(VehiculoDTO vehiculoDTO) throws BisnessException {
        try{
            //eliminamos un vehiculo convirtiendolo de DTO a Entidad.
            this.vehiculoDAO.eliminar(vehiculoCVR.convertir_Entidad(vehiculoDTO));
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para eliminar un Actualizar.
     * 
     * @param vehiculoDTO Objeto de tipo Vehiculo a actualizar.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public void actualizar(VehiculoDTO vehiculoDTO) throws BisnessException {
        try{
            //eliminamos un vehiculo convirtiendolo de DTO a Entidad.
            this.vehiculoDAO.actualizar(vehiculoCVR.convertir_Entidad(vehiculoDTO));
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo para buscar un vehiculo dado su id.
     * 
     * @param id id del vehiculo a buscar.
     * @return retorna el vehiculo buscado.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public Vehiculo buscarPorId(int id) throws BisnessException {
        try{
           return this.vehiculoDAO. buscarPorId(id);
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }

    /**
     * Metodo que regresa la lista de los Vehiculos guardados.
     * 
     * @return Lista de Vehiculos.
     * @throws BisnessException arroja una excepcion proveniente de la clase DAO
     */
    @Override
    public List<VehiculoDTO> listaVehiculos() throws BisnessException {
        List<VehiculoDTO> listaDTO = new ArrayList(); 
        try{
            //Cargamos la lista de la clase DAO
            List<Vehiculo> lista = vehiculoDAO.listaVehiculos();
            
            //Cargamos los datos de la lista de entidades a una nueva de DTOs
            for (int i = 0; i < lista.size(); i++) {
                listaDTO.add(vehiculoCVR.convertir_DTO(lista.get(i)));
            }
            return listaDTO; // retornamos la nueva lista de DTOs obtenida
        }
        catch(DAOException e){
            throw new BisnessException(e.getMessage());
        }
    }
    
    /**
 * Método para buscar vehículos por tipo.
 * 
 * @param tipo Tipo de vehículo a buscar.
 * @return Lista de VehiculosDTO que coinciden con el tipo especificado.
 * @throws BisnessException arroja una excepción proveniente de la clase DAO
 */
@Override
public List<VehiculoDTO> buscarPorTipo(String tipo) throws BisnessException {
    List<VehiculoDTO> listaDTOPorTipo = new ArrayList<>();
    try {
        // Obtenemos la lista de vehículos del DAO
        List<Vehiculo> listaVehiculos = vehiculoDAO.buscarPorTipo(tipo);
        
        // Convertimos cada Vehiculo a VehiculoDTO y lo añadimos a la lista
        for (Vehiculo vehiculo : listaVehiculos) {
            listaDTOPorTipo.add(vehiculoCVR.convertir_DTO(vehiculo));
        }
        return listaDTOPorTipo;
    } catch (DAOException e) {
        throw new BisnessException("Error al buscar vehículos por tipo: " + e.getMessage());
    }
}
    
    
    
}
