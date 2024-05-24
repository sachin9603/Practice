package feb13;

public class Bank  extends RBI{
	
	static double amount  ; 
//	final String ifsccode  = '22vhadskjas' ;
	
	public Bank() {
		this.amount   = 1000 ;
		System.out.println();
	}
	
	public  void deposit(double d) {
		
		amount = amount+d  ;
		System.out.println("ab aapka paisa "+ amount  +  " hai ");
		
	}
	
//	public void rate()  {
//		System.out.println(" kuch bhi ");
//	}
//	
	
	public static void withdraw(double d )throws ExcessAmountWithdrawException {
		
		if (d>amount ) {
			throw new ExcessAmountWithdrawException("itana paisa hi nahi hai  aapke aaccount ") ;
		}
		amount  = amount - d  ;
		System.out.println("abhi " + amount + " amount bacha hai aapke apasss ");
	}
	
	
	
	
	 

}
