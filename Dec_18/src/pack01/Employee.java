package pack01;

public class Employee {
	
	String eName ;
	
	
	String eDepartment ;
	
	static String companyName  = "LIC" ;
	
	
	
	
	
	
	

	
	public Employee(String eName, String eDepartment) {
		
		this.eName = eName;
		this.eDepartment = eDepartment;
		
	}

	public void show(){
		
		System.out.println("employee name = " + this.eName); 
		System.out.println("employee depart = " + this.eDepartment); 
		System.out.println("employee companyName = " + this.companyName); 
		
	}

	public Employee() {
		
	}
	
	
	public void work() {
		System.out.println( "all employee shift will over after 6 pm");
	}
	
	public void eat() {
		System.out.println( "all employee will eat after 1pm");
	}
	
	
	public int salary(int days) {
		
		int sal = days*1000 ;
		
		return sal ; 
	}
	
	

}
