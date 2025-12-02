package shorts2;


// Custom Exception
class AgeException extends Exception {
public AgeException(String message) {
    super(message);
}
}





public class CustomExceptionDemo {

public static void main(String[] args) {
	
try {
    checkAge(15);
} catch (AgeException e) {
    System.out.println(e.getMessage());
}

}

static void checkAge(int age) throws AgeException {
if (age < 18) {
    throw new AgeException("Custom Exception: Age must be 18+");
}
System.out.println("You are eligible!");
}













































}
