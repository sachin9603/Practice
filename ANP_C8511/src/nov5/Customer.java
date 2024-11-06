package nov5;

public interface Customer {
	
	
	
	// by default these methods public and abstract 
	 void saveCustomer() ;
	
    void updateCustomerDetails() ;
  
  
  // these varibale by default public static final 
  int age = 5  ;
  
  public static  void shift() {
	  System.out.println("all customer's shift time is  10 to 7 ");
  }
  
  
  default void companyName() {
	   System.out.println("TSC");
	}
  
	
	

}
