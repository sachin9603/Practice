package feb13;

public class feb13 {
	
	void speed(final int  n) {
		//n+=50 ;
		System.out.println();
	}
	
	public static  void check() throws ExcessAmountWithdrawException {
		Bank.withdraw(23232);
//		try {
//			
//		} catch (ExcessAmountWithdrawException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

	public static void main(String[] args) {
		
	// ek exception banao  jisme aapko 
		
		// bank aap banao yadi paisa jyda nikalta hai customer toh 
		// bank ko exception throw karna chaiye 
	// you can't withdraw that much amount 
		
		Bank dd  = new Bank() ;
		dd.
	//dd.ifsccode = "dvasdfa" ;
	
	    dd.deposit(1200);
	    
	    //dd.rate();
	    
	    try {
			feb13.check();
		} catch (ExcessAmountWithdrawException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	    
	  //  dd.withdraw(24);
	   
	    System.out.println("end line ");
		
	}
	
}
