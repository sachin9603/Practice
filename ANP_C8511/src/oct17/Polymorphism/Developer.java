package oct17.Polymorphism;
// Developer is a Employee
public class Developer extends Employee  {
	
	
	@Override
	public void salary( ) {
		
	      super.dep = "Developer" ;
		super.salary();
		
		System.out.println("department of This Employee is " + super.dep );
		
		 System.out.println(" minimum wages ----- > 30000 you will get ");
	
	}
	
	
	public Developer() {
		//super() ; // it is calling parent class constructor 
		super() ;
	}
	
	
	
	
	
	


}
