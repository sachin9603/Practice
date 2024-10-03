package Emp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// I will creart it as singleton class 

  public class ConnectioFactory {
	
	
	
  public static ConnectioFactory  obj =  null  ;
	 
 
  private 	ConnectioFactory() {
	  
  }
  
    
  
   public Connection getConnection() {
	   Connection con = null  ;
	   try {
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empAPP", "root", "root") ;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	    return con  ;
	    
   }
  
  
  
  public static  ConnectioFactory getInstance() {
	  
	  if(obj == null) {
		  
		  obj =   new ConnectioFactory() ;
		  
	  }
	   return obj  ;
	 }
  
	
	
	

}
