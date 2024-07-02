/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import conexion.ConexionBD;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class ConexionBDPrueba {

    private static ConexionBD instance;
    private MongoClient mongoClient;
    private final String direccion = "mongodb://localhost:27017/";
    private final String nombreBD = "PotroP";

    private ConexionBDPrueba() {
         //Configuración del codec para manejar POJOs
        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );

        // Configuración de los ajustes del cliente MongoDB
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(new com.mongodb.ConnectionString(direccion))
                .codecRegistry(pojoCodecRegistry)
                .build();

        // Asignación de los ajustes al MongoClient
        mongoClient = (MongoClient) MongoClients.create(clientSettings);
    }

    public static ConexionBD getInstance() {
        if (instance == null) {
            synchronized (ConexionBD.class) {
                if (instance == null) {
                    instance = new ConexionBD();
                }
            }
        }
        return instance;
    }

    public MongoDatabase getDatabase() {
        return mongoClient.getDatabase(nombreBD);
    }

    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        ConexionBD conexion = ConexionBD.getInstance();
        MongoDatabase database = conexion.getDatabase();
        System.out.println("Conexión exitosa a la base de datos: " + database.getName());
     
    }
}
