package dec9.CustomException;

public class Electionn {

	public static void validAge(int age) throws AgeException { // method signature 
		
// if age is less than 18 then it will thow its own custom exception that is ageexception 
		
		
		if(age<18) {
			
			throw new AgeException("you can't vote , School jao abhi ") ;
			
		}else {
			System.out.println("you are elegible of giving vote you can go for vote.");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			Electionn.validAge(15);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("sachin");
	
		
		//Electionn.validAge(15);
	}
}
