import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexionSQL {
   static Connection conectar = null; 
   
   public static Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conectar=DriverManager.getConnection("jdbc:mysql://localhost/ciecas","root","root");
            System.out.println("Exito en la conexion!");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
   
   
}
