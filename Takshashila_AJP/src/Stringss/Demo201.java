package Stringss;

import java.util.Arrays;

public class Demo201 {
	
	public static void main(String[] args) {
		
		 // 0 1 2 3 4 5       
		String s  = "Welcome" ; // stp -- string constant pool 
		String s1  = "Welcome" ;
		String s3 = new String("Welcome") ;
		String s4 = new String("Welcome") ;
		
		
		
		// you should have idea about  ==  ---it checks memory address (location) 
		System.out.println( s == s1); // true 
		System.out.println(s==s3); // flase
		System.out.println(s3== s4); // false
		
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
		
		
		// create all posible substring of sachin -- s sa sac sach sachi sachin
		
		StringBuffer newString  =  new StringBuffer("") ;
		// "" , ""+w = w 
		//0 123456
		// welcome
		for(int i =0  ;i<s.length() ;i++) {
			
			newString = newString.append(s.charAt(i)) ;
			System.out.println(newString) ;
		}
	
		//geeksforgeeks" ---  atm 8923 ---1000 1001 1002 --
	;
		
	}

}
