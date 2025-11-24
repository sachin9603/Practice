package multithreading;

public class A  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for ( int i=0 ;i<10 ; i++) {
			System.out.println(i +" mai  hu A" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
