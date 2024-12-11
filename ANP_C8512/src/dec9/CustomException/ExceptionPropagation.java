package dec9.CustomException;

public class ExceptionPropagation {
	
	
	public static void m(){
	System.out.println("before p");
		p()  ;
		System.out.println("After P");
}
	
	public static void p() {
		System.out.println(" before  m");
		
		try {
			n()  ;
		}catch(Exception e ) {
			e.printStackTrace();

		}
		System.out.println("After m");
}
	
	
	public static void n() {
		System.out.println("before exception");
	int a  = 10  / 0  ;
	System.out.println("before exception");

	}
	
	public static void main(String[] args) {
		System.out.println("before main");
		m()  ;
		
		System.out.println("after main ") ;
		
	}

}
