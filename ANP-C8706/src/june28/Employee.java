package june28;

public class Employee {
	
	int id ;
	String name  ;
	double salary  ;
	
	static String companyName = "TCS" ;
	

	
	
	
    public int shift() {
		System.out.println("meri shift 9 to  5");
		//return  9  ;
		return 9;
	}
   
	public void getSalary() {
		System.out.println("i will get salary on month end");
	}
	
	// jvm 
//
	
	public Employee() {
		
	}
	///constructor which was previoulsy provided by jvm is getting overloaded by this parameterise concstrtor
	// public private default protected 
	
	public void display(){
	System.out.println("id hai " +this.id );
	
	System.out.println("name hai " + this.name );
	System.out.println("salary hai " + this.salary );
	
	System.out.println("company hai " +this.companyName );
	}

	public Employee(int id, String name, double salary , String n) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.companyName = n  ;
		
	}
	
	public int add(int a , int b  ,int c) {
		return a+b+c ;
	}
	
	
	
	

}
