/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;
import Interfaces.IPrestamoMaestrosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import entidades.PrestamoMaestros;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class PrestamoMaestrosDAO implements IPrestamoMaestrosDAO {

    private final MongoCollection<PrestamoMaestros> collection;

    public PrestamoMaestrosDAO(MongoDatabase database) {
        this.collection = database.getCollection("prestamoMaestros", PrestamoMaestros.class);
    }

    @Override
    public String save(PrestamoMaestros prestamo) {
        collection.insertOne(prestamo);
        return prestamo.getId();
    }

    @Override
    public PrestamoMaestros findById(String id) {
        return collection.find(Filters.eq("_id", new ObjectId(id))).first();
    }

    @Override
    public List<PrestamoMaestros> findAll() {
        List<PrestamoMaestros> prestamos = new ArrayList<>();
        collection.find().into(prestamos);
        return prestamos;
    }

    @Override
    public void update(PrestamoMaestros prestamo) {
        collection.replaceOne(Filters.eq("_id", new ObjectId(prestamo.getId())), prestamo);
    }

    @Override
    public void delete(String id) {
        collection.deleteOne(Filters.eq("_id", new ObjectId(id)));
    }
}