package june27;

import jul1.Demo;

public class Main {
	//main ----crtl+space
	public static void main(String[] args) {
		Demo s = new Demo() ;
		
		s.id;
//		System.out.println(); // syso ctrl+space
//		
//		System.out.println(); 
		
//System.out.println("newClass hai aaj ");
		//*****
		//*****
		//*****
		//*****
		//*****
		
		//how to print hollow square
		
		
		for (int j  =1 ;j<=5 ;j++) { // row 
			
			
			
			if (j== 1 || j== 5) {
				  // 1      // 2    // 4
				for (int i  = 1  ;i<=5  ;i++) {   // 1 2
					
				//	1234  234 234 234 234 234 234 234 234 234 234 234 234 
				
				// 3	
				System.out.print("*");// Column * * * * *
					                            
				}
			}else { // 234
				for (int i  = 1  ;i<=5  ;i++) {   // 1 2
					
				//	1234  234 234 234 234 234 234 234 234 234 234 234 234 
				
				// 3
					if (i== 1  || i == 5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
			// Column * * * * *
					                            
				}
				
			}
			
			
			System.out.println();
			
		}
	          
		
				
		
		
	}

}
