package jul17;

public class Demo22 {
	
	public static void p() {
		System.out.println("p top ");
		int data = 12/0  ;
		System.out.println("p bottom");
		
	}
	
	public static void n() {
		System.out.println("n top");
		p() ;
		System.out.println("n bottom");
	}
	
	
	
	public  static void m() {
		System.out.println("m top");
		n() ;
//		try {
//			
//		}catch(Exception e) {
//			
//			System.out.println(e);
//			
//		}
		System.out.println("m bottom");
	}
	
	public static void main(String[] args) {
		
		m() ;
		
	}

}
