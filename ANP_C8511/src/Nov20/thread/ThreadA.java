package Nov20.thread;

//  1st treeka -- you have to extends Thread Class and needs to implements run() 
public class ThreadA extends Thread  {

	@Override
	public void run() {
		
		for ( int i  =51  ;i<= 100 ; i++) {
			System.out.println("This is Another thread -->" + i);
		}
	}

}
