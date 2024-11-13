package nov11.finallyy;

public class Demoo {
	
	
	public static String example() {
		
		
		
		
		
		try {
			System.out.println("I am  try ");
			int n  = 100  / 12 ;
			System.exit(0);
			System.out.println("mai hu 10 ");
			return "try" ;
//			int n  = 100  / 0 ;
//		
			
		}catch(Exception dd){
			
			System.out.println("I am catch");
		dd.printStackTrace();
		return "catch" ;
			
		}finally {
		
			System.out.println("Most Imp line of code ");
		 return "finally" ;
		}
		
		//return "non" ;
	
		
	}
	public static void main(String[] args) {
		
		String s =example() ;
		System.out.println(s);
		

		System.out.println("I am out side ");
		
		
	}	
		

}
