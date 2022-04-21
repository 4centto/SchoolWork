package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    //Conexion Local
    public static Connection conectar(){
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
            return cn;
            
        } catch(SQLException e){
            System.out.println("ERROR en conexion local" + e);
        }
        return (null);
    }
    
}
