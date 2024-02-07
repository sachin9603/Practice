package feb5;

public class Employee {
	
	int empId  ;
	
	String name  ;
	
	double salary  ;
	
	
	void shift() {
		System.out.println("from 10 se 6 ");
	}
	
	//poly morph  ---- run (konsas form use horahah run pata chalega ) , compile (code likhne k )

// default automatic hai /// lekin yadi aane ek parameter vala cons. bana liya hai toh default gayab ho gjata hai 
	// fir aapko default banana padega 
	
	public Employee() {
		super();
	}


	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	

}
