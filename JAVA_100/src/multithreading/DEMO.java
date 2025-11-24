package multithreading;

public class DEMO {
	
	
	public static void main(String[] args) {
		
//		
//		A a  = new A()  ;
//		
//		Thread t1 = new Thread(a) ;
//		Thread t2 = new Thread(a) ;
//		t1.setName("Swati");
//		t2.setName("Sachin");
//		
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t2.setPriority(10);
//		
//		t1.start();// 2 thread 
//		t2.start() ;
//		
//		
//		
//		
//		
//		
//		
//		
//		B b  =  new B()  ;
//		b.start();
//		
		AA aa = new AA() ;
		
		aa.start(); ///// // 
		
//	try {
//		Thread.sleep(1000) ;
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
		
		try {
			aa.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int s = aa.sum ;
		System.out.println(s);
		
	}
	

}
