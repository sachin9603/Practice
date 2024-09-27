package sep27;

import java.util.Scanner;

public class Basic2 {
	 
//	public static void tableoFTwo( ) {
//		
//		System.out.println(2);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		System.out.println(2*10);
//		
//	}
//	
	                               //15
	public static void tableoFNum( int n) {
		// jo bhi repetative  kaam hai usko hum kar sakte loop 
		
		
		
		// statement            // kya 10 se chota hai 
		     // 1              // 2            // 4
		for( int i =1      ;i<= 10       ;i++ ) {
			
		 // 3	
			System.out.println( n * i )  ;
			
		} // 1 2 3 4----- 234 -----234  ---234 --234 ---234 --234 --234---234
		
		
		
		
		
	}
    
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// call kar liya 
		
	Scanner sc  = new Scanner(System.in) ;
	
	System.out.println("Enter your number jiski table banani hai ");
	
	
	int kiskiTablebananihai  =  sc.nextInt() ;
	
	
	
	
	
		tableoFNum(kiskiTablebananihai) ;
		
		
		// while 
		
		int count  =0 ;
		
		while(true) {
			count++ ;
			if(count  == 100) {
				break ;
			}
			System.out.println("mai hu while loop ");
			
		}
		
		
		//do while loop  
		int age =7  ;
		
		
		do {
			
			System.out.println("ek baar ");
		}while( age > 18)
			;
		
		
	 if(age>= 18) {
		 System.out.println("bade ho gaye ho go for some work");
	 }else if (age> 5 && age <18) {
		 System.out.println("this is golden time please focus ");
	 }else {
		 System.out.println(" noting......... don't scroll ");
	 }
		
	 
	 
	
		
	}

}
