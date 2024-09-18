package sep17.thread.DeadLock;

public class B {
	
	
	public synchronized void funB(A a) {
		
		System.out.println("funB of B Class stats ");
		
		
		a.fun1() ; // ye call nahi hogaa  kyuki isko run karne vala lock A k funA ko call 
		
		System.out.println("funB of B Class ends "   );
		
	}
	
	
	 public synchronized  void fun2() {
		 System.out.println("inside fun2");
	 }
	

}
