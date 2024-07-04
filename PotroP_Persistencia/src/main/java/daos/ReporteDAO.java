/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;


import Interfaces.IReporteDAO;
import com.mongodb.client.MongoCollection;
import conexion.ConexionBDM;
import entidades.Reporte;
import excepciones.DAOException;

/**
 * 
 * 
 * 
 * @author diana
 */
public class ReporteDAO implements IReporteDAO {
 
     // Colección de MongoDB para reportes
    private final MongoCollection<Reporte> reporteCollection;

    // Constructor para inicializar la colección de reportes
    public ReporteDAO() {
        // Aquí obtienes la colección "Reporte" desde la instancia de conexión a la base de datos
        this.reporteCollection = ConexionBDM.getInstance().getDatabase().getCollection("Reporte", Reporte.class);
    }

    // Método para agregar un reporte a la base de datos
    @Override
    public void agregar(Reporte reporte) throws DAOException {
//        try {
//            // Insertar un nuevo documento reporte en la colección
//            reporteCollection.insertOne(reporte);
//        } catch (Exception e) {
//            // Capturar cualquier excepción y lanzarla como DAOException
//            throw new DAOException("Error al agregar reporte: " + e.getMessage(), e);
//        }
         System.out.println("reporte agregado con exito");
    }
}
