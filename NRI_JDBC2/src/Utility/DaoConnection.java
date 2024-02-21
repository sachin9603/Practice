package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConnection {
	
	public static Connection provideConnection() {
		Connection con  = null  ;
		String url  = "jdbc:mysql://localhost:3306/NRI" ;
		try {
			con = DriverManager.getConnection(url,"root" ,"1999") ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con ;
	}

}
