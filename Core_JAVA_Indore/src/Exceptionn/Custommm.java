package Exceptionn;

public class Custommm {
	
// in method signature we have to use throws 
	public void checkAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("you are too short to vote ");
		}else {
			System.out.println("you can vote ");
		}
	}
	
	public static void main(String[] args) {
		Custommm obj = new Custommm() ;
		
		
		try {
			
		
			obj.checkAge(12);
		}catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last line");
		
	}
	
}


