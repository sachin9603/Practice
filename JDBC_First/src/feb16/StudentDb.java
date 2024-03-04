package feb16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class StudentDb {
	
	private static Connection connection  = null  ;
	
	private static Scanner scan  = new Scanner(System.in) ;
	
	
	
	public static void main(String[] args)  {
		
		StudentDb  db  = new StudentDb() ;
		
		try {
		//	Class.forName("com.mysql.cj.jdbc.Driver") ; // pehli step 
			
			String databaseURL  = "jdbc:mysql://localhost:3306/nri" ;
			String userName  = "root" ;
			String password  =  "1999" ;
			
			try {
				Connection connection= DriverManager.getConnection(databaseURL , userName  , password) ;
			
			System.out.println("Enter your choice to perform your task ");
			
			System.out.println(" 1  for inserting the data ");
			System.out.println(" 2  for getting the data of one Student ");
			
			int choice  = Integer.parseInt(scan.nextLine()) ;
			
			switch(choice) {
			case 1  :
				db.insertdata() ;
				break ;
				
			case 2  :
				db.getSingleData() ;
				break ;
				
				
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void insertdata () throws SQLException {
		// System.out.println("insert method is getting called ");
		String query  = "insert into student (name, percentage , address) values(?,?,?)" ;
		
		PreparedStatement prep  =  connection.prepareStatement(query) ;
		
		System.out.println("Enter name of student ");
		
		prep.setString(1, scan.nextLine());
		
        System.out.println("Enter percentage of student ");
		
		prep.setDouble(2, Double.parseDouble(scan.nextLine()));
		
         System.out.println("Enter Address of student ");
		
		prep.setString(3, scan.nextLine());
		
		
		int row  = prep.executeUpdate();
		
		if (row > 0) {
			System.out.println("data get inserted ");
		}
	}
	
	public void getSingleData() throws SQLException {
		// target yehai ki data get karu and ek obj mai set karke dedu 
		
      System.out.println("1 for if you want to get data from name ");
      System.out.println("2 for if you want to get data from Rollnumebr ");
      
      int choice = scan.nextInt() ;
      if( choice == 1) {
    	  
    	  System.out.println("rajaj");
    	  //scan.next()  ;
    	  
        String namee  = scan.next() ;
        namee  = "'"+namee +"'" ;
        
    	 
    	 String sql  = "select * from student where name = "+namee ;
    	 
    	 Statement statement  = connection.createStatement();
    	 
    	 ResultSet result   = statement.executeQuery(sql) ;
    	 
    	 while(result.next()) {
    		 
    		 int roll  = result.getInt("roll_number") ;
    		 
    		 String  name  = result.getString("name") ;
    		 
    		 String percent = result.getString("percentage") ;
    		 
    		 String address = result.getString("address") ;
    		 
    		 System.out.println(" roll number is " +  roll );
    		 System.out.println(" name  is " +  name );
    		 System.out.println(" percentage  number is " + percent );
    		 System.out.println(" Address number is " +  address ) ; 
    		 
    		 
    	 }
    	 
    	 System.out.println("last linne");
    	  
    	  
      }else  if( choice == 2) {
       	  
       	  System.out.println("enter roll numnber ");
       	  //scan.next()  ;
       	  
           int roll  = scan.nextInt() ;
           
           
       	 
       	 String sql  = "select * from student where roll_number = "+roll ;
       	 
       	 Statement statement  = connection.createStatement();
       	 
       	 ResultSet result   = statement.executeQuery(sql) ;
       	 
       	 while(result.next()) {
       		 
       		 int rolll  = result.getInt("roll_number") ;
       		 
       		 String  name  = result.getString("name") ;
       		 
       		 String percent = result.getString("percentage") ;
       		 
       		 String address = result.getString("address") ;
       		 
       		 System.out.println(" roll number is " +  rolll );
       		 System.out.println(" name  is " +  name );
       		 System.out.println(" percentage  number is " + percent );
       		 System.out.println(" Address number is " +  address ) ; 
       		 
       		 //sachin
       		 
       	 }
      
	}
	
	
	}
}
