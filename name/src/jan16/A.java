package jan16;

public class A extends Thread {
	
	
	@Override
	public void run() {
		for(int i =21  ;i<=40 ; i++) {
			
			System.out.println("Thread A thread   "+ i + Thread.currentThread().getName());
			
		}	
	}
	
   public static void main(String[] args) {
	System.out.println("start");
	
	
	A a = new A() ;
	a.start();
	
for(int i =0  ;i<=20 ; i++) {
		
		System.out.println("main thread   "+ i);
		
	}
	
}


}
