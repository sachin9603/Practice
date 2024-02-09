package feb9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class arrayar {
	
	public static String reverString(String sss ) {
		
		// first of all you need make a stack 
		
		// you have to insert all the eelemnt into that stack 
		
		// you have a empty string
		
		// now you have pop out each element and addthis into string one by one 
		
		//and return that string 
		//sachin --- s ,a ,c ,h ,i ,n 
		
		Stack<Character>  stt  = new Stack<> () ;
		
		
		for ( int i =0 ;i<sss.length() ;i++) {
			stt.add(sss.charAt(i)) ;
			
		}
		
		String revString  =  "" ;
		
		
		
		for ( int i =0 ;i<sss.length() ;i++) {
			 
			revString= revString +stt.pop();
			
		}
		
	
		
		
		return revString ;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		List <Integer> arr  = new ArrayList<>() ;
		 //23  45 8 9 6 
		arr.add(23 ) ;
		
		arr.add(5 ) ;
		arr.add(8 ) ;
		arr.add(9 ) ;
		arr.add(6 ) ;
		arr.add(7 ) ;  //  O(1)
		int sum  =0  ;
		// suppose lenght  =n  n times time complexcity is = O(n)
		
		
		for ( int i  =0  ;i< arr.size() ;i++) {
			sum = sum + arr.get(i);
			
		}
		
		System.out.println(sum);
		
		
		Stack<String> st = new Stack<>() ; 
		
		st.add("ragav") ;
		st.add("rita") ;
		st.add("nida") ;
		st.add("suraya") ;
		st.add("shakti") ;
		
		// lifo  --- last in first out 
		
	 // peek()  , pop() 
		
		
		
		st.pop();
		st.pop();
		
		String lastElement   = st.peek() ;
		
		System.out.println(lastElement) ;
	System.out.println(st);
	
	
	// reverse a string using stack ;
	///sachin  --- nihcas
	
	String ggg = reverString("Tanishka") ;
	
	System.out.println(ggg);
		
	
	}
	
	
	

}
