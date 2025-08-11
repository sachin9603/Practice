package oops;


// encapsulation ---  wraping code into a single unit is called encapsulation and java bean is perfect exmple for this 
public class Employee { //  it is example of java bean also and java bean is perfect example of encapsulation 
	
	
	// make all varible private 
	
	private String name   ;
	private String department  ;
	private double salary  ;
	
	
	// Employee has a address 
	private Address address  ;
	
  ///  private String address  ; /// city state picode  --"indore, MP, 883499"  
    
	
	
	
	
	
	
	// default constructor 
	
	public Employee() {} ;
	
	// paramertised constructor --- it will automatic overload default contrutor --- then we need to create explicitly default  cons. also 
	public Employee(String name, String department, double salary , Address add) {
		
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.address  =add  ;
		
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void shift()  {
		System.out.println("shift of emp is 10 to 6");
	}

	
	
	/// getter and setter 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override // ye bata raha ki ye toString koi super class se aarah hai 
	
	public String toString() {
		
		return "Ye hai meraaa Employee [ name=" + name + ", department=" + department + ", salary=" + salary + ", address= "+ address +"]";
	}
	
	
	
	// getter setter 
	
	
//	public void setName(String nam) {
//		
//		this.name  = nam  ;
//		
//	}
//	
//	public String getName(){
//		
//		return this.name  ;
//		
//	}
//	
	
	
	
	
	
	
	
	

}
