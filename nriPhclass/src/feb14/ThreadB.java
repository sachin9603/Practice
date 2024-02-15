package feb14;

public class ThreadB  extends Thread{
	
	Common c  ;
	
	String name  ;

	public ThreadB(Common c, String name) {
		this.c = c;
		this.name = name;
	}

	public ThreadB() {
		
	}
	
	
	public void run() {
		.fun1(name);
	}
	

}
