package mainmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println(" hello world ");
		
		///first step  
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver") ;
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// second setp
		// url, username  , ppassword  
		String url  = "jdbc:mysql://localhost:3306/NRI" ;
		
		String username  = "root" ;
		
		String password  = "1999";
		
		

		
		try {
			Connection connection  = DriverManager.getConnection(url, username, password) ;
			Scanner sc = new Scanner(System.in) ;
			
			System.out.println("Enter the name of student " );
			
			String  name  = sc.next() ;
			
System.out.println("Enter the marks of student " );
			
			int  marks  = sc.nextInt() ;
			
System.out.println("Enter the Address of student " );
			
			String  address  = sc.next() ;
			
			
			
			String query  = "insert into student (sname, smarks , saddress) values (? ,?, ?) " ;
			
			// steps  3 
			PreparedStatement  ps  = connection.prepareStatement(query) ;
			ps.setString(1, name);
			ps.setInt(2, marks);
			ps.setString(3, address);
			
			// step 4 
			int row  =  ps.executeUpdate() ;
			
			if(row >0) {
				System.out.println("data get inserted successfully ");
			}
			
			
			connection.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
