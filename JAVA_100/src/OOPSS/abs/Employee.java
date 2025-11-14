package OOPSS.abs;

public interface Employee {
	
	/// this variable is by default pulbic satic final 
	int salary  = 50000;
	
	/// all method will be abstract
	// Java 8, we can have default and static methods in an interface.
	 void saveEmployee() ;
	
	// after java 8
	// this method can be overridden 
	default void updateEmployee() {
		deletDetails() ;
		System.out.println(" you can write implementation  also ");
	}
	
	// this method can not be overridden 
	static void companyName() {
		
		System.out.println("Runn.pvt.ltd");
	}
	
	// we can have private methods in an interface.
	
	private void deletDetails() {
		System.out.println("Data are getting deleted ");
	}
	

}
