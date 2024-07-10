package jul10;

public class Demo {
	// mutable string 
	public static void main(String[] args) {
		
		StringBuilder s  = new StringBuilder("welcome") ; // mutlithreaded 
		// non synchronised  there is no tread saftey 
		
		s.append(" home" );
		System.out.println(s);
		
		
		StringBuffer s2  = new StringBuffer("welcome") ;
		
		s2.append(" home" );
		
		s2.reverse() ;
		
		System.out.println(s2);
		
		
		
		
		
	}

}
