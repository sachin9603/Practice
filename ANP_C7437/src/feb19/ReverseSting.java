package feb19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseSting {

	public static void reverse(String ss) {
/////// string to stack mai charracter data type k form mai store karalo
		
		// then ek dusrare string mai  ek ek data ko pop out kar add kardo dusre string mai 
	  // hariom  === {h,a,r,i,o,m }
		char[] chararray  = ss .toCharArray() ;
		
//		List<char[]> l   = Arrays.asList(chararray);
//		
//		System.out.println(l);
//		
//		ArrayList<Character> ccc  = new ArrayList<>() ;
//		
		//stack ka contructor list type ka data 
	Stack<Character> st  = new Stack<Character>() ;
	
	for (Character c  : chararray) {
		st.push(c) ;
	}
		
	//System.out.println(st);
	
	String reversest  = "" ;
	
	while(st.size() != 0  ) {
		reversest = reversest+st.pop();
	}
	System.out.println(reversest);
	}
	
	
	public static void main(String[] args) {
		reverse("hariom"); // moirah
	}
	
}
