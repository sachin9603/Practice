package feb14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import 	java.sql.Statement ;
import java.util.Scanner;


public class BasicCRUD2 {

	
	public static void main(String[] args) {
		
		try {
				// step two -- creating a connection 
				
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sage","root","1999");
				
			
			System.out.println(" now you have get data of one student form  table");
			Scanner sc = new Scanner(System.in) ;
			System.out.println("write one roll number ");
		int roll = sc.nextInt() ;
		String sqlQuery = "select * from student where roll_number = "+roll;
		
		Statement  ppst  = con.createStatement();
		
		ResultSet  result  = ppst.executeQuery(sqlQuery);
		if(result.next()) {
		
		int rolNumber  = result.getInt("roll_number") ;
		String name  = result.getString("name");
		
		double per = result.getDouble("percentage");
		
		String address  = result.getString("address");

		System.out.println(rolNumber);
		System.out.println(name);
		System.out.println(per);
		System.out.println(address);
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
