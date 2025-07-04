package day_3;
// it is java bean 
public class Employee {
	
	/// class is blue print for object 
	
	// variable
	private String employee_name ;
	private double employee_salary  ;
	private String employee_deparment ;
	
	
	//constructor--- it is same as method but it does not return any thing explicitly 
	// but they are returning implicitly they are returning object 
	
	/// default  --- ye toh humesha hi rehata hai 
	
	public Employee() {
		
	}
	// if we are not creating any parametrise contructor then there is no need to create default one 
	// but if we are creating any paramerterise constructor then we must have to create default one 
	
	
	
	///
	//parameter vala 
	
	public Employee(String naam  , double paise  , String dep )  {
		
		this.employee_name = naam;
		this.employee_deparment = dep  ;
		this.employee_salary= paise  ;
		
	}


	

	// copy contructor
	
	
	// or getter or setter se 
	
	// is is special type of method that is used to access private variable 
	
	

	
	


	public String getEmployee_name() {
		return employee_name;
	}



	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}



	public double getEmployee_salary() {
		return employee_salary;
	}



	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}



	public String getEmployee_deparment() {
		return employee_deparment;
	}



	public void setEmployee_deparment(String employee_deparment) {
		this.employee_deparment = employee_deparment;
	}



	
	
	// tostring method is  String  representation of any object 
	

	@Override
	public String toString() {
		return "Employee [employee_name=" + employee_name + ", employee_salary=" + employee_salary
				+ ", employee_deparment=" + employee_deparment + "]";
	}
		
	
	
	
	
	

}
