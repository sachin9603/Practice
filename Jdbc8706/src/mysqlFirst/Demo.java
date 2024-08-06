package mysqlFirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Student;

public class Demo {
	
	// for intellije  ---- > file  ->  project strusture   ->  modules  -> dependencies  -->  then click on plus icone  and  add jar 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("welcome");
		
		ArrayList<Student> listOfStudent = new ArrayList<>() ;
		
		//step 1  
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		//step 2  
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"apke database ka naam ", "Username", "Password") ;

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp8706", "root", "root") ;
			
			// step 3 	
			Statement st  = 	con.createStatement();
			// step 4  
			ResultSet  rs  = st.executeQuery("select * from student"); ;
			 // if there is data inside the  ResultSet then it will return true 
			while(rs.next()) {
				
				listOfStudent.add(new Student(rs.getInt(1) ,rs.getString(2 ) ,rs.getInt(3) )) ;
				//System.out.println(   "student "+ rs.getInt(1) +" " +rs.getString(2 )+" " +rs.getInt(3) +" " + rs.getString(4)+" " +rs.getString(5));
			}                                       /// fist coloumn mai jo data hai vo int  
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// method referance 
		
		//listOfStudent.forEach(System.out::println) ;
		
		System.out.println(listOfStudent);
	
		
		
		

	}

}
