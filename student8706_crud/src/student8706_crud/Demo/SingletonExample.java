package student8706_crud.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SingletonExample {
	// lazy loading in java 
	
	
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

	//step 2  
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"apke database ka naam ", "Username", "Password") ;

	
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp8706", "root", "root") ;
		
		//
	
	/// sirf  ekbarr obbject hi banega iska 
	
	 // step  
	private static SingletonExample instance;
	
	
	// contr ko private bana do 
	 private SingletonExample()
	    {
	        // Initialization code here
	    }
	
	    
//step 3   --- ek method banao jo ki is class ka instance  deti hao 
	  // Static factory method for global access
	    public static SingletonExample getInstance()
	    { // Check if an instance exists
	        if (instance == null) {
	            // If no instance exists, create one
	            instance = new SingletonExample();
	        }
	        // Return the existing instance
	        return instance;
	    }
	     public static void main(String[] args) {
			SingletonExample c1  = SingletonExample.getInstance() ; 
	    	SingletonExample c2  = SingletonExample.getInstance() ; 
	    	
	    	System.out.println(c1.hashCode());
	    	System.out.println(c2.hashCode());
	    	
	    	
	    	
	    	
	    	
	    	
		}
	

}
