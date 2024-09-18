package sep17.thread.DeadLock;

public class ThreaBB   extends Thread {
	
	A a  ;
	B b ;
	
	ThreaBB(A a  , B b) {
		this .a  = a  ;
		this .b  = b  ;
		
	}
	
	public void run() {
		
		b.funB(a);
	}

}
