package chupeHuye;

public class ExceptionReturnCheck {
	
	public static int check() {
		try {
			int n  = 10  ;
			System.out.println("in try ");
			return n  ;
			
		}catch(Exception e){
			
			e.printStackTrace(); 
			return 25  ;
		}finally {
			System.out.println("in finally  ");
			return 95 ;
		}
	}
	
	public static void main(String[] args) {
		
	int c   = check() ;
	System.out.println(c);
	}
	
}
