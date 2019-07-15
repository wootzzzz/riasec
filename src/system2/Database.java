
package system2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private  String url = "jdbc:mysql://localhost/";    
    private String dbName = "student_attendance";
    private  String driver = "com.mysql.jdbc.Driver"; 
    private  String username = "root";   
    private  String password = "";
    private Connection con;
    private  String urlstring = url+dbName;

    public Connection getConnection() {
        try {
            Class.forName(driver);
            try {
                con = (Connection)DriverManager.getConnection(urlstring, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return con;
    }
}
