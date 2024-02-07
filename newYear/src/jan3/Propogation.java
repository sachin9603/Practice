package jan3;

public class Propogation {

	 static void m() {
		 System.out.println("from m1 ");
		int a = 12 / 0 ;
		System.out.println("from m2 ");
	}
	static void n() {
		System.out.println("from n1 ");
		m();
		System.out.println("from n2 ");}
	
	static void  p() {
		System.out.println("from p1 ");

		n() ;
		
//		try {
//			System.out.println("from p1 ");
//			
//			System.out.println("from p1 ");
//		}catch(Exception e ) {
//			System.out.println(e.getMessage());
//		}
	}
	
	static void okkk() {
		System.out.println("normal code");
	}
	
	
	public static void main(String[] args) {
		try {
			System.out.println("from main1 ");
			p() ;
			System.out.println("from p1 ");
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		
		
		
		okkk() ;
	}}
