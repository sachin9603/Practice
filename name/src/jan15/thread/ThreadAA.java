package jan15.thread;

public class ThreadAA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
				for(int i =20  ;i<=40  ;i++) {
					System.out.println("second thread  --- " + i);
				}
		
	}
	
	public static void main(String[] args) {
		
		ThreadAA  a  = new ThreadAA () ;
	
		
		Thread t1  = new Thread(a) ;
		
		t1.start();
		
		for(int i =0  ;i<=20  ;i++) {
			System.out.println("main --- " + i);
		}
		
		
		
		
		
	}

	
}
