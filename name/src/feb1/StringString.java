package feb1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StringString {
	
	
	
		public static void main(String[] args) {
			
			
			String s   = "sachin" ;
			
			String p  = "sachin" ;
			
			s = s+ "parmar " ;
			s = s+ " parmar " ;
			
			
			// sachin
			//sachinparmar
			//sachin parmar
			//sachin parmr
			
			// now i want to create a mutable string 
			
			//String ppp  = "" ;
			
			//first option is  StringBuffer  
			//""
			// 121212334r2342 sachin@9asdsadasdf always use charArray to store password 
			
		
			
			
			
		
		/// when you want to create a mutable string then always go with String buffer or string Builder
			//sachin parmar
			
			StringBuffer ss  = new StringBuffer("Sachin") ;
			ss = ss.append(" parmar") ;
			System.out.println(ss);
			// ye hai synchronized  mtlb ki ek baar mai ek hi thread is par kaam kar sakta hai 
			// this is little bit slow in comparison of STring Builder it is less efficient    java 1.0 
			
			
			
			StringBuilder ssss  = new StringBuilder() ;
			//  ye hai non synchronized  ; ka matlab hai ki multiple thread ek saath is par kaam karenge 
			
			// this String Bulder is fast   and more efficient  it came into java 1.5 
			
			System.out.println(ssss.capacity());
			
			ssss = ssss.append("Rajput12345678999asdasdfasdfasdfsadfsadfsadfsdfasdf") ;
			
			System.out.println(ssss.capacity());
			
			System.out.println(ssss.reverse());
			
//			The capacity() method of the StringBuffer class returns the current capacity of the buffer. 
//			The default capacity of the buffer is 16. If the number of character increases from its current 
//			capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
			
		//	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
			
			
			StringBuilder y  = new StringBuilder("hum") ; /// 16 but kuch daal raha hu toh 16 + char ki =length 
			System.out.println(y.capacity());
			y = y.append("Shiva") ; //
			System.out.println(y.capacity());
   		y = y.append("Rajput singh ji") ;
			System.out.println(y.capacity());
			System.out.println(y.capacity());
			
			// 
			//y.delete(0, 8) 
    
		//	y.insert(2 ,"Raja") ;
			
		// y.replace(1, 8 , "kak") ;
		 
//		System.out.println( y.substring( 2, 8) ); // substring start index se lekar last vale index se ek kam tak dega 
//		
//		
//		System.out.println(y.substring(4) );
//			System.out.println(y);
		
			
		//	pattern matchers
			
			String ooo = "abcd121343465789gyuiouhgfhjklhgfhjk3kkdasd@2334543CVXC" ;
			StringBuilder chars   = new StringBuilder() ; 
			
			StringBuilder nums   = new StringBuilder() ; 
			
		for(int i =0 ;i<ooo.length() ;i++) {
			//0 9
			
//			if (Character.isDigit(ooo.charAt(i))) {
//				nums.append(ooo.charAt(i)) ;
//			}else {
//				chars.append(ooo.charAt(i)) ;
//				
//			}
			int  ascii  = ooo.charAt(i) ;
			
			if (ascii >= 48 && ascii <= 57 ) {
				nums.append(ooo.charAt(i)) ;
				}else {
					chars.append(ooo.charAt(i)) ;
					
				}
				
		
		}
		
		System.out.println(chars);
		System.out.println(nums);
			
			
			
		
		List<Integer> ll =  Arrays.asList(1,3,5,6,74,3) ;
		
		//   mujhe is par kuch operation karna hai  or mai chahat hu ki ye list hamper na ho 
		// toh kya mai esa kar sakta hu ki iske saare obbj ko  mai ek pile mai daal deta hu and use  karleta hu and outpuit leleta hu 
		
		Stream<Integer>     pp  =  ll.stream() ;

		
		pp.forEach(ooopp->System.out.println(ooopp));
		pp.forEach(ooopp->System.out.println(ooopp));
		
		
		
		
		
		
//		for (int ttt :pp) {
//			System.out.println(ttt);
//		}
		
		
		
			
			
			
			
			
			
			
		}
	

}
