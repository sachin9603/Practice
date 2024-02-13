package feb13;

public class MultiThreaddd implements Runnable,Comparable<MultiThreaddd>, Cloneable{
// you have to choose using Interface 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String name   = Thread.currentThread().getName() ;
		for ( int i = 30 ;i<=60  ;i++) {
			 System.out.println("mai hu MultiThreaddd thread    " + i +name); 
		 }
		
	}

	@Override
	public int compareTo(MultiThreaddd o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
