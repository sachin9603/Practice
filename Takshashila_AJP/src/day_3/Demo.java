package day_3;

public class Demo {

	
	public static void main(String[] args) {
		
		
		
		Employee e1  = new Employee()  ;
		
		
		//e1.employee_name = "Rajuu" ;
		
		e1.setEmployee_name("Raka");
		e1.setEmployee_deparment("IT");
		e1.setEmployee_salary(90000);
		
		System.out.println(e1);
		
		System.out.println(e1.getEmployee_name());
		
		
		System.out.println(e1.getEmployee_name());
		
		
		
		Employee e2  = new Employee("HUNDA" , 99000 , "IT") ;
		
		System.out.println(e2.getEmployee_deparment());
		
		System.out.println(e2);
		
		
		Employee e3 =new Employee ()  ;
		
		e3.setEmployee_salary(8000);
		
		e3.setEmployee_name("Devid");
		
		System.out.println(e3);
		
		
	}
}
