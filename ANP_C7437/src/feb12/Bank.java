package feb12;

public class Bank {

	public static void login(String email  , String password ) throws LoginException {
		
		
		if(email.equals("sachin@123.gmail") && password.equals("1234") ) {
			System.out.println(" you are logged in successfully ");
		}else {
			throw new LoginException("id yaa password galat ") ;
			
		}
	}
	public static void main(String[] args) {
		try {
			login("sachin@123.gmail" , "1234") ;
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
