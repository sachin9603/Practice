package day1;

public class Loopss {
	  
	/// loops 
	  
	  
	  // for , while , do while 
	  
	  
	   
	   
	  public static void main(String[] args) {
		
		    // setp 1-->2 check     // 4 -- increase by 1 
		 for(int i =0  ;i< 5        ;i++)  {
			// step 3 it will do entire task 
			 
			 
			 System.out.println("this is ---> " + i);
			 
			 // 1234 234 234 234 234
			 
		 }
		 System.out.println("out of loop ");
		  
		 // 2 ka table as --- 2*1 = 2 
		  int num  = 2 ;
		  int i  ;
		    for ( i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
		    }
		    
		    System.out.println(i);
		    int k = 3000 ;
		    
		    while(k<1900) {
		    	
		    	System.out.println(k);
		    	
		    	
		    	k += 200 ;
		    	
		    }
		    
		    
		    do {
		    	System.out.println("Ascasdasdaskdjfasdhlfj"); // minimum 1 baar chalega do while loop 
		    }while(k<2500) ;
		    
		    
		    ///
		    int  ppp  =  45664372 ;
		    // do sum of all even  number 
		    
		    int sum = 0  ;
		    
		    while(ppp>0) {
		    	
		    	int lastdig  = ppp %10 ;
		    	if (lastdig%2 == 0) {
		    		sum = sum + lastdig ;
		    		
		    	}
		    	ppp =  ppp/10 ;
		    	
		    	
		    	
		    	
		    }
		    System.out.println(sum);
		    
		    
		    
		 
		 
		 
	}
	  
}
