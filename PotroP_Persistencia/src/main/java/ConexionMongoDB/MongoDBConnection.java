/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionMongoDB;

/**
 *
 * @author caarl
 */
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static MongoDBConnection instance;
    private MongoClient mongoClient;
    private MongoDatabase database;

    // Constructor privado para el patrón Singleton
    private MongoDBConnection() {
        String uriString = "mongodb+srv://userCD1:Bi0log1a1@cluster0.ooz17g8.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        MongoClientURI uri = new MongoClientURI(uriString);
        this.mongoClient = new MongoClient(uri);
        this.database = mongoClient.getDatabase("PotroP"); 
    }

    // Método estático para obtener la instancia de la clase
    public static synchronized MongoDBConnection getInstance() {
        if (instance == null) {
            instance = new MongoDBConnection();
        }
        return instance;
    }

    // Método para obtener la instancia de MongoDatabase
    public MongoDatabase getDatabase() {
        return this.database;
    }

    // Método para cerrar la conexión
    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            database = null;
            instance = null;
        }
    }
}