package jan2;

public class AgeTest {
	
	public static void checkAge(int age) throws invalidAgeException {
		
		if(age < 18) {
			
			throw new ArithmeticException("age should be greater than 18" );
		}
		
		System.out.println(" age is correct  ");
		
		
	}
	
	public static void main(String[] args) {
		
	//	The Java throw keyword is used to throw an exception explicitly.
		
	try {
		checkAge(27) ;
	} catch (invalidAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
//		try {
//			checkAge(2) ;
//		} catch (invalidAgeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			System.out.println("it will happen always ");
//		}
//		
	}

}
