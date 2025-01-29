package dec20.multiThreading.Synchronisedd;

public class Common {

	
	// we want two thread Should not access this fun1 in one go 
	public static synchronized  void  fun1(String name) {
		
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
