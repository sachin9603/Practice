package dec9.Exception;

public class Finalllyyy {
//	catch(ArithmeticException ae){
//		System.out.println("I am arithmetic ");
//		ae.printStackTrace(); 
//	}catch (Exception e  ) {
//		
//	System.out.println("I am catch Exception ");
//		e.printStackTrace();
//	}
	public static void finallyExample() {
		
	
		
		try {
			//  suppose there is object which needs to be close 
			System.exit(1);
			int a  =10 / 0  ;
			System.out.println("I am normal Try");
			return; 
		}catch(ArithmeticException ae){
			System.out.println("I am arithmetic ");
			ae.printStackTrace(); 
			return ;
		}finally {
		
			System.out.println("I am finally ");
			
		}
	
		//System.out.println("I am finally  out side ");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("before ");
	   finallyExample() ;
		System.out.println("after ");
	}

}
