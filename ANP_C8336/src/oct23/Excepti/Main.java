package oct23.Excepti;

public class Main {
	
	
	public void p () {
		System.out.println("before m");
		
		m()  ; //danger
		
		System.out.println("after m");
	}
	
	public void m()  {
		System.out.println("before q");
		try {
			q()  ;// danger
		}catch(Exception n) {
			System.out.println(n);
			}
		
		System.out.println("after q");
	}
	
	public void q() {
		System.out.println("before ex");
		
		System.out.println(100/ 0);
		
		System.out.println("after ex");
	}
	// before ex 
	
	public static void main(String[] args) {
		
		Main mm  =new Main() ;
		mm.p() ;
		System.out.println("after last lineeeeeeeeee"); 
		
		
		
		////main  p  m  q (ex)
		
	}
	

}
