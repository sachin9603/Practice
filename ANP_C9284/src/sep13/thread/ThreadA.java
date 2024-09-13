package sep13.thread;

public class ThreadA extends Thread {
	
	Common c  ;
	String name  ;
	
	
	ThreadA (Common c  , String name ) {
		
		this.c  = c  ;
		this .name  = name  ;
		
	}
	
   public void run() {
	   c.fun1(name);
   }
	

}
