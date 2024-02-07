package jan1;

public class BankTest {
	// jab mai method ka 
	//thows keyword is used with method signature 
	//public static String SaveDetails(int code) throws BankDetailsSaveException {
//		
//		// ye checked ka example hai kyuki ye exception  // 
//		// Exception class ko extend kar rha hai 
//		if(code  != 1234) {
//			throw new BankDetailsSaveException("code is wrong  ") ;
//		}
//		
//		return "save" ;
//		
//	}
	
	
	static void validate (int age) throws InvalidAgeException{    
	       if(age < 18){  
	  
	        // throw an object of user defined exception  
	        throw new InvalidAgeException("age is not valid to vote");    
	    }  
	       else {   
	        System.out.println("welcome to vote");   
	        }   
	     }    
	  
	
	public static void main(String[] args) {
		
//		try {
//			SaveDetails(123);
//			
//			
//			
//		} catch (BankDetailsSaveException e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		
		 ///validate(14); 
		
		 try  
	        {  
	            // calling the method   
	            validate(13);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
		System.out.println("everything is ohk ");
		
		
	}

}
