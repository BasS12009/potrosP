/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import entidades.PrestamoMaestro;

import java.util.ArrayList;
import java.util.List;

public class PrestamoMaestroDAO {
    private final MongoCollection<PrestamoMaestro> collection;

    public PrestamoMaestroDAO(MongoDatabase database) {
        this.collection = database.getCollection("prestamos", PrestamoMaestro.class);
    }

    // Método para insertar un nuevo prestamo
    public void insert(PrestamoMaestro prestamoMaestro) {
        collection.insertOne(prestamoMaestro);
    }

    // Método para encontrar un prestamo por correo del responsable
    public PrestamoMaestro findByCorreoResponsable(String correoResponsable) {
        return collection.find(Filters.eq("correoResponsable", correoResponsable)).first();
    }

    // Método para encontrar todos los prestamos
    public List<PrestamoMaestro> findAll() {
        List<PrestamoMaestro> prestamos = new ArrayList<>();
        collection.find().into(prestamos);
        return prestamos;
    }

    // Método para actualizar un prestamo existente
    public void update(PrestamoMaestro prestamoMaestro) {
        UpdateResult result = collection.replaceOne(Filters.eq("correoResponsable", prestamoMaestro.getCorreoResponsable()), prestamoMaestro);
    }

    // Método para eliminar un prestamo por correo del responsable
    public void delete(String correoResponsable) {
        DeleteResult result = collection.deleteOne(Filters.eq("correoResponsable", correoResponsable));
    }
}