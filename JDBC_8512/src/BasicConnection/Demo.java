package BasicConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		
		/// step 1   load  Driver 
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// step 2 get Connection 
		
		
		try {
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/basicpro","root", "root");
			
			// statemet yaa prepared statement ka obj
			Statement st  = con.createStatement();
			
			//4 it is a object 
			ResultSet rs =  st.executeQuery("select * from standard") ;
			
			
			while(rs.next()) {
				
				
				System.out.println(rs.getInt(1)+ " class name " +  rs.getString(2) + " section "+  rs.getString(3) );
				
				
			}
			
			System.out.println();
			
			// 5
			con.close()  ;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
