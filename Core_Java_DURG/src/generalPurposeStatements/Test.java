package generalPurposeStatements;

public class Test {
//	General Purpose Statements
//	Declaring variables, methods, classes, etc.
	
//	Creating objects, accessing variables, methods, etc.
//	2. Conditional Statements:
	
//	if, if-else, switch
//	3. Iterative Statements:
//	for, while, do-while
//		4. Transfer statements:
//			break, continue, return
	
	
	/// 
	public  void studentDetails(int age , String name , String city) {
		
		System.out.println( "Student ki age " + age);
		System.out.println( "Student ki name  " + name);

		System.out.println( "Student ki city " + city);

	}
	
	public static void main(String[] args) {
      
		Test obj = new Test()  ; //
		
		obj.studentDetails(23, "RUPAK", "INDORE");

		int  mrks = 80 ;
		
		//if else ---- there is range
		if(mrks >=90) {
			System.out.println("excellent");
		}else if (mrks>=80) {
			System.out.println("good");
		}else {
			System.out.println("You can do better");
		}
		
		
		
		/// switch 
		
		
		String day = "mon" ;
		// it is more optimize in case of discrete values 
		switch(day) {
		
		case "mon" :
			System.out.println("lecture for math ");
			break ;
			
		case "tue" :
			System.out.println("lecture for cs ");
			break ;
			
			
		case "wed" :
			System.out.println("lecture for hindi ");
			break ;
			
			
		case "thrus" :
			System.out.println("lecture for english ");
			break ;
			
			
			default:
				System.out.println("khud ki padai karo .....");
			
			
			
			
		}
		
		
		// for ,  while , do while 
		
	    // {12,4,2,5,2,6,8,9}
		
		
		//for(intialization;breaking condition ; increment and decrement) {
		
	//	}
		
		    // 1         //2        // 4     /1 2 3 4 ---> 2 3 4 ----> 2 3 4 
		for ( int i=0   ;i< 10;      i++) {   // i ki value   --- 0 , 1
			// 3
			System.out.println("This is "+ i +" Times ");
			
		}
		
		
		int j = 0 ;
		
		while(j<50) {
			
			System.out.println("I am in while " + j);
			j = j+ 5 ;
			
		}
		
		int l =5 ;
		
		// it will run atleast one time 
		do {
			l = l+5 ;
			System.out.println(" first time ");
			
		}while(l<20) ;
	
		
		
		// ----> break, continue, return
		
		int sum = 0 ;
		
		for ( int i= 0  ;i<=10  ;i++) {
			
			if ( i == 5 || i == 9 ) {
				continue ; //  iska kaam hai skip karna 
			}// i  = 0 1  2 3 4 
			
			sum= sum + i ;
			// sum  = 0 ,1 ,3 , 6  , 10 , 15 
			
		}
		
		System.out.println("out of loop ");
		
		System.out.println(sum);
		
	    String value  = Test.check(80) ;
		System.out.println(Test.check(15));
		
	}
	

	
	
	public static String check(int age) {
		
		// for ---
		
		
		//break 
		if (age <=18) {
			return "aap toh bacche ho " ;
		}else {
			return "Wow";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
