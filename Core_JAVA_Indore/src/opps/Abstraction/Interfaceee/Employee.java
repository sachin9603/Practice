package opps.Abstraction.Interfaceee;

public interface Employee {
	
	int age  = 23 ; //public, static and final  
	
	
	abstract void saveDetails() ;
	
	void updateDetails() ;
	
	void deleteDetils()  ;
	
	public static void companyName() {
		
		System.out.println("Tech Ghar  ki bhasha mai");
	}
	
	// java 8 
	default void companyLogo() {
	 System.out.println("Cup of coffee ");
	}
	
	// java 9 
	private void companyFund() {
		System.out.println("7987987987984354");
	}
	
}
