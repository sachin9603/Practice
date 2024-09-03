package sep3;

public class Account {
	
	double amount  ;  
	
	Account( double amount) throws InsufficientFundException {
		if(amount<500) {
			throw new InsufficientFundException("can't open account  ");
		}
		this.amount =amount ;
	}
	
	public void withdraw(double am) throws InsufficientFundException {
		if(am>amount) {
			throw new InsufficientFundException("low balance ");
		}
		amount = amount - am ;
		System.out.println("please recive your amount ");
	}

}
