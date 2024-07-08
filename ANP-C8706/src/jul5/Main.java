package jul5;

public class Main {
	
	public static void main(String[] args) {
		
		//CustomerInterface  in  = new CustomerInterface() ;
		
		
		
		CustomerImpl  vv  = new CustomerImpl() ;
		
		vv.deleteCustomer();
		vv.saveCustomer();
		
		vv.upateCustomer();
		
		vv.givingService();
		
		
		int a  =  vv.age ;
		
		
		
		
		CustomerInterface.newFunctionality(); 
	int j  = 	CustomerInterface.age ;
		
		
		
		
		
	}

}
