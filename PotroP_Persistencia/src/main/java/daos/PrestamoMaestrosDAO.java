/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;


import Interfaces.IPrestamoMaestrosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.ConexionBD;
import entidades.PrestamoMaestros;
import excepciones.DAOException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class PrestamoMaestrosDAO implements IPrestamoMaestrosDAO{
    
    private final MongoCollection<PrestamoMaestros> prestamoMaestrosCollection;
  
    public PrestamoMaestrosDAO() {
        this.prestamoMaestrosCollection = ConexionBD.getInstance().getDatabase().getCollection("Prestamos", PrestamoMaestros.class);
    }
    
    
    @Override
    public void agregar(PrestamoMaestros prestamoMaestros) throws DAOException {
        try {
           prestamoMaestrosCollection.insertOne(prestamoMaestros);
        } catch (Exception e) {
            throw new DAOException("Error interno al agregar el préstamo de maestros: " + e);
        }
    }


   
    @Override
    public PrestamoMaestros buscarPorId(ObjectId id) throws DAOException {
         try {
            return prestamoMaestrosCollection.find(Filters.eq("id", id)).first();
        } catch (Exception e) {
            throw new DAOException("Error al obtener el préstamo de maestros: " + e.getMessage());
        }
    }


    @Override
    public List<PrestamoMaestros> listaPrestamosMaestros() {
        try {
            List<PrestamoMaestros> prestamoMaestros = prestamoMaestrosCollection.find().into(new ArrayList<>());
            System.out.println("Prestamo de maestros obtenidos correctamente: " + prestamoMaestros);
            return prestamoMaestros;
        } catch (Exception e) {
            System.err.println("Error al obtener todos los prestamos: " + e.getMessage());
            return null;
        }
    }
    
    
}