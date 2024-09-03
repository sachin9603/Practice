package aug30;

import java.util.Scanner;

public class FinallyRelatedThing {
	
//	public static void dosomething() {
//		System.out.println("something something");
//		
//		dosomething();
//		
//	}
//	
	
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in) ;
		
				
		try {
			// line 
			//dosomething()
			
		 	System.exit(0);
	 	int i = 10  / 0  ; // this will give exception\\
	
	 	
	 //	System.out.println("below Exception line ");
	 	
	 	
	 	/// it will not run 
		}catch(ArithmeticException exception){
			
			
			//exception.printStackTrace();
			System.out.println(exception);
		
			
			
			
		}finally{
		 
		 	sc.close();
			
			System.out.println(" Most imp resourse that needs to be close ");
		}
		// what is rgeplacement of finally block 
		
	
	
		
		
	}
}
