package day_3;

public class Demo {

	
	public static void main(String[] args) {
		
		
		
		Employee e1  = new Employee()  ;
		
		
		//e1.employee_name = "Rajuu" ;
		
		e1.setEmployee_name("Raka");
		
		
		System.out.println(e1.getEmployee_name());
		
		
		System.out.println(e1.getEmployee_name());
		
		
		
		Employee e2  = new Employee("HUNDA" , 99000 , "IT") ;
		
		System.out.println(e2.getEmployee_deparment());
		
		System.out.println(e2);
		
		
	}
}
