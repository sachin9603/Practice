package june28;

public class Demo {
	
	///class area  /// heap area 
	public static void main(String[] args) {
		
	
	
	
		Employee  e1 = new Employee() ;
		
		e1.name  = "Rakesh" ;
		e1.id = 121  ;
		e1.salary = 70000 ;
		
		
		
		
		System.out.println(e1.name);
		
		e1.shift();
		
		e1.display();
		
		
		
		Employee e2 = new Employee(232323, "Rahul " , 45000.00 , "TCS") ;
		System.out.println(e2.name);
		
		e2.display();
		
		int cc = e2.add(12,12, 12);
		System.out.println(cc);
		
		
		
		
	}

}
