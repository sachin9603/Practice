package june3;

public class square {

	public static void main(String[] args) {
		
		
		int n  = 5  ;
		
//		*
//		* * 
//		* * * 
//		* * * *
		
		
//		int count =  1  ;
//		
//		for (int  i  =1 ;i <= 5  ;i++) {
//		
//			for(int j  =1  ;j<=i  ;j++) {
//				
//				System.out.print(count+" ");
//				count++ ;
//				
//				
//			}
//			System.out.println();
//		}

		
		
	// * * * * 
    // *     *
	// *     *
	// * * * *  dry run 
		for (int i=1 ;i<=4 ; i++) {
			
			if(i == 1  || i == 4) {
			 
				for (int j=1 ;j<=4 ; j++) {	
					System.out.print("* ");
				}
			}else {
				for (int j=1 ;j<=4 ; j++) {	
					if(j == 1 ||  j== 4) {
					System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
