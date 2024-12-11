package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo22 {

	

	public static void main(String[] args) {
		

	
	
		
		// step 1 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// step 2
		try {
			Connection  con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/anpc8336","root", "root") ;
			
			// step 3 
			
			Statement st  = con.createStatement() ;
			
			// step 4
			ResultSet rs = st.executeQuery("select * from employee") ;
			
			// rs.next() -- if there are rows so it will give true
			while(rs.next()) {
				
				System.out.println("ID- "+ rs.getInt(1)+ " EmpName-"  + rs.getString(2) );
			}
			
			// step 5
			con.close() ;
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
