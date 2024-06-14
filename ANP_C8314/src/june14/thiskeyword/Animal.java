package june14.thiskeyword;

public class Animal {
	
	
	void saftey() {
		
		System.out.println(" saftey check is done ");
		
	}
	// this ko current class ki method ko call karne k liye bhi use karte hai 
	
	void eat() {
		 
		this.saftey();  // we are using "this " as intance 
		System.out.println(" they are eating something ");
		
		
	}

	
	public static void main(String[] args) {
		
		Animal s  = new Animal() ;
		
		
		
		
		s.eat();
		
	}
}
