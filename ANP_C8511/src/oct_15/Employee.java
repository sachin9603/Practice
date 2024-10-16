package oct_15;

public class Employee {
	 // in heritance 
	
	
	int Eid ;  
	String name  ;
	
	public Employee() {}  ;
	
	public Employee(int Eid, String name) {

		this.Eid = Eid;
		this.name = name;
	}
	
	
	
	public void Shift() {
		System.out.println("morning  6am to 3pm ");
	}
	

}
