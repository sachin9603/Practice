package Statementsss;

public class Loopss {
	
	public static void main(String[] args) {
		
		
//		System.out.println("welcome");
//		System.out.println("welcome");
//		System.out.println("welcome");
//		System.out.println("welcome");
//		System.out.println("welcome");
//		System.out.println("welcome");
//		System.out.println("welcome");
//		System.out.println("welcome");
		
		
		// there are three type of loop in java 
		// for , while  , do while 
		// break  continue 
	
		// for loop    1 2 3 4-- 234 234  234 234 234 234 234 234 234 234 
		//    1              2     // 4
		for (int  mat  = 0 ; mat<5 ; mat = mat + 2) { // 0 1 2 3
			
			// step 3 
			
			System.out.println("This number is " +mat);
			
			
			
			
		}
		
		// while loop 
		
		// step 1 
		int u  = 100  ; 
		
		// check condition  2
		while(u<100) {
			// this line perform   3 
			System.out.println(" hello world " + u);
			
			// this is 4
			u= u + 5  ;
			
		}
		
		///1 234  2 3 4 234 234 234 234 234 234 234 234 234 234 234 
		System.out.println("bahar vaala code ");
		
		
		// do while loop 
		
		// it make sure that code will run atleast one time 
		
		
		
		int k = 100 ;
		
		do {
		System.out.println("do while ");	
		k++  ;	
		}while (k<10) ;
		
		
		// . Count digits of a number

//Take a number and count how many digits it has using a loop.
//Example input: 12345
//Output: Number of digits = 5
//		
		int jk = 789456816;  // sum of even number 
		
//		
//		int count = 0  ; // 3
//		
//		while(0<jk) {
//			// 0 
//			
//			jk = jk/10 ; //78945631 //7894563  // 789456//78945 //7894 //789 //78 //7
//			count++ ;
//			
//		}
//		System.out.println(count);
//		
		
		//int jk = 789456316;  
    int sum = 0  ;;
		
		while(0<jk) {
			// 0
			int lastnumber = jk%10;
			
			// checking last number is even or not
			if (lastnumber%2 == 0) {
				sum =sum +lastnumber ;
			}
			// eleminating last number 
			jk = jk/10 ; //78945631 //7894563  // 789456//78945 //7894 //789 //78 //7
			
			
		}
		System.out.println(sum);
		
		
		
		
	}

}
