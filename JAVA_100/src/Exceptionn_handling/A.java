package Exceptionn_handling;

public class A {
	
	
//	Q6. Sum of Two Numbers from Command Line
//
//	Take 2 command-line arguments.
//	Convert them into integers and print their sum.
//	Handle NumberFormatException if arguments are not integers.

	public static void main(String[] args) {
		
		
		
		for (int i =0 ;i<args.length  ;i++) {
			try {
				int s =Integer.parseInt(args[i]) ;
				System.out.println(s);
					
			}catch(NumberFormatException e) {
				
				e.printStackTrace();
				
			}
			System.out.println("Sachin ");
			
			
			
			
		}
	}

}
