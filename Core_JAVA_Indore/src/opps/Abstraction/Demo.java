package opps.Abstraction;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Bank B = new RBI() ; 
		
		System.out.println("==================================================");
	String s = B.saveDetails() ;
	System.out.println(s);
	
	//Bank  B2 = new Bank() ;// no we cant create object of abstract class
	
	
		
		
	}

}
