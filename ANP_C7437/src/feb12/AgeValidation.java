package feb12;

public class AgeValidation {

	public static void validAge(int a) throws InvalidAgeException{
		 
		if(a>= 18) {
			System.out.println("you can vote ");
		}else {
			throw new InvalidAgeException("aap pehle bade ho jaao ");
			
		}
	}
	
	
	public static void main(String[] args) {
		
	/// validAge(17) ;
		
		try {
			validAge(17) ;
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("the end");
		
	}
}
