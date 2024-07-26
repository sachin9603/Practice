package jul26;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread mt=new MyThread();
		
		mt.start();
		
	
		synchronized (mt) { // key of mt object is getting used 
			//getting the lock of mt object
		
		System.out.println("main thread calls the wait method");
		mt.wait();
		/// now i m realsing key of mt object 
		
		System.out.println("main thread got the notification");
		System.out.println(mt.total);
		
		}
		
	}

}
