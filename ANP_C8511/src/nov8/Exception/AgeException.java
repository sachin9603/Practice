package nov8.Exception;

import java.util.Arrays;

// same age Exception can be type of Checked and unchecked 
public class AgeException  extends RuntimeException{

	
	
	@Override
	public String toString() {
		return  "it is object of exception " ;
	}

	public AgeException() {
	
	}

	public AgeException(String message) {
		super(message);
	}
	
	
	

}
