package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2Prepared {

	
	
	public static void main(String[] args) {
	
		try ( Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_8511", "root", "root") ;
				){
			
			String query   = "insert into student values(?,?)" ;
			
			Scanner sc  = new Scanner(System.in) ;
			System.out.println("enter student id that you want to save ");
			
			int id  = sc.nextInt() ;
			
			System.out.println("enter student name that you want to save ");
			
			String name  = sc.next() ;

			PreparedStatement ps = con.prepareStatement(query) ;
			
			ps.setInt(1, id);
			ps.setString(2, name) ;
			
			int ans  = ps.executeUpdate();
	
			if (ans >0) {
				System.out.println("your data has been successfully inserted ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  ;
		
		
	}
}
