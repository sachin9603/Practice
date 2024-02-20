package CustomerAPP.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	public static Connection provideConnection() {
		
		Connection conn   = null  ;
		// step 1
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver") ;
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// step 2 ;
		String url   = "jdbc:mysql://localhost:3306/CustomerAPP" ;
		
		
		try {
			conn = DriverManager.getConnection(url,"root" ,"1999") ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn  ;
		
	}
	// customer  --- we can create customer , you can do update , can delete also 
	
	
	// order ---- that customer can order some thing and 
	
	// admin(will not create ) ---- can check all orders 
	
	
}
