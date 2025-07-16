package Stringss;

import oops_day_5_abstract.Bank;
import oops_day_5_abstract.SBI;

public class Demo101 {
	
	
	public static void main(String[] args) {
		
		//method, class area
		// heap area ---- saare object save 
		
		// by literal
		
		SBI b  = new SBI()  ;
		
		
		
		//By new keyword , normal heap area 
		String s2  = new String("SACHIN") ; // first time "SACHIN"
		String s3  = new String("SACHIN") ;// Second time bhi "SACHIN"

		
		
		
		
		// by literal ----> this s1 , s varibale will be saved in special reserved area of heap arewa
		// that area is known as String constant pool 
				String s1  = "sachin" ;// suppose you are creating s1 - sachin
				String s  = "sachin" ;// but when you are creating s - sachin again // so jvm will not create new sachin
				/// jvm will refer to previousm s to previous "sachin"
				
				String bb  = "sachin" ;
				
				// because of memory management feature 
				
				/// why strings are immutable in java 
				
				String p  = "abc" ; // once you have created a string it will never be change 
				
				String q  = "abc" ;
				
				 s1 = "hariom" ;
				 
				
				p.concat("def") ;//  new  ---abcdef
				
				System.out.println(p);// abc
				
				// java strings are immutable bcz suppose we are creating two string p and q and 
				// both have same value "abc" now suppose i am change abc so value of q will be automatically change 
				//
				
				p  = p.concat("defghijklmnop") ;  /// new abcdefghijklmnop

				
				System.out.println(p);
						
				
				
				
				
				
				
		
		
		
		
	}

}
