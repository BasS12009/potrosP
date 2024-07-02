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
    
    // Colección de MongoDB para vehículos
     private final MongoCollection<Vehiculo> vehiculoCollection;

     // Constructor para inicializar la colección de vehículos
    public VehiculoDAO() {
         // Aquí se obtiene la colección "Vehiculo" desde la instancia de conexión a la base de datos
        this.vehiculoCollection = ConexionBD.getInstance().getDatabase().getCollection("Vehiculo", Vehiculo.class);
    }
    // Método para agregar un vehículo a la base de datos
    @Override
    public void agregar(Vehiculo vehiculo) throws DAOException {
        try {
            // Insertar un nuevo documento vehiculo en la colección
            vehiculoCollection.insertOne(vehiculo);
        } catch (Exception e) {
            // Capturar cualquier excepción y lanzarla como DAOException
            throw new DAOException("Error al ingresar vehiculo" + e);
        }
    }

   

// Método para obtener todos los vehículos de la base de datos
    @Override
    public List<Vehiculo> obtenerTodos() throws DAOException {
        try {
            List<Vehiculo> vehiculos = new ArrayList<>();
            // Obtener todos los documentos de la colección y convertirlos a objetos Vehiculo
            vehiculoCollection.find().into(vehiculos);
            //transformar a los nuevos objetos
            return vehiculos;
        } catch (Exception e) {
            // Capturar cualquier excepción y lanzarla como DAOException
            throw new DAOException("Error al obtener todos los vehiculos: " + e.getMessage(), e);
        }
    }

}
