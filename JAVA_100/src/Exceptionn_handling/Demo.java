package Exceptionn_handling;

import Java_statement.Developer;

public class Demo {

 /// Throwable class  -------java.lang.Throwable---- EXception
	// error ----- you can not handle 
	// exception --- you can handle ----- Runntime(Unchecked exception)
	
	/// compile time exception (Checked exception)
	public void run() {
		System.out.println("I am running ");
		
	
		
	}
   
	
	public static void main(String[] args) {
		
		
		System.out.println("sachin");
		System.out.println("sachin");
		


		
		// this line will disrupt the normal flow of program 
		
		System.out.println("sachin");

		System.out.println("sachin");
		
		
		Demo d  = new Demo()  ;
		d.run();
		
		/// some runtime exception 
		
		
		// Arithmethic exception /0
		
		try {
			int a  =12  ;
			int b  = 0  ;
			int c  = a/b ;
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			;
		}
		
		
		
		// Null pointer exception 
		
		String s = null  ;
		
		try {
			s.length();// null	
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	
		
		
		// Number formate Exception 
		
		
		String ss= "2oooi32" ;
		
		try {
			int kk  = Integer.parseInt(ss);

		}catch(NumberFormatException ee) {
			
			ee.printStackTrace();
		}
		
		// StringIndexOutOfBoundsException
		
		
		String kk = "sachin";
		
		try {
			kk.charAt(10);

		}catch(StringIndexOutOfBoundsException ee) {
			
			ee.printStackTrace();
		}
		
		
				
		
		// Array index out of bounds  e
		
		int [] arr = {12,23,4,23};
		
		try {
			arr[10] = 12 ;
			

		}catch(ArrayIndexOutOfBoundsException ee) {
			
			ee.printStackTrace();
		}
		
				
		
		System.out.println("LAst line");
		
		
		
	}

}
