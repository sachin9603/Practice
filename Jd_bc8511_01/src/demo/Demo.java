package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) {
	
		
	// 1
	// 2  create connecction
		
		try ( 	
				Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_8511", "root", "root") ;
){
			
			// create statement  3
			
			Statement st  = con.createStatement() ;
			
			// executequery
			
	
			
		ResultSet rst  = 	st.executeQuery("select * from employee ") ;
		
		while(rst.next()) {
			
			System.out.println("id -" + rst.getInt(1) + " name --" +rst.getString(2));
		}
		// step 5
			
		con.close();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  ;
		
		
	}

}
