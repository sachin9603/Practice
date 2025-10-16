package Java_statement;

public class Demo {
	
	
	public static String check(int  i)  {
		
		if(i%10 == 0) {
			return "yes" ;
		}else {
			return "no";
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//    1           2     //4
		for( int  i =0  ;i<5 ; i = i+2) { // 1 234 234 234 234 234 
			
			//3
			
			System.out.println(" value of i "+ i);
			
		}
		
		
		int j =0  ;
		while(j<=100) {
			System.out.println("value of j " + j);
			
			j = j + 5 ;
			
		}
		
		System.out.println(j); // 105
		
		// ye kam se kam ek baar toh chalega hi 
		do {
			
			System.out.println("ek baar ");
			j = j+10 ;
			
		}while(j<150);
		
		System.out.println(j);
		
		// maths number of student 
		          // 0  1  2   3  4
		int[] arr = {56,63,89,77, 86};
		
		// arr.length  ----5
		
		
		// for , while , do while , for each loop 
		   // 0 1 2 3 4
		for (int i =0 ;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
		
		
		for(  int jj :arr) {
			System.out.println(jj);
		}
		
		
		int sum  = 0  ;
		
		for (int i =0 ;i<=100 ;i++) {
			
			if(i%2 ==  0) {
				continue ; // it is used to skip particular step 
				
			}
			sum = sum + i ;
			
			
			
		}
		System.out.println(sum );
		
		
		// continue 
          for (int i =0 ;i<5 ;i++) {
			
			if(i%2 ==  0) {
				
				continue ; // it is used to skip particular step 
				
			}
			System.out.println("value of i " + i);
		}
          System.out.println("===========================================");
          // break ;
          for (int i =0 ;i<5 ;i++) {
  			
  			if(i == 3) {
  				
  				break ; // it is used to break  entire loop 
  				
  			}
  			System.out.println("value of i " + i);
  		}
          
          
          // return
          
          for (int i =0 ;i<5 ;i++) {
    			
    			if(i == 3) {
    				
    				//return ; // it is used to return entire method output
    				
    			}
    			System.out.println("value of i " + i);
    		}
          
          
          
          
          System.out.println("yes i am out of loop now ");
          
          
          
        String s=   Demo.check(45);
        System.out.println(s);
	
        
      //  =========================== nested for loop =========================================
		
		System.out.println("=============================================");
		
		
		for(int i=0 ;i<5 ;i++) {
			
			for (j =0 ;j<5 ;j++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		System.out.println("=============================================");


		for(int i=0 ;i<5 ;i++) {
			
			for (j =0 ;j<=i ;j++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("=============================================");


		for(int i=0 ;i<5 ;i++) {
			
			for (j =0 ;j<5-i ;j++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
