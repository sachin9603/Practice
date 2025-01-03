package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation {
	
	
	public static void main(String[] args) {
		
		
		// 1 in latest feature no need to write this first step 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2 create connection 
		
		try {
			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/anpc8336","root" , "root") ;
			
			
			// 3 create statement 
			
			Statement stmt  =  con.createStatement() ;
			

			// 4 execute query 
			
			ResultSet rs  = stmt.executeQuery("select * from Student") ;
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+rs.getString(3));
			}
			
			// 5 close the connection 
			con.close() ;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
		
		// 5 close the connection 
		
		
		
		
		
		
		
	}

}
