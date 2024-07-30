package jul29;

public class ThreadB extends Thread {
	
	
	A a1;
	B b1;
	
	public ThreadB(A a1,B b1) {
	this.b1=b1;
	this.a1=a1;
	}
	
	@Override
	public void run() {
	b1.funB(a1);
	}
	

}
