/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 *
 * @author caarl
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import entidades.Maestro;
import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.List;

public class MaestroDAO {
    private final MongoCollection<Maestro> collection;

    public MaestroDAO(MongoDatabase database) {
        this.collection = database.getCollection("maestros", Maestro.class);
    }

    public void insert(Maestro maestro) {
        collection.insertOne(maestro);
    }

    public Maestro findById(ObjectId id) {
        return collection.find(Filters.eq("_id", id)).first();
    }

    public List<Maestro> findAll() {
        List<Maestro> maestros = new ArrayList<>();
        collection.find().into(maestros);
        return maestros;
    }

    public void update(Maestro maestro) {
        UpdateResult result = collection.replaceOne(Filters.eq("_id", maestro.getId()), maestro);
    }

    public void delete(ObjectId id) {
        DeleteResult result = collection.deleteOne(Filters.eq("_id", id));
    }
}