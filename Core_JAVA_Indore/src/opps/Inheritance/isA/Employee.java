package opps.Inheritance.isA;

public class Employee {
	
	private String name ;
	private String department ;
	private int salary ;
	
	public void working() {
		System.out.println("All employee are doing task ");
	}
	
	public Employee() {
		System.out.println("i am a employee cons");
		
	}
//	this, this() , super , super() 
	public Employee(String name, String department, int salary) {
		this() ;

		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
