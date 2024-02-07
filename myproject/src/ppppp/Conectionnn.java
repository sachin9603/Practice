package ppppp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectionnn {
	
	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/VIVO","root","1999");
			
			System.out.println("connection created ");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
