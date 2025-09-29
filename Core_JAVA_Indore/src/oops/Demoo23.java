package oops;

public class Demoo23 {
	
	public static void main(String[] args) {
		
		Employee e1  = new Employee()  ;
		
		e1.setEnpName("Sachin");
		e1.setEnpdeparment("DEEP Tech");
		e1.setEnpAddress("BPL");
		
		System.out.println(e1.getEnpName());
		
		System.out.println(e1);
		
		
		Employee e22  = new Employee()  ;
		
		//e22.enpName = "    " ;
		
		e22.setEnpName("Sachin");
		e22.setEnpdeparment("CS");
		e22.setEnpAddress("Indore");
		
		String name  = e22.getEnpName();
		
		System.out.println(name);
		
		
		
		
		
	}

}
