package oct_15;
 //FrontEndDeveloper is a employee
public class FrontEndDeveloper extends Employee {
	
	
	int Salary  = 50000  ;
	
	
	public void learning() {
		System.out.println("learn latest tech in market related frontend ");
	}


	public FrontEndDeveloper() {
		
		super(); // default
		
	}


	public FrontEndDeveloper(int eid, String name , int salary ) {
		super(eid, name);
		
		this.Salary  = salary ;
		
	}


	public FrontEndDeveloper(int salary) {
		super();
		Salary = salary;
	}
	
	
	
	

}
