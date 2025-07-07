package java_statement;

public class Demo {
	
	// program ka entry point 
	
	public static void main(String[] args) {
		
		
		//if if-else , switch 
		int age =  12  ;
		
		
		if( age >=18) {
			System.out.println("aap vote de sakte ho ");
		}else {
			System.out.println(" you are not eligible ");
		}
		
		
		int marks  = 86  ;
		
		// and && or operator  ----> || 
		if(marks > 90) {
			System.out.println("A");
		}else  if (marks >= 80 && marks <=88 ) {
			
			System.out.println(" special case ----> very good in sports and  in study also ---B");
			
		}else {
			System.out.println("  C ");
		}
		
		
		int a = 20  ;
		int b  = 25  ;
		
		if(a==20 || b== 30) {
			
			System.out.println("dono mai se ek sahi hai ");
		}
		
		if (a== 25  && b == 25) {
		System.out.println( "dono hi sahi hai ");	
		}else {
			System.out.println("both cases are wrong or may one case is srong ");
		}
		
		
		
		// switch case -----
		
		
		/// ye same hai if , else if  jesa but thoda time complexity kam lagti hai 
		
		int day = 3  ;
		
		switch(day) {
		
		case 1 :
			System.out.println("mon");
			break ;
		case 2 :
			System.out.println("tue");
			break ;
		case 3 :
			System.out.println("wed");
			break ;
		case 4 :
			System.out.println("thrus");
			break ;
		case 5 :
			System.out.println("friday");
			break ;
			default :
				System.out.println("your day value is wrong ");
			
		}
		
		
		
		/// loop ---- > 
		
		
		// for 
		// while 
		// do while    /// 1234 ----234 --- 234 -234 ---234--234
		
		//       1       //2         // 4
		for(int i  =0  ;i <= 10       ;i = i+2) {
			
			// 3
			System.out.println("sachin "+ i );
		}
		// i  = 0 2 4 6 8 10
		
		
		//while 
		
		
		int i = 0 ;
		
		while(i<90) {
			System.out.println(i*2);
			i++  ;
		}
		
		
	
		
		// *
		// * *
		// * * * 
		// * * * *
		// 
		
		for ( int ii =0 ; ii< 5  ;ii++) {
			
			for(int j =0 ;j<=ii ; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
			
		/// * * * * *
		/// * * * * 
		/// * * * 
		/// * * 
		/// * 
		
		
		
		
	}

}
