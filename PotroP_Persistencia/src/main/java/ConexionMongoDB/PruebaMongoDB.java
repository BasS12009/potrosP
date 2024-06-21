/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConexionMongoDB;

/**
 *
 * @author caarl
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class PruebaMongoDB {
    public static void main(String[] args) {
        ConexionMongoDB conexion = ConexionMongoDB.getInstance();
        MongoDatabase database = conexion.getDatabase();
        
        if (database != null) {
            try {
                // Crear una colección de prueba
                MongoCollection<Document> collection = database.getCollection("pruebaColeccion");
                
                // Crear un documento de prueba
                Document documento = new Document("nombre", "Prueba")
                        .append("valor", 42);
                
                // Insertar el documento
                collection.insertOne(documento);
                System.out.println("Documento insertado con éxito.");
                
                // Recuperar y mostrar el documento
                Document recuperado = collection.find(new Document("nombre", "Prueba")).first();
                if (recuperado != null) {
                    System.out.println("Documento recuperado: " + recuperado.toJson());
                }
                
                // Eliminar el documento de prueba
                collection.deleteOne(new Document("nombre", "Prueba"));
                System.out.println("Documento eliminado con éxito.");
                
            } catch (Exception e) {
                System.err.println("Error durante la prueba: " + e.getMessage());
            } finally {
                conexion.close();
            }
        } else {
            System.err.println("No se pudo establecer la conexión a la base de datos.");
        }
    }
}