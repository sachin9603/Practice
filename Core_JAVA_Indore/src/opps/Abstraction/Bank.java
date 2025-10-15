package opps.Abstraction;

public abstract class Bank {
	
	Bank()  {
		this(9809809809L);
		
		System.out.println("I am getting called by child class const . , i am bank ");
	}  ; // it is getting called by super keyword  of child class constructoor 
	
	// is there is any private constructor 
	// can we create it 
	
	
	private Bank(long balance )  {
		System.out.println("this bank has balance " + balance);
	}
	
	
	
	//  ab Bank ----  mobilebank ,  GovBank 
	// this is saving details 
	public abstract String saveDetails() ;
	
	///public final void banklogo() ;
	
	

}
