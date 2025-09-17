package oopss.inheritance;

public class Employee {
	
	
	 String name;
	 int salary;
	 String email ;
	 String password  ;
	 String userID ;
	 
	
	public void takingScrum() {
		System.out.println("doing planing ");
	}
	public void doingJOB() {
		System.out.println("doing multiple task");
	}


	public Employee(String name, int salary, String email, String password, String userID) {
		
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.password = password;
		this.userID = userID;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", email=" + email + ", password=" + password
				+ ", userID=" + userID + "]";
	}


	public Employee() {
		super();
	}
	
	

}
