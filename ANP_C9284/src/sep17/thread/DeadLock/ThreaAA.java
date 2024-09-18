package sep17.thread.DeadLock;

public class ThreaAA   extends Thread {
	
	A a  ;
	B b ;
	
	ThreaAA(A a  , B b) {
		this .a  = a  ;
		this .b  = b  ;
		
	}
	
	public void run() {
		
		a.funA(b);;
	}

}
