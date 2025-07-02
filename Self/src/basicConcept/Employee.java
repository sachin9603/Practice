package basicConcept;

public class Employee {
	
	//In Java, access modifiers are keywords used to set the accessibility (visibility) of classes, methods, constructors, and variables.
	//They control where these elements can be accessed from.
	
	public String name ="Ravi" ;
	
	private String adhar = "2212121424";
	
	String companyname = "TCS";
	
	
	protected  double salary  = 59000;
//	Definition: Accessible within the same package and in subclasses (even outside the package).
//
//	Usage: Common in inheritance where subclasses need access to parent data.
//	
	public void shift() {
		
		
		System.out.println("shift from 9 to 6 ");
	}
	
	public static void main(String[] args) {
		
//		Definition: The member is accessible only within the same class.
//
//		Usage: Used for encapsulation — hiding internal details.
		
		Employee e  = new Employee()  ;
		
		System.out.println(e.adhar);
		
		
	}
	
	
//	Definition: The member is accessible from anywhere in the project.
//
//	Usage: Used for APIs or components meant to be reused.
	
	
	
	
	//Definition: Accessible only within the same package.

     //Usage: Useful when we want to restrict usage to within a package.
	

}
