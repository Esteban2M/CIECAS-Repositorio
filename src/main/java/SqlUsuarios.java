import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SqlUsuarios extends conexionSQL{
    
    public boolean login(usuarios usr){
        PreparedStatement ps = null;
        ResultSet rs =null;
        Connection con = conexion();
        
        String sql = "SELECT ID_Usr, Nomb_Usr,Contr_Usr,US_Usr,ID_TUR FROM usuarios WHERE Nomb_Usr = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                rs = ps.executeQuery();
                
                if(rs.next()){
                    if(usr.getPassword().equals(rs.getString(3))){
                        
                        usr.setId(rs.getInt(1));
                       
                        usr.setId_tipo(rs.getInt(4));
                        return true;
                    }else{
                    return false;
                    }
                }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
   
}
