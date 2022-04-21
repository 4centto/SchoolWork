
package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection Conexion(){
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/horarios", "root", "");
            
            return cn;
            
        } catch(SQLException e){
            System.err.println("Error de conexion " + e);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        return (null);
    }
}
