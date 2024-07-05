package jul2;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee() ;
		
		e1.setId("TCS123");
		
		e1.setName("Rakesh") ; 
		e1.setSalary(80000);
		
		System.out.println(e1);
		
		
		Programmer p = new Programmer() ;
		
		
		p.setId("TSCPRO123") ;
		p.setName("Rohini");
		p.setSalary(45000);
		 p.bonous  = 5000  ;
		 
		 System.out.println(p);
		 p.EmployeeKiShift();
		 
		 
		 Cat  c  = new Cat() ;
		 c.meow(); 
		 c.eat() ;
		 c.Respiration();
		 
		
		
		
		
		
		
	}

}
