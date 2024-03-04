package feb21;

public class Demo {
	
	public static void main(String[] args) {
		
		B b = new B () ;
		
		Thread t  = new Thread(b) ;
		
		t.start();
		
		try {
			t.join();// main thread will wait tilll  t complete its entire task 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b.sum);
	 
	}

}
