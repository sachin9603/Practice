package nov4.Abstraction;

public class Test {
	
	
	public static void main(String[] args) {
		
		//BankApp app2 = new	BankApp ();
				
				BankApp app = new BankChild()  ;
		
		app.bankLogo(); 
		app.carLoan();
		app.saveCustomer();
		app.personalLoanIntrest();
		
		Car v  = new Car() ;
		v.drive(); 
		//Vehicle v2  = new Vehicle() ;
		
		
		
		
	}

}
