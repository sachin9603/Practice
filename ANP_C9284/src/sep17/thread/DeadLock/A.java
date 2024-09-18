package sep17.thread.DeadLock;

public class A {
	
	// suppose one thread entered into this method 
	public synchronized void funA(B b) {
		
		System.out.println("funA of A Class stats ");
		
		
		b.fun2() ; /// humehsaaa wait for fun2() // ye call nahi hogaa  kyuki isko run karne vala lock B k funB ko call  kar raha
		
		System.out.println("funA of A Class ends "   );
		
	}
	
	// now at same that thread can not enter into this or any other thred also can't because that 
	//that thread don't have object level lock because that lock is engaged in above method 
	
	 public synchronized void fun1() {
		 System.out.println("inside fun1");
	 }
	

}
