package pack01;

public class TestEmployee {

	public static void main(String[] args) {
		
		// ek object banana pada 
		
		String ss  = Employee.companyName ;
		System.out.println(ss);
		
		/*
		 * Employee ee1 = new Employee() ;
		 * 
		 * ee1.eName = "raja" ; System.out.println(ee1.eName);
		 */
		
		
		Employee e1  = new Employee("lakhan" ,"IT") ;
		e1.show() ;
	}
}
