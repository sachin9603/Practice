package feb15;

public class ThreadA extends Thread {
	
	ClassAA  a  ;
	ClassBB  b  ;
	
	public ThreadA(ClassAA a, ClassBB b) {
	
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		a.funA(b);
	}
	
	

}
