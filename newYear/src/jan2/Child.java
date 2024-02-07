package jan2;

public class Child  {
	
	// ye checked exception throw nahi karskti but it can throw unchecked exception 
	
//public void aapkiUmra(int a) throws invalidAgeException {
//		
//			System.out.println("sabkuch sahi hai ");
//	
//		
//	}
	
	
	public void aapkiUmra(int a) throws ArithmeticException {
		
		
		 if (a < 0) {
			throw new ArithmeticException("umra kabhi minus mai nahi hoti ") ;
		}
		 
			System.out.println("sabkuch sahi hai ");
	
		
	}

}
