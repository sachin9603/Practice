package nov4.Abstraction;

public class BankChild extends BankApp {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("there is huge process to save customers details ");
		
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stuby
		System.out.println("your civil score should be above 750 ");
		
	}
	
	
	public BankChild() {
		super()  ; // agr parent mai default cons. nahi hai toh issue hoga child ka obj nahi banega	
		System.out.println("mai hu  child  const ");
	}

}
