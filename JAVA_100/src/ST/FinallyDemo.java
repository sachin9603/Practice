package ST;
public class FinallyDemo {
public static void main(String[] args) {
    System.out.println("Result: " + testMethod());
}

static int testMethod() {
    try {
        System.out.println("Inside try block");
        return 10; // Returning from try block
    } finally {
        System.out.println("Finally block executed!");
    }
}
}
