package nov12;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		String s  = "welcome" ;// only this welcome will be create 
		String s2  = "welcome" ; // at this time no "string" // at this it will reference from previous string 
		
		
		s = s.concat("home") ;
		
		System.out.println(s);
		System.out.println(s2);
		// most imp 
		
		String t  = "welcome" ;
		
		
	}

}
