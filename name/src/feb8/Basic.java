package feb8;

import java.util.Stack;

public class Basic {
	
	public static String reverseString(String ss )  {
		
		// you have create to stack 
		
		Stack <Character>  st = new Stack<>() ;
		
		
		 //ki aapko is string ka ek ek char dalana hai  stack 
		
		for (int i =0  ;i<ss.length() ; i++){
			
			st.add(ss.charAt(i));
		}
		
	   // string builder banalo  
		StringBuilder s = new StringBuilder() ;
		
		// ek ek char ko pop karna 
		
		while(!st.empty()) {
			
			s.append(st.pop()) ;
			
		}
		
		// or sting bulder mai append karna hai 
		// string StringBuilder return 
		
		
		
		return s.toString() ;
		
		
	}
	
	public static void main(String[] args) {
		
		String r  = "Rohan" ;
		// you have reverse this string using stack 
		String rString  = reverseString(r) ;
		System.out.println(rString);
		
		
		
	}

}
