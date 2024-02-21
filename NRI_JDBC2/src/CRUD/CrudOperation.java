package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.Statement;

import Utility.DaoConnection;
import Utility.QueryUtil;

public class CrudOperation {
	
	static CrudOperation crud = new CrudOperation() ;
	
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flg  = true  ;
		
		while (flg) {
		System.out.println("Enter your choice ");
		System.out.println(" 1 for inserting data ");
		System.out.println(" 2 for getting  alldata ");
		System.out.println(" 3 for delete student by id ");
		System.out.println(" 4 for get first rank citywise ");
		System.out.println(" 5 for update  student by id  ");
		System.out.println(" 6 for exit ");
		
		int choice = sc.nextInt() ;
		
		switch(choice) {
		case 1 :
			crud.insertData() ;
			break ;
			
		case 2 :
			crud.getAllData() ;
			break ;
		case 6 :
			flg = false ;
			
		System.out.println("Thanks for visiting .....");
			
			break ;
		}
		}
	}
	
	public void insertData() {
	
		
		try(Connection con   = DaoConnection.provideConnection()) {
			//String url =  "insert into student(sname, smarks , saddress) values (?,?,?)";

			PreparedStatement ps  = con.prepareStatement(QueryUtil.insertStudent());
			
			System.out.println("Enter student name "); 
			ps.setString(1, sc.next());
			
			System.out.println("Enter student marks "); 
			ps.setInt(2, sc.nextInt());
			
			System.out.println("Enter student Address "); 
			ps.setString(3, sc.next());
			
			int row = ps.executeUpdate() ;
			
			if (row>0) {
			System.out.println("student has been inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void getAllData() {
		
		try(Connection con  = DaoConnection.provideConnection()){
			 Statement st  =  con.createStatement() ;
			 ResultSet rs  = st.executeQuery(QueryUtil.getAllStudent());
			 
			 while (rs.next()) {
				String name   = rs.getString("sname") ;
				
				int marks = rs.getInt("smarks") ;
				
				String address = rs.getString("saddress") ;
				
				System.out.println("Student " + name + " "+marks+ " " +address);
				
			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
