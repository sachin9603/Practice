package oct_15;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1  = new Employee (89  , "Pankaj")  ;
		
		
		FrontEndDeveloper fd  = new FrontEndDeveloper (01 , "Raakhi"  , 40000) ;
		
		fd.learning(); 
		fd.shift();
		System.out.println(fd.eid);
		System.out.println(fd.name);
		System.out.println(fd.Salary);
		
		System.out.println("line number 16 ");
		FrontEndDeveloper  obj  = new FrontEndDeveloper()  ;
		
		
		
		
		
		
		
	}

}
