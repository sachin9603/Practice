package day2;

import oops.AccessModifierss;

public class Demo2 {
	
	
	public static void main(String[] args) {
		
		System.out.println("sachin");
		
		// what are wrapper classess 
		
		// int char boolean double float long byte short 
		// object vo hota hai jo kisi class se ara hai 
		// class ----- is just blue print for creating object 
		
		
		int z = 5 ;
		
       Integer s  = 20  ;
       
        int ll  = Integer.MAX_VALUE ;
        int leastValue  = Integer.MIN_VALUE ;
        
        System.out.println(ll);
        System.out.println(leastValue);
        
        String  jj  = "78989898" ;
        
        int kk  = Integer.parseInt(jj) ;
        
        System.out.println(kk+10);
        
        
       Integer pp  =  002; // obj // 4 byte 
       int aa  =  12 ; // not object   4 byte 
       
     
       
       Integer s2  = Integer.max(pp  , aa);
       System.out.println(s2);
       Boolean h1  = true ;
       
       
       
       /// 
       Double l =  90.0 ;
       Short  kl = 79  ;
       Long op  = 789999L ;
       Character jh  = 's' ;
       
       
       
 ;
       
 
    // casting 
    // it is process to convert one data type into another 
 
     byte  oi  = 45  ;
     
     int kj   = oi ; // there is example of casting here byte is getting converted into int 
     // and here a small data type is converting into big one so 
     // it is done implicitly by jvm 
     
     
     int uppi  = 46 ;
 //    byte kh  =  ui  ; // here there will be issue becouse u r converrting  a big onne into small data type 
     
       // so you need to do explicitly like this 
     
     byte kls  =  (byte)uppi  ;
		// left to right  ----- > widening  implicit 
	// byte --- short  ---- int  --- long 	
     // right to left -----> narrow --exlicit casting 
     
     
     AccessModifierss obj  = new AccessModifierss()   ;
//		String s  = obj.username ;
//		String c = obj.carColor ;
     
     int count  = obj.familyMember  ;
    
     
     
	}

}
