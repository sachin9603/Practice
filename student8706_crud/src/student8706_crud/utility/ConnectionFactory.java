package student8706_crud.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory  {
 
	// singleton class -- essi class jiska ek obj banega 
	
	
	 String url  = "jdbc:mysql://localhost:3306/anp8706";
	 String dbname  = "root" ;
	 String dbpass  = "root" ;
		
	 
	 // isi class ka cont private ---
	private ConnectionFactory() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		}
	
	
	
	
	private static ConnectionFactory  connectionFactory = null  ;
	
	
	
	

	public static ConnectionFactory getConnectionFactory() {
		if ( connectionFactory  ==  null) {
			
			 connectionFactory   = new  ConnectionFactory() ;
			 
		}
		return connectionFactory ;
	}
	
	
	
	public Connection getConnection() throws SQLException {
		
		Connection con = DriverManager.getConnection(url, dbname, dbpass) ;
		
		
		return con  ;
		
	}
	
	
	

}
