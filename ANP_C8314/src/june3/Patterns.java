package june3;

public class Patterns {

	public static void main(String[] args) {
		
		///  your task is to write 2 to 20 table 
		
//		
//		*******
//		*     *
//		*     *
//		*******
//	
		 int  i = 0  ;
		
	
		int count   =  0  ;
		
		int internalCount  =  0  ;
		
		for (i =1 ; i<=5 ;i++) {
			
			count++ ; // 1 2 3
			
			for ( int j  =1  ;j<=5 ;j= j+2) {
				
				internalCount++;// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
				
			}
			internalCount-- ;
	}
		
		
		
		System.out.println(count);
		
		
		System.out.println(internalCount);
		
		
		
		
//		internalCount--  ;
//		internalCount-- ;
		
	
	
		//  i  = 0      1 
		// 1 = 1        2
		// i  = 2       3 
		 // i  = 3    4 
		/// i  = 4      5 
		
		
		
	}

}
