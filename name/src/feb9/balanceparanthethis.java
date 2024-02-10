package feb9;

import java.util.Stack;

public class balanceparanthethis {
	
	
	public static void main(String[] args) {
		//Input: str = “((()))()()” 
//				Output: Balanced
//				Input: str = “())((())” 
//				Output: Not Balanced 
		
		
//		int  count = 0 ;
//		for(int i =0 ;i<s.length();i++) {
//			if (s.charAt(i) == '(') {
//				count++ ;
//				
//			}else {
//				count -- ;
//				
//			}
//		}
//		if (count ==  0) {
//			System.out.println("Balanced");
//		}else {
//			System.out.println("Not Blanced");
//		}
  	String  s  = "((()))()())";
		Stack<Character>  st  = new Stack<>() ;
		boolean flg   = true ;
		for(int i =0  ;i<s.length() ;i++) {
			//(()))
			if (s.charAt(i) == '(') {
				st.push(s.charAt(i)) ;
			}else {
				
				if(st.size() == 0) {
					flg  = false  ;
					break ;
				}
				st.pop() ;
				
			}
			
			
		}
		
		if(st.size() == 0 && flg  == true ) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
		
		
	}

}
