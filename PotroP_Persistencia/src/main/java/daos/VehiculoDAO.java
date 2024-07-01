/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Interfaces.IVehiculoDAO;
import com.mongodb.client.MongoCollection;
import conexion.ConexionBD;
import entidades.Vehiculo;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class VehiculoDAO implements IVehiculoDAO{
     private final MongoCollection<Vehiculo> vehiculoCollection;

    public VehiculoDAO() {
        this.vehiculoCollection = ConexionBD.getInstance().getDatabase().getCollection("Vehiculo", Vehiculo.class);
    }

    @Override
    public void agregar(Vehiculo vehiculo) throws DAOException {
        try {
            vehiculoCollection.insertOne(vehiculo);
        } catch (Exception e) {
            throw new DAOException("Error al ingresar vehiculo" + e);
        }
    }

   


    @Override
    public List<Vehiculo> obtenerTodos() throws DAOException {
        try {
            List<Vehiculo> vehiculos = new ArrayList<>();
            vehiculoCollection.find().into(vehiculos);
            //transformar a los nuevos objetos
            return vehiculos;
        } catch (Exception e) {
            throw new DAOException("Error al obtener todos los vehiculos: " + e.getMessage(), e);
        }
    }

}
