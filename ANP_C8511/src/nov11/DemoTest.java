package nov11;

public class DemoTest {
	
	
	public static void main(String[] args) {
		
		
		Account a  = new Account("Chandan" , "34567892") ;
		
		try {
			a.deposit(-1);;// it is runtime exception 
		} catch (InvalidAmountException e) {
		      e.printStackTrace();
		}
		
		try {
			a.withdraw(200);
		} catch (InsufficientFundsException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
