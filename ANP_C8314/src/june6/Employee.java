package june6;

public class Employee {
	
 // you have to create a class Employee then some fields like empid , empNmae
	//empDepartment  // emp salary 
	// then you have to create contructor also both 
	// then you have to create method like display  /// 
	// method empShift that is return string 
	// then you have to  create 5 object  of employee then assign them  value with 
	// contrustor and you have to run each method with each object 
	
	
	int emppId ;
	String empName ; // camelcase
	
   static String empDepatment = "IT" ;
   
     double salary ; // 70000.75

	public Employee(int e, String empName, String empDepatment, double salary) {
	
		this.emppId = e;
		this.empName = empName;
		this.empDepatment = empDepatment;
		this.salary = salary;
	}
     
     
	
	
	 	
	public Employee() {} ;
	
	
	
	public void display() {
		
		
		System.out.println(" emp Id----- >" + emppId);
		System.out.println("empName----- >" + empName);
		
		System.out.println(" empDepatment----- >" + empDepatment);
		System.out.println(" salary     ----- >" + salary);
		
		System.out.println("==============================================================");
	}
	
	 
	public String shift() {
		return "shift is from 9 to 6 " ;
	}
	
	

}
