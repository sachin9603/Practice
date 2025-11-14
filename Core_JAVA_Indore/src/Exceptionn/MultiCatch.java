package Exceptionn;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		int a  = 10 ;
		int b  = 0  ;
		int []arr = new int[5];
		
		try {
			
		// arr[5] = a/b ;
//			String s  = null  ;
//			s.length();
		 
				 
		}catch(ArrayIndexOutOfBoundsException ee2){
			ee2.printStackTrace();
			
		}catch(ArithmeticException e  ) {
			e.printStackTrace();
		}catch(Exception ee  ) {
			ee.printStackTrace();
		}
		
		
		System.out.println("Rest of code is there ");
		
		///Nested Try Block in Java
		
		try {
			 try {    
                 int arr1[] = { 1, 2, 3, 4 };    
                 //printing the array element out of its bounds    
                 System.out.println(arr[10]);    
             }    
             // to handle ArithmeticException    
             catch (ArithmeticException e) {    
                 System.out.println("Arithmetic exception");    
                 System.out.println(" inner try block 2");    
             }    
		}catch (ArrayIndexOutOfBoundsException  ee3) {
			ee3.printStackTrace();
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		System.out.println("Rest of code is there ");
		
//		Java finally block is a block used to execute important code, such as closing the connection etc.
//
//		Java finally block is always executed, whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of whether an exception occurs or not.
//
//		The finally block follows the try-catch block.
		
		try {
			
		//System.exit(0);
			
		
		
		
		}catch (ArrayIndexOutOfBoundsException ll ) {
			
			System.out.println(ll);
		}
		finally {
			System.out.println("this block of code will be always execute ");
		}
		
		System.out.println("Last lineee");
		
		
		
		
		
		
		

		
	}	

}
