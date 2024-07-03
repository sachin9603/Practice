package june21;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		// switch statement  
		// at place switch case you can always use (if else )but try to use switch
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter your day ");
		int  day  = sc.nextInt();
		
		
//		if (day == 2) {
//			System.out.println("Tuesday");
//		}else if (day == 3) {
//			System.out.println("wednesday");
//		}else if (day == 4) {
//			System.out.println("Thrusday");
//		}else if (day == 5) {
//			System.out.println("wednesday");
//		}else if (day == 6) {
//			System.out.println("wednesday");
//		}
		
		
		
		switch(day) {
		case 2  :
			System.out.println("Tuesday");
			break ;
		case 3  :
			System.out.println("Wednesday");
			break ;
		case 4  :
			System.out.println("Thrusday");
			break ;
		case 5  :
			System.out.println("friday");
			break ;
		case 6 :
			System.out.println("saturday");
		default :
			System.out.println("enter right day ");
			
			//  switch 
			
		}
		
		
	
		
		
		
	}

}
