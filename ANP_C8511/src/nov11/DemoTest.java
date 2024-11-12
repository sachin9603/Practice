package nov11;

public class DemoTest {
	
	
	public static void main(String[] args) {
		
		
		Account a  = new Account("Chandan" , "34567892") ;
		
		a.deposit(-1);;// it is runtime exception 
		
		try {
			
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			a.withdraw(200);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
