package inheritance_intro;

// sub class, child class
// Developer is a Employee
public class Developer extends Employee{
	
	double bonus ;
	
	public void mergeCode() {
		System.out.println("code has been merged ");
	}
	
	
	public static void main(String[] args) {
		
		Employee e1  = new Employee()  ;
		
		e1.empName = "Sonu" ;
		e1.empEmail ="sonu@gmail.com" ;
		e1.salary = 50000;
		
		e1.shift();
		
		
		Developer d1  = new Developer()  ;
		d1.empName ="Ritu" ;
		d1.empEmail = "Ritu@gamil.com" ;
		d1.salary = 80000 ;
		d1.bonus = 2000 ;
		
		d1.shift();
		d1.mergeCode();
		
		
		System.out.println("Developer Email -> "  + d1.empEmail);
				
		
		
		
		
	}

}
