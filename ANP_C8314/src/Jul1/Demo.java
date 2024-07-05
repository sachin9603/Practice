package Jul1;

public class Demo {
	
	public static void main(String[] args) {
		
		Bank bb  = new Bank() ;
		// unchecked, 
		
		System.out.println(bb instanceof Bank);
		
		try {
			bb.withDraw(10);
			System.exit(0);
		return;
		
//			
//			
//			
		}catch(LowBalanceException e) {
			System.out.println(e);
		
		}finally{
			
			System.out.println("you are most welcome ");
		}
		System.out.println("sachin");
		
		// checked exception 
		
//		try {
//			bb.deposite(666666);
//		} catch (TooMuchAmountException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			bb.deposite(666);
//		} catch (TooMuchAmountException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("sachin");
	}

}
