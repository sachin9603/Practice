package exceptionHandling;

public class Demo {
	
//	an event that occurs during the execution of a program that disrupts 
//	the normal flow of instructions.
	
	public static void main(String[] args) {
		int a  = 0  ;
		int b  = 12  ;
		
		
		System.out.println("sachin");
		System.out.println("sachin");
		System.out.println("sachin");
		System.out.println("sachin");
		System.out.println("sachin");
		
		try {
			
			int c = b/a  ;
		}catch(ArithmeticException ae ){
			
		System.out.println(ae .getMessage());
		}
	
		//Throwable 
		
		System.out.println("sachin");
		System.out.println("sachin");
		
		
		//Checked Exception -- compile time --- jab likh rahe the 
		//Unchecked Exception -- run time 
		// Error
		
//		String s  =  null ;
//		
//		System.out.println(s.length());
		
//		String  k  = "2yy323" ; // 232310 2333
//		Integer l  = Integer.parseInt(k) ;
//		System.out.println(l+10);
//		
		
//		String s = "Sachin" ;
//		System.out.println(s.charAt(8));
		
		//int[] arr = {1,1,1} ;
		
		
	}
	

}
