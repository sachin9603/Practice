package dec9.Exception;

public class Demo {
	
	
	// class area(method area), heap area ,  stack area
	
	static  int count  = 0  ;
	

	 public void i_am_akhriMostMethod() {
		 
		 System.out.println("ab mai  hu last of last ");
		 
		 
	 }
	
	 public void i_am_akhriMethod() {
		
		 
		 i_am_akhriMostMethod()  ;
		 System.out.println("ab mai run ho rha hu");
	 }
	
	public void simpleCalculation() {
		
		count++  ;
		
		
		System.out.println("I am doing some calculation ");
	//	i_am_akhriMethod() ;
		
		if (count  >10) {
			return ;
		}
		
	simpleCalculation() ;
		
		
	}
	
	
	public static void main(String[] args) {
		

		
		
//		Demo s  = new Demo()  ;
//		
//		s.simpleCalculation(); 
//		

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");
		

		String s = null ;
		
		try {

			System.out.println(s.length());
		}catch(Exception ss) {
			System.out.println(ss.getMessage());
			
		}
		
		
		
		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");
		
		
	}

}
