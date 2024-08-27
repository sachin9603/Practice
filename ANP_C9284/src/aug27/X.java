package aug27;

public class X {
	
	X() {
		this(4545343) ;
	System.out.println(" this is empty constructor ");	
	}
	
	X(int i) {
	
		
		System.out.println(i + " ye aapne interger vala constor call kiya hai ");
	}

	public static void main(String[] args) {
		
		X bb  = new X() ;
		
	}


}
