package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import src.Conexion;

public class Main {
    static Conexion con;
    static Statement stmt = null;
    
    public static void main(String[] args) throws SQLException {
        con = new Conexion();
        Connection reg = con.getConnection();
        
        JFrame inicio = new Inicio();
        inicio.setVisible(true);
        
        stmt = reg.createStatement();
        stmt.executeUpdate("INSERT INTO `usuarios`(`nombre`) VALUES('pedro')");
    }
}
