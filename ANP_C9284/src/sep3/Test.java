package sep3;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			Account ac  = new Account (50) ;
			
			ac.withdraw(700);
			
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
