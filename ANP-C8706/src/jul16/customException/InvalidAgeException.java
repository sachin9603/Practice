package jul16.customException;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		
	}

	public InvalidAgeException(String message) {
		super(message);
		
	}
}
