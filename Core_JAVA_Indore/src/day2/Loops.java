package day2;

public class Loops {
	
	
	public static void main(String[] args) {
		   // 1           2      4     ------ 1 2 3 4 234 234 234
		for (int i=0  ;i<10 ; i= i+3) {
			// 3
			System.out.println("This number is -> " + i);
		}
		int i = 3  ;
		
		
		while(i<10) {
			System.out.println("sachin-->" + i);
			i = i+3 ;
			
			
		}
		
		int  k = 2  ;
		
		do{
			System.out.println("Print ---> "+k);
			k++;
			
		}while(k<1) ;
		
		
		
//		*
//		**
//		***
//		****
//		*****
		
//		*****
//		****
//		***
//		**
//		*
		
		
		// nested loop  
		
		
		
		for (int x=0 ; x<5 ; x++) {
		
			for (int y=0 ; y<5 ; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int x=0 ; x<5 ; x++) {
			
			for (int y=0 ; y<=x ; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
			
		
		
		
		
		
	}

}
