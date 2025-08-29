package Exceptionall;

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
		
		
		try {
			int s = 10/0 ;
			
		}catch(ArithmeticException e ) {
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
		
	}
}
