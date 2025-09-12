package day2;

public class Operator {
	
	public static void main(String[] args) {
		
		/// */ + - %  ++ -- 
		
		int a  = 5 ;
		int  b  = 6 ;
	
		System.out.println(a++); // 5  then value will get increase 6
		//a++ ; // post increment ---- first operation will be performed then value of a  will get increase 
		System.out.println(a); // 6
		
		System.out.println(++a); // 7  pre increment value will get first increase then it will get print 
	
		
		
		         // 7    9     9     6
		int c  =  a++ + ++a + a++ - b-- ;
		
		System.out.println(c);	
		
		
		int aa=5;      ///   4    3      4  - 4       2  2       2    2
		System.out.println((--aa+--aa)*(++aa-aa--)+(--aa+aa--)*(++aa+aa++));
		
		
		
		// =  +=  , -=  , /=  , %=
		
		int k  =  12 ;
		
	   k += 12 ; //   k  = k + 12 // both are same but is way to write 
	  
	   
	   //
	   int q  = 12  ;
	   int p  = 12  ;
	   // ==  >= <= 
	   if(p == 12 ) {
		   System.out.println("yes it is 12 ");
	   }
	   
	   // || --or  , & and operator 
	  
	   boolean kl  = true  ;
	   boolean jh  = true  ;
	   
	   //  || if there is only true then or operator will give you true 
	   // and if there is only one false then it will give you false
	   
	   
	   if(kl || jh || p == 12 || q < 12) {
		 System.out.println(" any one value is true ");  
	   }
		if (kl && jh) {
			System.out.println("Both are true ");
		}else {
			System.out.println("may be one value is false or both are false ");
		}
		
		
		
		// statements 
		
		
		
		// conditional statement 
		
		
		// if else if ,else  , switch 
		
		int age  =  22 ;
		if(age < 18) {
			System.out.println(" if block will run ");
		}else if (q <12) {
			System.out.println("q is less then 12");
		}else if (q <=12) {
			System.out.println("q is less then or equal to 12");
		}else {
			System.out.println("above bloack will not execute ");
		}
		
		
		
		// swtich 
		
		
		
		int day = 3  ;
		 
		if(day ==1  ) {
			System.out.println("MON");
		}else if(day ==2  ) {
			System.out.println("tue");
		}else if(day == 3  ) {
			System.out.println("wed");
		}else if(day ==4  ) {
			System.out.println("trushday");
		}else if(day ==5  ) {
			System.out.println("fri");
		}else {
			System.out.println("please put correct value ");
		}
		
		
		// switch 
		
		switch (day){
		
		case 1 :
			System.out.println("Mon");
			break  ;
		case 2 :
			System.out.println("tue");
			break  ;
		case 3 :
			System.out.println("wed");
			  ;
		case 4 :
			System.out.println("thrus");
			  ;
		case 5 :
			System.out.println("fri");
			 break ;
		case 6:
			System.out.println("sat");
			  ;
		default :
			System.out.println("you have entered wrong value ");
			
		}
		
		
		
		
		/// for ,while, do while
		
		    /// 1            2     4      /// ---- 1234 234 234 234 234 234
	      for( int i  = 0 ; i<10 ; i++ ) { // 0 1 2 3 4 -----5
	    	  //3 
	    	  if (i == 3) {
	    		  continue ; // it will skip that iteration after continue statement 
	    	  }
	    	  
	    	  if (i==7) {
	    		  break  ; // it will break loop and throw you out side the loop 
	    	  }
	    	  System.out.println("Welcome --->"  +i);
	    	  
	    	 
	    	  
	    	  
	    	  
	      }
		
	      /// break continue ----
	      
	      System.out.println(" out of loop ");
		


	      int kk = 5 ;
	      
	      
	      while(kk<10) { //5 7 9
	    	  System.out.println("Home");
	    	  
	    	  kk = kk + 2 ;
	    	  
	    	  
	    	  
	      }
		
		
	}

}
