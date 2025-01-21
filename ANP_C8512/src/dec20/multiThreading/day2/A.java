package dec20.multiThreading.day2;

public class A  implements Runnable{
	
	 String name ;
     int sum  = 0 ;

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
		System.out.println("inside A thread");
		sum = sum + i;
		}
		// 5050

}
	
	// I am B
	public static void main(String[] args) {
		
	// this main method need that sum complet	
		
		A a1 = new A();
		Thread t = new Thread(a1);
		t.start();
		try {
			
			t.join(); // by join method main thread will wait unitil run method get completed 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int result = a1.sum;
		
		
		for (int i = 0; i < 10; i++) {
		System.out.println("inside main thread....");
		System.out.println(result);
		}
	}
	
}
