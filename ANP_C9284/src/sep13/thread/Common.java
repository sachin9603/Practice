package sep13.thread;

public class Common {
	
	public static synchronized void fun1(String name ) {
		
		System.out.print("welcome "); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(name);
	}

}
