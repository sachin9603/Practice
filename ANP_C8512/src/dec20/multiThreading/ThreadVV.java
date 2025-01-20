package dec20.multiThreading;

public class ThreadVV  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("I am Thread VV  ---------------------------");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I am Thread VV  -----------------------OVER----");

	}

}
