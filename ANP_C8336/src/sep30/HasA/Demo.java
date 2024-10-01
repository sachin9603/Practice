package sep30.HasA;

public class Demo {
	
	public static void main(String[] args) {
		
		Address jj  = new Address("Bhopal" ,  "23452" , "MP" ) ; 
		
		Employee e1  = new Employee(90  , "Rameshewar" , new Address("Indore" , "8098098" , "MP"))
				;
		
		Employee e2  = new Employee(909  , "David" , jj ) ;
		
		System.out.println(e2);

		
		System.out.println(e1);
		
   
		
		
		
		
	}

}
