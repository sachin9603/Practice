package oct_15;

public class Employee {
	
   // in heritance 
	
	int eid ;  
	String name  ;
	
	public Employee() {
		
		System.out.println("I am initializing by child classs that is fED");
	}  ;
	
	public Employee(int eid, String name) {
		
        this.eid = eid;
		this.name = name;
		
	}
	
	
	///
	public void shift() {
		
		System.out.println("morning  6am to 3pm ");
		
	}
	

}
