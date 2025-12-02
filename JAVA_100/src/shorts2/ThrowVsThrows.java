package shorts2;
public class ThrowVsThrows {
	// Example of throws
void checkAge(int age) throws Exception {
if (age < 18) {
throw new Exception("You are not eligible!");  
}
System.out.println("You are eligible.");
}
public static void main(String[] args) {
ThrowVsThrows obj = new ThrowVsThrows() ;

try {
obj.checkAge(15);   // method with throws
} catch (Exception e) {
    System.out.println(e.getMessage());
}
}


}
