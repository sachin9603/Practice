package Statementsss;

public class Pattern {
	
	public static void soildSquar()  {

		for( int i = 0  ;i<5 ;i++) { // 0 1 2 3 4
		
			for( int j = 0  ;j<5 ;j++) { //  0 1 2 3  4 
				                         // * * * * *  
				                         //  * * * * *  
				System.out.print("* ");   // * * * * *  
			}
			
			System.out.println();
			
			
		}
	}
	
	// ye kese triangle bana check karo
	
	public static void rightAngleTraingle() {

		for( int i =0  ;i<5 ;i++) { // 0 1 2 
		
			for( int j = 0  ;j<=i ;j++) { //  0 1 2 3  4 5
				                          
				System.out.print("* "); 
			}
			
			System.out.println();
			
			
		}
	}
	
	
	public static void hollowSquare() {
//* * * * *
//*		  *
//*       *		
//*       *		
//* * * * *
		for( int i =0  ;i<5 ;i++) { // 0 1 2 
		
			if(i==0 || i == 4) {
				for( int j = 0  ;j<5 ;j++) { //  0 1 2 3  4 
				                    // * * * * *  
				                    //  * * * * *  
				System.out.print("* ");   // * * * * *  
				}

			}else {
				
				for( int j = 0  ;j<5 ;j++) { //  0 1 2 3  4 
								if(j==0 || j==4)	{
									System.out.print("* ");   	
								}else {
									System.out.print("  ");
								}
					}
}
			System.out.println();
		}
	}
	
	public static void numberChangingPyramid() {
			int num  = 1 ;
		for( int i =0  ;i<5 ;i++) { //  1 2
		
			for( int j = 0  ;j<=i ;j++) { //  1 
				                          
				System.out.print(num +" "); 
				
				num++ ;
			}
			System.out.println();
		}
	}
	
	
	public static void numberIncreasingPyramid() {
		
	
	
	for( int i =1  ;i<5 ;i++) { //  1 2
	
		for( int j = 1  ;j<=i ;j++) { //  1 
			                          
			System.out.print(j +" "); 
			
		
		}
		System.out.println();
	}
	
}
	
	
	public static void zeroOnePyramid() {
		
		
		
		for( int i =0  ;i<5 ;i++) { //  1 2
		
			for( int j = 0  ;j<=i ;j++) { //  1 
				      
				
				if (i%2 == 0) {
					if(j%2 == 0) {
						System.out.print(1+" "); 

					}else {
						System.out.print(0+" "); 

					}
				}else {
					if(j%2 != 0) {
						System.out.print(1+" "); 

					}else {
						System.out.print(0+" "); 

					}
				}
				
				
				
			
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		
		soildSquar();
		
		
		System.out.println("=================================================");
		
		rightAngleTraingle() ;
		
		System.out.println("=================================================");
				
		hollowSquare();
		
		System.out.println("=================================================");

		numberChangingPyramid() ;
		System.out.println("=================================================");

		numberIncreasingPyramid() ;
		System.out.println("=================================================");

		zeroOnePyramid() ;
		
		
		
		

	}

}
