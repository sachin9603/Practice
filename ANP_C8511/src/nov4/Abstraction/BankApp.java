package nov4.Abstraction;

public abstract class BankApp {
	
	String openTiming ="10:00" ;
	
	// showing functionality and hiding complexity
	
	public abstract void saveCustomer() ;
	
	public  abstract void carLoan() ;
	
	// concrete method 
	public void bankLogo() {
		
	System.out.println("bank's logo should be available 🐻‍❄️🐻‍❄️🐻");	
		
	}
	
	
	public  static void bankLicenseNumber() {
		System.out.println("3983hiui3049309304");
	}
	
	public BankApp() {
		this(500) ;
		System.out.println("mai hu parent ka cons");
	}
	
	private  BankApp( int  payment ) { 
		System.out.println("your account is open with "+ payment );
	}
	
	public final void personalLoanIntrest() {
		System.out.println("10%");
	}
	
	
	
	
	
}
