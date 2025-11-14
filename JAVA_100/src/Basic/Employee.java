package Basic;

// bean 
public class Employee {
	// it will be printed before main method 
	static {
		System.out.println("I am static ");
	}
	private String name  ;
	private String dep  ;
	
	private static String company_name  = "TCS"  ;
	
	// you can not overide static method 
	// you can call this method  with name of Employee class
	public static void login() {
		System.out.println("check in ");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Employee(String name, String dep, String company_name) {
		
		this("sachin" , "IT") ;
		this.name = name;
		this.dep = dep;
		this.company_name = company_name;
	}
	public Employee() {}  ;
	
	public Employee(String name, String dep ) {
		
		this.name = name;
		this.dep = dep;
		System.out.println("sachin " + "IT");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dep=" + dep + ", company_name=" + company_name + "]";
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee e1  = new Employee("ww " , "CS" , "TCS")  ;
		Employee e2  = new Employee("Raka1ww " , "hr" , "TCS")  ;

		Employee e3  = new Employee("www " , "testing " , "TCS")  ;

		Employee e4  = new Employee("ww " , "HR" , "TCS")  ;
		
		
		Employee e11  = new Employee("Raka " , "CS" )  ;
		Employee e21  = new Employee("Raka1 " , "hr" )  ;

		Employee e31 = new Employee("Raka2 " , "testing " )  ;

		Employee e41  = new Employee("Raka3 " , "HR" )  ;
		
		System.out.println(e31.company_name);
		
		
		System.out.println(Employee.company_name);
		Employee.login();
	
		
		
	}
	
	

}
