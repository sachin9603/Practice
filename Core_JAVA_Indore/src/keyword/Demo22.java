package keyword;

public final class Demo22 {
	
	final String pan  ; // object level par final hoga 
	
	Demo22(String pann) {
		
		this.pan = pann;
		
	}
	
	
	final int s  = 20 ;
	
	// this method can not override 
	
	
	// no override no modification 
	
	final public void run() {
		System.out.println("yes we are running ");
	}
	// final class can not be extend
	 public void run( int s) {
		System.out.println("yes we are running ");
	}

	 
	 public void save(final int g ) {
	
		
		 System.out.println(" g data is getting saveing ");
	 }
	 
	 
	 public static void main(String[] args) {
		
		 Demo22 kk = new Demo22("488465") ;
		
		 
			
		 Demo22 kkf = new Demo22("4865") ;
		 
		 
	}
	 
	 
}
