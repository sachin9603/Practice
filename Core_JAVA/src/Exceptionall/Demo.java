package Exceptionall;

import java.io.FileOutputStream;
import java.util.ArrayList;

// java.lang package is already imported 
public class Demo {

	
	public void printAnything() {
		
		System.out.println("anything   ......");
		
		
		
	}
	
	public static void main(String[] args) {
		//ArrayList s = new Arraylist()  ;
		
		System.out.println("Sachin");
		System.out.println("Sachin");

		System.out.println("Sachin");

		//// calculation  this code is not runnng after line  
		
		//int s = 10/0 ;
		try {
			int s = 10/0 ;
			
		}catch(Exception e ) {
			
			System.out.println(e.getMessage());
		
		}
		
		System.out.println("Sachin");

		System.out.println("Sachin");

		System.out.println("Sachin");
		
		
		// excception ------checked exception  , unchecked exception  and we can handle exception  
		
		// error  ---- but error can not handled you have to go in the code and need to rectify issue 

		
		Demo kk  = new Demo()  ;
		kk.printAnything(); // method kis flow main run hogi --- kis method k baad konsi method chalegi  
		// execution stack ------ stack memory mai save hota hai 
		
		
		
		
		
		
		
		
		
		//checked ----- those exception whcih isdirectly extending exception class is know as checkeed 
		
		// compile time exception --- kyuki ye jab aap code likh rahe tabhi exception
		//aayega,,,,,, esa pata lag jata hai matlab ki compilation time par hi pata lag jaayega 
		
		
		
		// uncheck exception  ,,, runtime excetion  ------ jo bhi runtime class ko extend karega that exeption will known runtime exeption 
		// in exception code run karne baad hi dek sakte hai 
		
		// arithmatic ---- ye jab aayega  --- /0
		
		
		// null pointer-exceptionn
		
//		String s  = null  ;
//		System.out.println(s.length());
//		
		
		// Array index out of bond
		
//		int [] arr = {7,78,8,9} ;
//		System.out.println(arr[9]);
		
		// number formate exception  
		
//		String kl  = "7erfwqer98" ;
//		Integer lk  = Integer.parseInt(kl) ;
//		System.out.println(kl);
//		
		
		
		// pehle hi code mai kuch problem aagya 
		// try block k ander System.exit() 
		try {
		System.out.println("Sachin");
	
			
		}finally {
			
			
			System.out.println("It will always run no matter, is there is any exception or not ");
		}
		
		
		
		
		// Try block to check for exceptions
        try (

            // Creating an object of FileOutputStream
            // to write stream or raw data

            // Adding resource
            FileOutputStream fos
            = new FileOutputStream("sachinnn.txt")) {

            // Custom string input
            String text
                = "Hello World. This is my java program";

            // Converting string to bytes
            byte arr[] = text.getBytes();

            // Text written in the file
            fos.write(arr);
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Display message for the occurred exception
            System.out.println(e);
        }

        // Display message for successful execution of
        // program
        System.out.println(
            "Resource are closed and message has been written into the gfgtextfile.txt");
		
		
	
		
	}
}
