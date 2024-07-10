package jul9;

public class Demo2 {
	
	
	public static void main(String[] args) {
		
		// what is difference between ==  and equals operator 
		String s  = "welcome";
		String s2  = "welcome" ;
		
		
		
		String s3  =  new String("welcome") ;
		
		String s4  =  new String("welcome") ;
		
		System.out.println(s == s2);// true 
		System.out.println(s == s3); // flase
		System.out.println(s3 == s4); // false
		
		System.out.println(s.equals(s4));//  true
		System.out.println(s.equals(s2)); // true 
		System.out.println(s3.equals(s4)); //  true 
		
		
		
		
		
		
	}

}
