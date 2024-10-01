package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class BasicConn {
	
	
	public static void main(String[] args) {
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ANp_C9284","root","root") ;
			Statement st  = con.createStatement() ;
			ResultSet  rs  = st.executeQuery("select * from Employees");
			
		while(rs.next())	{
			System.out.println( "ID  ->"+rs.getInt(1) +" name -->" + rs.getString(2) + " salary " +rs.getInt(3) );
			
		}
			
		con.close()	 ;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
	}

}
