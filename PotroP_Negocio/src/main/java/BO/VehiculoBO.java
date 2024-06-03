/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Converters.VehiculoCVR;
import DTO.VehiculoDTO;
import Exceptions.BisnessException;
import Interfaces.IVehiculoDAO;
import daos.VehiculoDAO;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase implementa los elementos de IVehiculosDAO para su uso en capas
 * posteriores.
 * 
 * @author diana
 */
public class VehiculoBO {
    
    //inicializamos varibles de clase 
    private IVehiculoDAO vehiculoDAO; //instancia de la clase DAO
    private VehiculoCVR vehiculoCVR; // intancia de la clase de convertidores

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
    
}
