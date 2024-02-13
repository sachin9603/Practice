package feb13;

public class Basic {
	
 public static void main(String[] args) {
	 MultiThreaddd  hg  = new MultiThreaddd() ;
	 
	 Thread a  = new Thread(hg) ;
	 
	 a.start();
	 a.setName("SIMARAN" );
 MultiThreaddd2  hg2  = new MultiThreaddd2() ;
	 
	 Thread b  = new Thread(hg2) ;
	 b.setName("RAAJA" );
	 
	 b.start();
	 
	 Thread.currentThread().setName("Jalebi");
	 String name   = Thread.currentThread().getName() ;
	  for ( int i = 0 ;i<30  ;i++) {
		 
		 System.out.println("mai hu main thread   " + i +name  ); 
	}
	 
	 
	 
	 
	
	 
}
}
