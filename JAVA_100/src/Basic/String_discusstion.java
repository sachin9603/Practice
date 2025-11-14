package Basic;

import java.util.Arrays;

public class String_discusstion {
	
	public final void  run()  {
		System.out.println(" final running is 4:28 sec for 1600");
	}
	
	public static void main(String[] args) {
		
		String n1 = "welcome" ;// by literal 
		//n1.concat(" Home");
		String n2  = "welcome" ; /// by literal
System.out.println(n1); // it is not going  to change because of immutability
		
		
		// by literal--- this string is getting saved into scp (String constant pool area of heap)area  of heap

/// and new n2 will check firsct scp wheather a "welcome" is present or not then if 
//there is welcome present then it will return the refrence of previous welcome instead of creating new welcome /
		
		String name2 = new String("welcome" ); //  // by new Keyword  heap area only 
		String name3 = new String("welcome") ; /// every time a new String will be created 
		
		
		char[] arr= {'s','a', 'c' , 'h' , 'i' , 'n'} ;
		
		String nam3  =  new String(arr) ;
		
		
		
		//Immutability: Once instantiated, a String object cannot be modified. 
		//This immutable design is a deliberate choice to ensure thread safety, 
		//consistency, and efficiency, especially regarding the String pool mechanism.
		
		
		//n1  = n1.concat(" Home") ;
		
		System.out.println(n1);
		
		System.out.println(n1  == n2 ); // == it will check referance 
		System.out.println(n1.equals(name2)); // .equals values  check karega 
		System.out.println(n1 == name2); /// both reference are different 
		
		System.out.println(name2 == name3); //  // false 
		
		String  s  = "I love my India" ;
		String [] asrr = s.split(" ");
		System.out.println(Arrays.toString(asrr));
		String kk = s.intern();
		
		System.out.println(s.charAt(2));
		
		
		/// StringBuffer  , String Builder 
		
		StringBuffer oo = new StringBuffer("Welcome")  ; // but it mutable  String 
		
		oo.append(" home ") ;
		
		System.out.println(oo);
		
		
		
		
		StringBuilder mm  = new StringBuilder("Welcome ")  ; // but it mutable  String 
		mm.append("Home ") ;
		System.out.println(mm);
		
		
		
		
		
		
		
	}

}
