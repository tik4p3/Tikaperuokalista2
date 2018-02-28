package tikape.runko.domain;

import java.sql.*;

public class Database {



    public Database ()  {
        
    }
    
    public Connection getConnection() throws SQLException{
        
        String dbUrl = System.getenv("JDBC_DATABASE_URL");
        
        
        if (dbUrl != null && dbUrl.length() > 0) {
            
            Connection connection = DriverManager.getConnection(dbUrl);
            
            System.out.println("otettiin yhteys Herokun tietokantaan");
            
            return connection;
        }
        
        Connection connection = DriverManager.getConnection("jdbc:sqlite:kirja.db");
        
        System.out.println("otettiin yhteys SQLite-tietokantaan (kirja.db)");
        
       

        return connection;
    }
    
}