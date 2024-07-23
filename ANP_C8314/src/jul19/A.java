package jul19;

public class A implements Runnable {
   int sum  ;
   
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <=10; i++) {
			System.out.println("inside A thread");
			sum = sum + i; 
			}
		//55
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		A a1 = new A();
		
		
		Thread t = new Thread(a1);
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Here main thread will wait until the t thread completes
		//if we comment t.join then we will get incorrect value.
		int result = a1.sum;
		for (int i = 0; i < 10; i++) {
		System.out.println("inside main thread....");
		System.out.println(result);
		}
		
		
		
	}
	
	

}
