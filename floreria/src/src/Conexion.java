package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://181.171.132.189:80/floreria_store";
    
    public Conexion(){
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.println("Conexion establecida!!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar!! | " + e);
        }
    }
    
    // tomamos la conexion de la base de datos 
    public Connection getConnection(){
        return conn;
    }
    
    // CERRAR LA CONEXION A LA BASE DE DATOS
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion cerrada!!");
        }
    }
}
