package feb14;

public class Common {
// ek object hi ek baar mai r
	public static  synchronized void fun1(String name) {
		System.out.print(" hello ");
		 // 1 sec k liye sojata hai 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
		
		
	}
	
	
	
	
}
