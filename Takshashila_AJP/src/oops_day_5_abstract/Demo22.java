package oops_day_5_abstract;

public class Demo22 {
	
	private String s =  "name" ;
	// this(), super(),, 
	// jaha par aap particular class ka object nahi banana chahte ho vaha contructor ko private kar dete hai 
	// singleton pattern 
	public Demo22() {
		 this(19);
		 
		 System.out.println(" mai hu public  cons ");
		
	
	}
	
	
	private Demo22( int speed) {
		// may be ye metthod call karo
		System.out.println("speed is " + speed );
		System.out.println(" i was private constructor");
	}
	
	
	public void startEngine() {
	
		
	}
	
	
	
	
	

}
