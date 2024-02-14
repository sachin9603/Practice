package feb14;

public class ThreadA  extends Thread{
	
	Common c  ;
	
	String name  ;

	public ThreadA(Common c, String name) {
		this.c = c;
		this.name = name;
	}

	public ThreadA() {
		
	}
	
	
	public void run() {
		c.fun1(name);
	}
	

}
