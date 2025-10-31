package Exceptionn;

public class Demo {
	
	
	//, an exception is an event that occurs during the execution of a program 
	//that disrupts the normal flow of instructions.
	// Throwable -------Exception  --- these can be handle 
	
	//       --------------Error  --- which can not be handle 
	//Exception ----- checked exception  ---jo code likhte vakt hi pta lag jaaye ki ye like exception degi
	       ///  ------ compile time exception ------SQL exception , IOException.... your custom exception 
	
	//          -------- unchecked exception 
	// jo code likhe baad pata lagewga ki ye line mai issue hai use unchecked bolenge 
	// Runtime exception ---- Arithmeticexception, ArrayIndexout of bond ,..... your custom exception 
	
	// Exception class ki ---
	
	
	
	
	
	
	
//	public void run() {
//		
//		System.out.println("Running ");
//		
//		run()  ;
//		
//	}
	
	public static void main(String[] args) {
		System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("welcome");
//		
//		int a  = 10 ;
//		int b  = 2 ;
//		int c = a/b ;
//		
//		String k = null  ;
//		
//		System.out.println(k.length());
//		
//		System.out.println(c);
		
		
		
		
		Demo d = new Demo() ;
		//d.run() ;
		
		
		///try --- it is block and in this block we are going to that line of code which is throwing exception 
		/// catch --- is also a block but in this block wer are to handle exception 
		try {
			int a  = 10 ;
			int b  = 0 ;
			int c = a/b ;	
		}catch (Exception e){
		e.printStackTrace();
			///System.out.println(e.getMessage());
		}
		
		System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("welcome");
		
	}
	
		
	
	

}
