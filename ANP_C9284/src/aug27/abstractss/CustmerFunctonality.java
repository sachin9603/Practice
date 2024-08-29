package aug27.abstractss;

public interface CustmerFunctonality {
	
	int i  = 20 ; // public static final 

	// interface iis same as abs class but with this you can achive 100 % 
	// in this by default all method are abs 
	public void createCustomer() ;
	public void deleteCustomer() ;
	public void updateCustomer() ;
	public void findCustomerById();
	public void run() ;// abs 
	
	
	
	public static void wantMoreDiscount() {
		
		System.out.println("they want almost 50 percent discount ");
	}
	
	default void doingCalcution() {
		
		System.out.println("running or calculating ");
//		interface can achive 100 abs 
		// still it do have 100 percent abstraction 
	}
	
	
	
	

}
