package OOPSS.abs;

public abstract class Bank {
	
	//abstract noun ---- 
//	Abstraction is a process of hiding the implementation details and showing only functionality to the user.

	// Another way, it shows only essential things to the user and hides the internal details, for example,\
	// sending SMS where we type the text and send the message. We do not know the internal processing about 
	//the message
	
	// how
	//--abstract method --- implementation part will not be visble to the user 
	
	// abstract method 
	public abstract void saveDetails()  ;
//	{
//		// rest code 
//	}
	
	/// concrete method 
	public void bankLogo() {
	System.out.println("This is wheel");	
	}
	
	public  abstract void rateOfIntrest() ;
	
	//why
	//Code Reusability: 
	//Defining a Common Interface:
	//Enforcing Method Implementation: 
	
	
	// Ques: is there is any default constructor in abs class 
	// yes 
	
	Bank(){
		this(900000000.21);
		System.out.println("This is Bank Constructor");
	}
	
	private Bank(double amount) {
		System.out.println("this bank have , this much amount "+amount );
	}
	

}
