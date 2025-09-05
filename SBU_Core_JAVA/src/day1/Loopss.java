package day1;

public class Loopss {
	  
	/// loops 
	  
	  
	  // for , while , do while 
	
	  public static void rightAngleTriagle(int N) {
		  
		         // 0 1 2 3 4
		  for(int i =0  ;i<N ;i++) {
			  
			  for(int j =0  ;j<=i ;j++) {
				System.out.print("* ");  
				}
			  //*
			  //* *
			  //* * *
			  
			  System.out.println();
              }
		  
		  
		  
	  }
	  
	  public static int reverseNumber(int N) {
		  
		  //N =762132-- 231267
		  //231
		  int newNum  ;
		  int ld = N%10 ;
		  N= N/10 ;
		  newNum= ld ;
		  
		  
		  while(N>0) {
			  
			   ld = N%10 ;
			  newNum = newNum*10 +ld ;
			  N= N/10 ;
			  
		  }
		  return  newNum ;
		  
		  
		  
	  }
	   
	   
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
		    
		    
		    int count  = 0  ;
		    for(int x =0  ; x<5; x++ ) { // x = 0
		    	
		    	
		    	for(int u = 0  ; u<6; u++ ) {
			    	System.out.println(" wecome ");
			    	count++  ;
			    	
			    }
			    
		    	
		    	
		    }
		    System.out.println(count);
		   
		    
		    /// check prime number  
		    
		   // 2 3 5 7 11
		    
		    // brut force approch 
		    
		    
		    checkPrime(2) ;
		    
		    
		    int jhj = 100 ; //1 2 3 4 5 6
		    
		    
		    for(int ii =1  ;ii<= jhj ; ii++) {
		    	System.out.print(ii +" -----> ");
		    	checkPrime(ii) ;
		    }
		    
		    
		   int resNumber = reverseNumber(1787946) ;
		   
		   System.out.println(resNumber);
		    
		   rightAngleTriagle(10) ;
		   
		    
		    
		 
		 
		 
	}
	  
	  public static void checkPrime(int number) {
		 
		  if(number == 1 ) {
			  System.out.println("number is not prime");
			  return ;
		  }
		  int variable  = 0;
		  
		  for (int y = 2  ;y<number ; y++) {
			  if(number%y == 0) {
				  variable++ ; 
			  }
		  }
		    if (variable != 0) {
		    	System.out.println("number is not prime");
		    }else {
		    	System.out.println(" number is prime ");
		    }
	  }
	  
	  
	  
}
