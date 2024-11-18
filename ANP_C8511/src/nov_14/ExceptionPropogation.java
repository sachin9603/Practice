package nov_14;

public class ExceptionPropogation {
 
	
  public static void n() {
		
		System.out.println("before P ");
	  p() ;
	  System.out.println("after P ");
	}
	public static void p() {
		
		System.out.println("before M ");
		try {
			  m() ;
		}catch(Exception d) {
			System.out.println(d);
		}

	  
		System.out.println("after M ");
	}
	
	
	public static void m() {
		
		System.out.println("before exception ");
		
		int k  = 100  / 0  ;
		
		
		System.out.println("after exception ");
	}
	
	public static void main(String[] args) {
		
		n()  ;
		
		System.out.println("after n"); 
		
	}
	
	
}
