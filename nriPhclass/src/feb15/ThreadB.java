package feb15;

public class ThreadB extends Thread {
	
	ClassAA  a  ;
	ClassBB  b  ;
	
	public ThreadB(ClassAA a, ClassBB b) {
	
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		b.funB(a);
	}
	
	

}
