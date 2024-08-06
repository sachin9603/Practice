package Constructorrr;

public class Test {
	
	public static void main(String[] args) {
		
		
		Human h1  = new Human();
		
		h1.eye = 2  ;
		h1.humanName = "priyanka" ;
		
		System.out.println(h1.eye);
		
		Human h2  =  new Human(2 , 2  , "Raj" ) ;
		
		System.out.println(h2.humanName);
	
		
		
	}

}
