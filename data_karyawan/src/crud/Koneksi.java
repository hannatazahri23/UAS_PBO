
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    private static Connection Koneksi;
    
    public static Connection getConnection() throws SQLException{
        String db = "jdbc:mysql://localhost:3306/dt_karyawan";
        String user = "root";
        String pass = "";
        
        if(Koneksi == null){
            Koneksi = DriverManager.getConnection(db, user, pass);
        }
        
        return Koneksi;
    } 
}
