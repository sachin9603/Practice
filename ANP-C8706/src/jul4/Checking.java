package jul4;

public class Checking {
	
	
	public static void main(String[] args) {
		
		
      // Bank b  = new Bank() ; you can't create object of this bank  
		
		ChildOfBank cb   = new ChildOfBank() ;
		cb.saveCustomer();
		cb.showLogo () ;
		
		Bank.acInAtm();
		
		
		
		
		
	}

}
