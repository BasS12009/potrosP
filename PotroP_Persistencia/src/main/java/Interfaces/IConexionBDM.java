/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;



/**
 *
 * @author diana
 */
import com.mongodb.client.MongoDatabase;

public interface IConexionBDM {
    MongoDatabase getDatabase();
}