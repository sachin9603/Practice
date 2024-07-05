package Jul1;

public class Bank {
	
	int amount  = 5000;
	
	public void withDraw(int payment) throws LowBalanceException{
	if (amount<= 500) {
		
		throw new LowBalanceException("your amount is too low ") ;
		
	}else {
		amount = amount - payment ;
		System.out.println("this is your payment kinldy recive ");
	}
		
	}
	
	
	public int deposite(int paisa) throws TooMuchAmountException{
		if (paisa > 100000) {
			throw new TooMuchAmountException("you have to go bank manually ");
			
		}
		
		amount  = amount + paisa ;
		
		return amount ;
		
	}
	
	
	

}
