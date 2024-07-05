package june25;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//*****
		//*****
		//*****
		//*****
		//*****
		
	
		// 12 *12 ka square
		
//		System.out.println("*****"); // syso+ctrl+space  // sout
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
		int n  = 5  ; //0 1 2 3 4
		for(int i=0 ;i<n;i++) {
			for( int j=0; j<n ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
//		* 
//		* *
//		* * *
//		* * * *
//		* * * * *
		
		for(int i=0 ;i<n;i++) {
			for( int j=0; j<i+1 ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("///////////////////////////////////////");
		
		for(int i=0 ;i<n;i++) {
			for( int j=0; j<n ;j++) {
					if( i== 0 || i == n-1 || j == 0 || j ==n-1){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			
		System.out.println();
		}
		
		for (int i =1  ;i<5  ;i++) {
			
			for( int j=0; j< 10 ;j++) {
				if( j== 2) {
					break ;
				}
				System.out.print("* " +j);
				
			}
			System.out.println("////////////////////");
			
//			if(i == 5) {
//				continue ;// skip break ;
//			}
//			System.out.println("yes " + i);
			
			
		}
		
		
		
		
		

		
		
		
		
		
		
		
		
	
	}

}
