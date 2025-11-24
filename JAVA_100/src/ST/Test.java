package ST;
class B extends A {
B() {
	super() ;
    System.out.println("Child class constructor");
}
}

public class Test {
public static void main(String[] args) {
    new B();   // Abstract constructor will run
}
}
