package feb12;

public class Demo {

//	@Override
//	public void run() {
//		
//		for ( int i =0  ;i<20  ;i++ ) {
//			System.out.println("inside Thread A " +  i);
//		}
//	}
	
	
	public static void main(String[] args) {
		// single thread tha 
		ThreadA a   = new ThreadA() ;
		
		ThreadB  bbb = new ThreadB() ;
		
		bbb.start();
		
			//a.run();// single thread hi behave karega 
	         a.start();// with help of start method you can use this thread into parallel

		for ( int i =20  ;i<40  ;i++ ) {
			System.out.println("inside MAIN  " +  i);
		}
		
	}
}
