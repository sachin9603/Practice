package nov11;

public class Account {
	
//	2. Bank Transaction with Insufficient Funds Exception
//	Task:
//	Create a custom exception class called InsufficientFundsException.
//	Write a BankAccount class that allows withdrawals. If the withdrawal amount exceeds the current balance, throw the custom exception.
//	Catch the exception and display an error message to the u

	
	String accountNo   ; 
	
	String userName ;
	
	double amount  ;
	
	
	
	public Account( String name   , String accno  ) {
		this.accountNo  = accno  ;
		this.userName = name  ;
		this .amount = 500 ;
		
	}
	
	// because it is unchecked 
	public void deposit(double rs)  throws InvalidAmountException{
		if(rs >= 0) {
			amount  = amount+ rs ;
		System.out.println("now your balance is "+amount );
		}else {
			throw new InvalidAmountException(" you Amount is in negative")  ;
			
		}
	}
	
	public double withdraw(double ruppee) throws InsufficientFundsException {
		if(ruppee > amount) {
			throw new InsufficientFundsException("you are withdrawing more than your balance") ;
		}else {
		System.out.println(" please collect your cash ");
			amount = amount - ruppee ;
			System.out.println("your remaining amount is : "+  amount );
		}
		return amount ;
	}
	
	
	
	
}
