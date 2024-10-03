package BaiscCrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// this is very simple crud operation only
public class StudentCrud {
	
	
	
	
	
	
	public Connection getConnection() throws SQLException {
		Connection conn  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/anp8648_8314"
				+ "","root","root") ;

		return conn ;
	}
	
	public void addStudent(Student bean) {
		// static query 
		//String  query  = "insert into studentJD (id  , name  , address) values ( '12' ,'Sachin' , 'Inodre')" ;
		
	String query =  "insert into studentJd(id  , name  , address) values (?, ? ,?)" ;
		
		
		try {
			Connection conn  = getConnection() ;
		//	Statement stmt=conn.createStatement();  
			//int rowhampered = stmt.executeUpdate(query)  ;
			
			PreparedStatement ppst  = conn.prepareStatement(query);
			
			ppst.setInt(1, bean.getStudentId());
			ppst.setString(2, bean.getStudentName());
			ppst.setString(3, bean.getAddress());
			
			int rowhampered = ppst.executeUpdate() ;
			
			
			  
			
			
			if (rowhampered >  0) {
			 System.out.println("data updated successfully ");
			}
			
			ppst.close();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void updateStudent(Student st) {
		
		String query  = "update studentjd set address = ? where id  = ? " ;
		
		try {
			Connection conn  = getConnection() ;
		//	Statement stmt=conn.createStatement();  
			//int rowhampered = stmt.executeUpdate(query)  ;
			
			PreparedStatement ppst  = conn.prepareStatement(query);
			ppst.setInt(2, st.getStudentId());
			//ppst.setString(2, bean.getStudentName());
			ppst.setString(1, st.getAddress());
			
			int rowhampered = ppst.executeUpdate() ;
			
			
			  
			
			
			if (rowhampered >  0) {
			 System.out.println("data updated successfully ");
			}
			
			ppst.close();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		StudentCrud obj  = new StudentCrud() ;
		
		Scanner sc  = new Scanner(System.in) ;
	
			System.out.println("Welcome to student mangement System")  ;
			
			
			while(true) {
				
				System.out.println("press 1 for adding student  \n"
						+ "press 2 for updating existing data \n"
						+ "press 0 for exit ");
				
				
				int choice  = sc.nextInt() ;
				
				switch(choice){
				case 1 :
					Student s  = new Student() ;
					
					System.out.println("Enter your id ");
				    s.setStudentId(sc.nextInt());
				    
				    
				    System.out.println("Enter your name ");
					s.setStudentName(sc.next());
				    
					System.out.println("Enter your address");
					String add  = sc.next() ;
				     s.setAddress(add);
				     obj.addStudent(s);
				     break  ;
				     
				case 2 :
					
                   Student s2  = new Student() ;
					
					System.out.println("Enter your id ");
				    s2.setStudentId(sc.nextInt());
				    
				    System.out.println("Enter your address");
					 s2.setAddress(sc.next() );
				     obj.updateStudent(s2);
				     break  ;
				     
							
				case 0:
					
					System.exit(0);
					break ;
				}
				
			}
			
			
			
			
			
		
		
		//obj.addStudent(null);
		
	}

}
