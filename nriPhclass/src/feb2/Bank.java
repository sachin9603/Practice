package feb2;

public class Bank {

	double amount  = 1000 ;
	
	Bank(){
		this.amount =1000 ;
		
	}

	public Bank(double amount) {
	
		this.amount = amount  ;
	}
	
	
	
	public double  withdraw(double withdrawalAmount) {
		
		if (amount >=withdrawalAmount ) {
			 amount = amount - withdrawalAmount ;
			 System.out.println("withdraw successful");
		}else {
			System.out.println("itana paisa toh account mai hai hi nahi ");
		}
		
		System.out.println( "itna  paisa hai  " +this. amount);
		return amount  ;
	}
	
	
	public void deposit(double depositAmount) {
		
		amount = amount + depositAmount ;
		
		System.out.println("your current balance is " + amount);
	}
	
	void display() {
		System.out.println( " your balance " + this.amount);
	}
	
	
//	
//	1. Create a Bank class and declare an instance variable named amount of type double.
//
//	Create parameterized constructor to initialize variable “amount” with value 10000.
//
//	Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
//
//	Calculate withdrawal based on some condition  like
//
//	 If amount is sufficient then “withdraw successful” message will be printed on the console
//
//	 and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.
//
//	At the end display total balance on the console.
	
	public static void main(String[] args) {
		
		Bank sbi  = new Bank() ;
		
		sbi.display();
		
		sbi.deposit(1200);
		
		sbi.withdraw(500) ;
	}
	
}
