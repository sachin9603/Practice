package nov8.Exception;

import java.util.Scanner;

public class Demo {
	
	// // user--defined exceptions are customException 
	
	public static void ageValidator( int age) throws AgeException {
		
		if(age<18) {
			// if age is less there sould be exception 
			
			throw new AgeException("You can't vote you are too young") ;
			
		}else {
			System.out.println("yes you can vote ");
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter your AGE..");
		int age  = sc.nextInt() ;
		
		try {
			
			ageValidator(age) ;// jo line exception de rahi hai use try mai likho 
			
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		       System.out.println(e.getMessage());
		}
		
		
		System.out.println("Sachin");
		
		try {
			System.out.println(100/0);
		}catch(Exception e ) {
			e.printStackTrace();
		}


		System.out.println("Sachin");

		System.out.println("Sachin");

		System.out.println("Sachin");
		// 1000 line code hai phir bhi chalege 

	}
	
	

}
