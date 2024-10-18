package oct16.hasARelation;

public class Demo {
	
	public static void main(String[] args) {
		 
		Address kk  = new Address("898998" , "Ludhiyana" , "punjaab") ;
		
		Employee   e  = new Employee(88  , "Rakul" , kk )  ; 
		
		System.out.println(e);
		System.out.println(e.address.pincode);
		
		
		
		
	}

}
