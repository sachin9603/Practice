package sep13.thread;

public class ThreadB extends Thread {
	
	Common ccc  ;
	String name  ;
	
	
	ThreadB (Common c  , String name ) {
		
		this.ccc  = c  ;
		this .name  = name  ;
		
	}
	
   public void run() {
	   ccc.fun1(name);
   }
	

}
