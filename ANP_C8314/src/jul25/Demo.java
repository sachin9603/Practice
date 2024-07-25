package jul25;

public class Demo {
	
	
	public  static int doCalculation(int a , int b) {
		
		int c  =   a+b  ;
		return c  ;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int a  = 10  ;
		int b  = 20  ;
		
		int ans = 30  ;
		
		
		if( ans == Demo.doCalculation(a, b) ) {
			
		System.out.println("test passs");
		
		}else {
			
			System.out.println("test fail");
			
		}
		
		
		
		
	}
	

}
