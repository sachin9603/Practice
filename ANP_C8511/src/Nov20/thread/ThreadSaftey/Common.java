package Nov20.thread.ThreadSaftey;

public class Common {
	// c1.fun1
	
	public static synchronized void fun1(String name){
		
		System.out.print("Welcome");
		try{
		Thread.sleep(1000);
		}
		catch(Exception ee){
		}
		System.out.println(name);
		
	}

   

 
}
