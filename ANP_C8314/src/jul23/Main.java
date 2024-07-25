package jul23;

public class Main {
	
	public static void main(String[] args){
		
		
		MyThread mt=new MyThread();
		
		mt.start();
		
		synchronized (mt) { //getting the lock of mt object
			System.out.println("main thread calls the wait method");
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}/// it will release lock of mt object 
			
			System.out.println("main thread got the notification");
		
		System.out.println(mt.total); // 
		
		
		
		}

}
}
