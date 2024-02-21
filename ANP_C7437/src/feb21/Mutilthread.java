package feb21;

public class Mutilthread extends Thread {

	// kya kare ki ek or thread 
    public void run() {
    	String name  = 	Thread.currentThread().getName() ;
    for(int i =250 ;i<=500; i++) {
    		System.out.println(i +"second thread "+name);
    	}
    }
	public static void main(String[] args) {
		
		
		//10 
		// 1 
		// 5 
   Mutilthread t1  = new Mutilthread () ;
   t1.setName("RAM");
	
	// runnable
	B t2  = new B() ;
	Thread thread2   = new Thread(t2) ;
	
	thread2.setName("MATrix");
	
	// extends thread class
	A a  = new A() ;
	a.setName("Demon Thread");
	a.start();
	
	//t1.run();// it will as single thread 
	thread2.start();
	t1.start() ;// second thread 
//	System.out.println(name);
	for(int i =0 ;i<250; i++) {
		
		System.out.println(i + "main thread " + Thread.currentThread().getPriority());
		
	}
}

}
