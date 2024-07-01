/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;


import Interfaces.IReporteDAO;
import com.mongodb.client.MongoCollection;
import conexion.ConexionBD;
import entidades.Reporte;
import entidades.Traslado;
import excepciones.DAOException;

/**
 * 
 * 
 * 
 * @author diana
 */
public class ReporteDAO implements IReporteDAO {
 
    private final MongoCollection<Reporte> reporteCollection;

    public ReporteDAO() {
        this.reporteCollection = ConexionBD.getInstance().getDatabase().getCollection("Reporte", Reporte.class);
    }



    @Override
  public void agregar(Reporte reporte) throws DAOException {
        try {
            reporteCollection.insertOne(reporte);
        } catch (Exception e) {
            throw new DAOException("Error al generar traslado" + e);
        }
    
}
}
