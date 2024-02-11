package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDB {
	
	private static Connection connection  =   null  ;
	
	  private static Scanner sc  = new Scanner(System.in) ;
	  

	
	public static void main(String[] args) {
		
		StudentDB  sdb  = new  StudentDB() ;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String  dbURL   = "jdbc:mysql://localhost:3306/jdbcdb" ;
			String username  = "root" ;
			String password  = "1999" ;
			
			connection = DriverManager.getConnection(dbURL, username, password) ;
			
			System.out.println("Enter choice ");
			
			System.out.println("1 for  insert record");
			System.out.println("2 for  get record");
			System.out.println("3  for callable statement ");
			
			
			
			int choice  = Integer.parseInt(sc.nextLine()) ;
			
			switch (choice) {
			case 1 : 
				sdb.insertRecord(); 
				break  ;
				
			case 2 :
				sdb.selectRecord();
				break  ;
				
			case 3: 
				sdb.updateRecord();
				
				default :
					break ;
		
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private void insertRecord() {
		System.out.println("inside insert record");
		String sql  = "insert into student(name , percentage, address) values(?,?,?)" ;
		try {
			PreparedStatement preparedStatement  = connection.prepareStatement(sql) ;
			
			System.out.println("Enter name ");
			preparedStatement.setString(1, sc.nextLine()); 
			
			System.out.println("Enter percentage ");
			preparedStatement.setDouble(2, Double.parseDouble(sc.nextLine())); 
			
			System.out.println("Enter City ");
			preparedStatement.setString(3, sc.nextLine());
			
		     int  rows  =  preparedStatement.executeUpdate() ;
			if(rows> 0) {
				System.out.println("Record inserted Succefully  ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void selectRecord() throws SQLException   {
		System.out.println(" Enter roll number to finout data ");
		
		int num = Integer.parseInt(sc.nextLine()) ;
		Statement st =  connection.createStatement();
		
		String  sql = "select * from student where roll_number = " +num ; 
		
		ResultSet resulSet = st.executeQuery(sql) ;
		
		if (resulSet.next()) {
			int  roll  = resulSet.getInt("roll_number");
			String  name  = resulSet.getString("name");
			double percentage  = resulSet.getDouble("percentage") ;
			String address  = resulSet.getString("address") ;
			
          System.out.println("roll number is  " + roll );
          System.out.println("name is  " + name );
          System.out.println("percentage  is  " + percentage );
          System.out.println("Address is  " + address );
          	
		}else {
			System.out.println( "no record found"  );
		}
	
//		while(resulSet.next()) {
//			
//		}
	}
	
	private void updateRecord() throws SQLException   {
		
		System.out.println("update recode ");
System.out.println(" Enter roll number to find out data ");
		
		int num = Integer.parseInt(sc.nextLine()) ;
		Statement st =  connection.createStatement();
		
		String  sql = "select * from student where roll_number = " +num ; 
		
		ResultSet resulSet = st.executeQuery(sql) ;
		
		if (resulSet.next()) {
			int  roll  = resulSet.getInt("roll_number");
			String  name  = resulSet.getString("name");
			double percentage  = resulSet.getDouble("percentage") ;
			String address  = resulSet.getString("address") ;
			
          System.out.println("roll number is  " + roll );
          System.out.println("name is  " + name );
          System.out.println("percentage  is  " + percentage );
          System.out.println("Address is  " + address );
          	
          System.out.println("what do you want to update ");
          
          System.out.println("1 name");
          System.out.println("2 percentage");
          System.out.println("3 address");
          int ch =  Integer.parseInt(sc.nextLine()) ;
          // update student set name  = "deep" where roll_nullber  = 5;
          
          String s  = "update student set" ;
          
          switch(ch) {
          case 1 :
        	  
        	  s = s+ " name = 'deep' where roll_number= " +num  ;
        	  
        	  PreparedStatement preparedStatement  = connection.prepareStatement(s) ;
        	  int rows = preparedStatement.executeUpdate()
 ;
        	  if(rows> 0)
        	  		
        	  System.out.println("percentage to be updated ");
        	  break  ;
        	  
          case 2 :
        	  
        	  System.out.println("address to be updated");
        	  
        	  break  ;
        default :
        	break ;
        		  
        	  
          }
          
          
		}else {
			System.out.println( "no record found"  );
		}
	
		
	}
	
	
	

}
