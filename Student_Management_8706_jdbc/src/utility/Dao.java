package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	

	// singleton class -- essi class jiska ek obj banega 
	
	
	 String url  = "jdbc:mysql://localhost:3306/anp8706";
	 String dbname  = "root" ;
	 String dbpass  = "root" ;
		
	 
	 // isi class ka cont private ---
	private Dao() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		}
	
	
	
	
	private static Dao  connectionFactory = null  ;
	
	
	public static Dao getConnectionFactory() {
		if ( connectionFactory  ==  null) {
		   connectionFactory   = new  Dao() ;
		}
		return connectionFactory ;
	}
	
	
	
	public Connection getConnection() throws SQLException {
		
		Connection con = DriverManager.getConnection(url, dbname, dbpass) ;
		
		
		return con  ;
		
	}
	
	
	

	

}
