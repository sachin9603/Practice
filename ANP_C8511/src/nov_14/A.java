package nov_14;

import nov11.InsufficientFundsException;

public class A {

	
	// this is checked exception thrown by parent class 
	public void simple() throws InsufficientFundsException {
		
	System.out.println("I am simple ");	
		
	}
	
	
	public void simple2()  throws RuntimeException {
		System.out.println("I am simple2 ");
	}
}
