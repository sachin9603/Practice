package newDaoPattern.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	// Dao class is a signleton class so only one object can be created by this DAO Class
	
	
	/// 1 
	
	private static  Dao obj  = null ;

	
	// 2 
	private Dao() {} ;
	
	
	
	// 3 
	
	public  static Dao getDao() {
		
		if(obj == null) {
			obj  = new Dao()  ;
			
		}
		return obj  ;
		
	}
	
	
	
	
	public Connection getConnection()  {
		
		Connection con = null  ;
		
		try {
			 con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/basicpro","root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con ;
		
		

	}
	
	
 	
	
	
	

}
