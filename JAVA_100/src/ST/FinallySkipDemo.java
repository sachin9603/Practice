package ST;
public class FinallySkipDemo {
   	public void run() {
		System.out.println("Sachin");
		run() ;
		
	}
public static void main(String[] args) {
testMethod();
}
static void testMethod() {
try {
// while (true) {} 
	FinallySkipDemo  s  = new FinallySkipDemo()  ;
	s.run();	
System.out.println("Inside"
		+ " try block");

// JVM terminates immediately
} finally {
System.out.println("Finally"
		+ " block executed!"); // This will NOT print
}
}
}
