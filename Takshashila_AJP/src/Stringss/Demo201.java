package Stringss;

import java.util.Arrays;

public class Demo201 {
	
	public static void main(String[] args) {
		
		 // 0 1 2 3 4 5       
		String s  = "Welcome" ;
		String s1  = "Welcome" ;
		String s3 = new String("Welcome") ;
		String s4 = new String("Welcome") ;
		
		
		
		// you should have idea about  ==  ---it checks memory address (location) 
		System.out.println( s == s1);
		System.out.println(s==s3);
		System.out.println(s3== s4);
	// .equals check content
		System.out.println(s.equals(s4));
		
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
		
		String l  = "RAT" ;
		String gg  = l.toLowerCase() ;// rat 
		String  ll = "Rat" ;
		
		System.out.println(l.equalsIgnoreCase(ll));// true
		
		
		
		
		
		l  = l+" Cat" ;
		System.out.println(l); // RAT Cat
		
		String res  = String.join(", ", l , ll, s1) ;
		System.out.println(res);
		
		
		char sChar  = s.charAt(2);
		System.out.println(sChar);
		
		System.out.println(s.length());  // 7 
		
		System.out.println(s.substring(3));
		
		System.out.println(s.contains("ome"));
		
		
		String  kk  = "my name is sachin" ;
		String [] arr  = kk.split(" ") ;  //it will split and store into array
		
		System.out.println(Arrays.toString(arr));
		
		// String 
		
		// Stringbufer and String builder 
		
		StringBuffer kkk  = new StringBuffer("sachin") ;
		kkk.append(" parmar") ;
		System.out.println(kkk);
		
		
	}

}
