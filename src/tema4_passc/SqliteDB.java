package tema4_passc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.*;

public class SqliteDB {

	    public static Connection connect() {
	        
	    	Connection con = null;
	            try{
	                //String dir = System.getProperty("user.dir");
	                Class.forName("org.sqlite.JDBC");
	                con = DriverManager.getConnection("jdbc:sqlite:sqlite:horoscopNoteStudenti.db");
	                
	            }
	            catch(ClassNotFoundException | SQLException e){
	                JOptionPane.showMessageDialog(null,"Problem with connection of database");
	                return null;
	            }
	            return con;
	    }
	    
	    public void createNewDatabase() {

	        String url = "jdbc:sqlite:sqlite:horoscopNoteStudenti.db";

	        try (Connection conn = DriverManager.getConnection(url)) {
	            if (conn != null) {
	                DatabaseMetaData meta = conn.getMetaData();
	                System.out.println("The driver name is " + meta.getDriverName());
	                System.out.println("A new database has been created.");
	            }

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    /**
	     * @param args the command line arguments
	     */

	}
