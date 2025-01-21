package dec20.multiThreading.Synchronisedd;

public class Common {

	
	
	
	public synchronized static void  fun1(String name) {
		
		System.out.print("Welcome ");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(name);
	}
		
}
