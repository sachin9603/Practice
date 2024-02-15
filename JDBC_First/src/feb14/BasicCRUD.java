package feb14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import 	java.sql.Statement ;
import java.util.Scanner;


public class BasicCRUD {

	
	public static void main(String[] args) {
		
		// first Step
		//try {
		//	Class.forName("com.mysql.jdbc.Driver") ;
			try {
				// step two -- creating a connection 
				
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sage","root","1999");
				
				
				
				String sql  = "insert into student(name , percentage, address) values(?, ? ,?)";
				
			PreparedStatement stmnt = con.prepareStatement(sql);
			
			System.out.println(" now you have insert data into student table");
			
			System.out.println(" first insert name of student ");
			Scanner sc  = new Scanner(System.in) ;
			
			stmnt.setString(1, sc.nextLine());
			System.out.println("insert percentage of student ");
			stmnt.setDouble(2, Double .parseDouble(sc.nextLine()));
			System.out.println("insert  address of student ");
			stmnt.setString(3, sc.nextLine());
			
				
			int rows = stmnt.executeUpdate() ;
			if(rows>0) {
				System.out.println("data get inserted ");
			}
			
				System.out.println("sachin");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
