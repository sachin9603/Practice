package nov_14;

import nov11.InsufficientFundsException;

public class Achild extends A
{

	// it have to throw either  same exception  or  lower exception 
	// either
	// it is not necessary that this child have to give exception 
	public void simple(){
		
	System.out.println("I am child of simple  ");	
		
	}
	
	// it is not necessary that child will thow any exception 
	public void simple2()  throws RuntimeException {
		System.out.println("I am simple2 ");
	}
	
	
}
