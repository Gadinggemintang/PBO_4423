package database;
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseSewaBuku {
	
	public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_sewabuku", "root", ""); 
            return connection;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak Dapat Tersambung Database");
            return null;
        }
    }
}
