package march1;

public class Main {
	
	public static void main(String[] args) {
		
		MyThread mt=new MyThread();
		
		mt.start();
		
		synchronized(mt) {
			System.out.println("main thread calls the wait method");

			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("main thread got the notification");
			System.out.println(mt.total);
		}
		
		
		
	
	}


}
