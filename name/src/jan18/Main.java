package jan18;

public class Main {
	
	public static void main(String[] args) {
		
		Common c  = new Common () ;
		Common c1  = new Common () ;
		
		A t1  = new A(c, "Ram") ;
		
	   	B t2  = new B(c1, "Shyam ") ;
		
		t1.start() ;
		t2.start() ;
		
		//welcome  welcome Ram shyam 
		//welcome ram welcome shyam
		
	}

}
