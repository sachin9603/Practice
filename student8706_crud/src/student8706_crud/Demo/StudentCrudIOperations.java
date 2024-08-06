package student8706_crud.Demo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student8706_crud.utility.ConnectionFactory;

public class StudentCrudIOperations {
	
	
	
	
	public void addStudent(Student s ) {
		
		try {
			Connection c  = ConnectionFactory.getConnectionFactory().getConnection() ;
			
			PreparedStatement ppst  = c.prepareStatement("insert into student values(?, ? ,?)") ;
			
			ppst.setInt(1, s.getStudent_id());
			ppst.setString(2, s.getStudent_name()) ;
			ppst.setInt(3,  s.getStudent_id()) ;
			
			int ans  = ppst.executeUpdate() ;
			
			if (ans!= 0) {
				System.out.println("data got inserted succesfully ");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	public static void main(String[] args) {
		
		StudentCrudIOperations s  = new StudentCrudIOperations ()  ;
		
		s.addStudent(new Student(34343 , "ShreeRam", 700) );
	}
}
