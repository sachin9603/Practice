package jul17;

public class Bank {
	
	
	double amount  ;
	
	public Bank() {
		
		amount = 500 ;
		
	}
	
	
	
	public double withdraw(double payment) throws LowBalanceExeption {
		
		if(payment>amount) {
			throw new LowBalanceExeption("you can't withdraw that much amount ") ;
		}else {
			amount  = amount  - payment ;
			System.out.println("please recive your amount ");
			
		}
		
		System.out.println("your current balance is " +amount);
		return amount;
	}

}
