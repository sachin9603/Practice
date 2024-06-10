package june7;

public class Employee {
	//Encapsulation in Java is a process of wrapping code and data together into a 
	//single unit, for example, a capsule which is mixed of several medicines.
	//The Java Bean class is the example of a fully encapsulated class.


	
//	Advantage of Encapsulation in Java
//	By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.
//
//	It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
//
//	It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
//
//	The encapsulate class is easy to test. So, it is better for unit testing.
//
//	The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.
//}
	
	private  int empId  ;
	private String empName  ;
	
	private  Address address ;///" indore 26442323 mp "
	
	
	
	// getts andd setter
	
	
	//kyuki aap in private varible ko is class k banar access nahi kar sakte tab aapko getter setter chahiye 
	
	
	// defaut contructor 
	public  Employee() {
		
		System.out.println("mai hu defalut or mujhe hi ye empp ka banana  hai ");
		
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	public void display(){
		
		System.out.println(" Employee EmpId  --- " + this.empId);
		System.out.println(" Employee EmpName   --- " + this.empName);
		System.out.println(" Employee EmpAddress  --- " + this.address);

	}
	
	

// this is parameter contructor 

	
	
	
	
	
	
	
	
	
}
