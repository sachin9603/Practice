package AUG1.Consumer;

public interface ConsumerInterfaceExample {
	
	static void doingSomeOperation( int n ) {
		
		int c  = n+10 ;
		
		System.out.println(c);
	}
	
	
    static void doingSomeOperation( String  some) {
		System.out.println("mai raaaha hu   ConsumerInterfaceExample ki doingSomeOperation");
		String result  = "welcome  " + some  ;
		
		
		System.out.println(result );
	}

}
