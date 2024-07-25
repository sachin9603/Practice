package jul25;

public class Common {

	
	public static synchronized void fun1(String name){
		//1000
		System.out.print("Welcome");
		try{
		Thread.sleep(1000);
		}
		catch(Exception ee){
		}
		System.out.println(name);
		}
	
	
}
