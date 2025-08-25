package Statementsss;

public class Pattern {
	
	
	public static void main(String[] args) {
		
		
		
		for( int i =0  ;i<5 ;i++) { // 0 1 2 
		
			for( int j = 0  ;j<5 ;j++) { //  0 1 2 3  4 5
				                         // * * * * *  
				                         //  * * * * *  
				System.out.print("* ");   // * * * * *  
			}
			
			System.out.println();
			
			
		}
		
		System.out.println("=================================================");
		
		
		

		for( int i =0  ;i<5 ;i++) { // 0 1 2 
		
			for( int j = 0  ;j<=i ;j++) { //  0 1 2 3  4 5
				                         // * * * * *  
				                         //  * * * * *  
				System.out.print("* ");   // * * * * *  
			}
			
			System.out.println();
			
			
		}
	}

}
