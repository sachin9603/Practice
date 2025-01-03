package studentManagementSystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	
	// again and again creating object of this class can slow my program 
	// because this class is creating connection with database and it is a heavy process 
	// so i will avoid creating object again and again intead of this i will only one object and will use again and again 
	
	
	private static Dao singleInstance =  null  ;
	
	private Dao() {
		
	}
	
	public static Dao getInstance() {
		
		if (singleInstance ==  null ) {
			singleInstance  = new Dao()   ;
		}
	return singleInstance  ;
		
	}
	
	public Connection getConnection() throws SQLException {
		
		Connection  con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/anpc8336","root", "root") ;
     return con  ;
		
	}
	
	
	
	
	
	

}
