package jul5;

public interface CustomerInterface  extends CustomerKAFatherInterface{
	
	int age  = 18  ;
	
	// givig service 
	
	void saveCustomer();
	
	void deleteCustomer();
	
	static void newFunctionality() {
		System.out.println("it can have implementation into interface ");
	};
	
	default void upateCustomer() {
		System.out.println("it is default method ");
	};
	
//	private void checkcheck() {
//		System.out.println("checking.....");
//	}
//
//	
	

	
	

}
