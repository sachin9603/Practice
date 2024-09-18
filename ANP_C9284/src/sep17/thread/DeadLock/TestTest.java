package sep17.thread.DeadLock;

public class TestTest {
	
	
	
	public static void main(String[] args) {
		
		
		A a  = new A() ;
		B b  = new B() ;
		
		ThreaAA t1  = new ThreaAA (a ,b) ;
		ThreaBB t2  = new ThreaBB (a ,b) ;
		
		t1.start();
		t2.start(); 
		
		
	}

}
