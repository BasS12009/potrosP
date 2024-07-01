/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import Interfaces.IConexion;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;



/**
 *
 * @author skevi
 */
public class ConexionBD implements IConexion{

     private static ConexionBD instance;
    private MongoClient mongoClient;
    private final String direccion = "mongodb://localhost:27017/";
    private final String nombreBD = "PotroP";

    private ConexionBD() {
        // Configuración del codec para manejar POJOs
        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );

        // Configuración de los ajustes del cliente MongoBD
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
}
    
    
    

