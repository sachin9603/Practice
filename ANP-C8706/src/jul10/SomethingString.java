package jul10;

public class SomethingString {
	
	
	public static void main(String[] args) {
		
		String s  = new String("welcome") ;
		
		char arr[] = {'a', 'b' , 'h' ,'i'} ;
				
		String s2  = new String(arr) ;
		
		System.out.println(s2);
		
		System.out.println(s);
		
		
		String j  = "welcome" ; // jab bhi aap literal k through string bana rahe hai 
		// toh there is space in heap area to store this special literal string that is know as 
		/// String constant pool  
		// when you waant to create a string with literal so jvm willl check first 
		//String constant pool if there is already present a "welcome" so jvm will not creeate a new String 
		
		String h = "welcome" ; // welcome  
		 // welcome home 
		
         //j.concat(" home") ; // this concept is called strings are immutable in java 
		
	  //  j = j.concat(" home") ;
	    
	    
		System.out.println(j);
		
		
		System.out.println(j == h); // true 
		System.out.println(j==s);  // false 
		
		System.out.println(j.equals(s)); // true
		System.out.println(j.equals(h));  // true 
		
		
//		
//		System.out.println(h.charAt(1));
//		System.out.println(h.length());
//		System.out.println(h.substring(3));
//		System.out.println(h.substring(1, 4));
//		System.out.println(h.toUpperCase());
//		System.out.println(h.contains("lco"));
		
		
		
		
		String pp= "RAj" ;
		//"RAj" 
		//"RAj0 
		//"RAj01
		//"RAj012
		//"RAj0123x
		//"RAj01234
		
		for (int  i =0  ;i<5  ;i++) {
			pp =pp+i ;
		}
		
		System.out.println(pp);//RAj01234
		
		
		
				
		
		
	}

}
