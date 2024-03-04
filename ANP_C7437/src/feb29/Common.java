package feb29;

public class Common {
// is synchronized method ko use karne k liye object ka lock cahiye 
	//static synchronized 
	public  static synchronized void fun1(String name ) {
		System.out.print("welcome ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name );
		
	}
	

	
	// chahe 50sychronised method ho un methods ko koi access nahi kar sakta
	// kyuki object ka lock ek sch method mai use ho raha hai
	
	
	
}
