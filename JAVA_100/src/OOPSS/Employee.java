package OOPSS;

public class Employee {
	
	protected String empName ;
	public String empAddress  ;
	private double salary ;
	
	
	// public  --- pure project mai access 
	// protected ---- same package , dusare package mai (Class should be child )
	//  default ----same package mai access only 
	// private 
	
	
	
	
//	//default
	public Employee() {
		
	}
//	
//	// parameterize cons.
	public Employee(String name , String address  , double salary  ) {
		this.empName  = name ;
		empAddress = address ;
		this.salary = salary ;
		
	}
//	
	// if you are not creating any cons then still you can create obj
	// when you are creating a parameter cons at that time default one will be GAYAB(It is getting overlloaded )
	// so when you are creating prameter conts. then you  need to create default one explicitly 
	
	
   public void dispaly() {
	   System.out.println("Employee name "+empName );
	   
	   System.out.println("Employee address "+ empAddress );
	   System.out.println("Salary  "+ salary);
   }
	
	
	

}
