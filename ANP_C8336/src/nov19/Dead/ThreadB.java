package nov19.Dead;

public class ThreadB  extends Thread{
	
	
	A a1   ;
	B  b1  ;
	
	public ThreadB(A a1, B b1) {
		
		this.a1 = a1;
		this.b1 = b1;
	}
	
	public void run()  {
		b1.funB(a1);
	}
	
	
	

}
