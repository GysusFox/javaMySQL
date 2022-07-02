package src;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.*;
import javax.swing.JOptionPane;

public class CConexion {
    public MongoClient crearConexion(){
        MongoClient mongo = null;  
        String servidor = "mongodb+srv://TheYisus:ProyectosAlfonzo2022@cluster0.vups0un.mongodb.net";
        Integer puerto = 27017;
        try{
            mongo = new MongoClient(servidor,puerto);
            List<String> databaseNames = mongo.getDatabaseNames();
            
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a MongoDB, la lista de bases de datos disponiblies son: " + databaseNames.toString());
        } catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MongoDB, error: " + e.toString());
        }
        return mongo;
    }
}
