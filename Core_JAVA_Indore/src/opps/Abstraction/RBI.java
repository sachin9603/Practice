package opps.Abstraction;

public class RBI extends Bank {

	// Default
	
	
   public RBI() { 
	   super();
		// this super keyword is calling parent class const.
		System.out.println("I am calling parent con.");

	} ;
	
	@Override
	public String saveDetails() {
		// TODO Auto-generated method stub
		return "Customer details are getting saved ";
	}


}
