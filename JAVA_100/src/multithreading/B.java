package multithreading;

// you will 
public class B  extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for ( int i=0 ;i<10 ; i++) {
			System.out.println(i +" mai  hu B");
		}
	}

}
