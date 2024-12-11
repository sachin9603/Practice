package dec9.Exception;

public class CheckedAndUnChecked {
	
	
	
	public static void main(String[] args) {
		
	     //checked 
		// jo code likhte vakt hi pata chal jaye ki ye line exception degi  vo checked hai 
		// 
		
		try {
			Class.forName("dec9.Exception.Service") ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
		// unchecked exception 
		
		int a  = 10  / 12 ;
		// no need to at compile time 
		// if there whould so you will get at runtime 
		// these exception are extending runtimeexception class 
		
		
		
		
//		 String s  =  "asd" ;
//		 System.out.println(s.charAt(12));
		
		
//		String s  = null  ;
//		System.out.println(s.length());// null pointer exception 
		
		
//		
//		String s  = "12o12" ;
//		
//		int num   = Integer.parseInt(s) ; numberformate exception 
		
		
		
		
		
		
		}

}
