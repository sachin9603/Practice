package feb12;

public class Basic {

	public static void main(String[] args) {
		
		int  i   = 10 ; 
		
		int j  = 0  ;
		
		//int k  = i/j ;
		
		// 1000method 
		// complie time issue 
		// runtime problem 
		// jo bhi class Exception ko directly inherit kar rahi hai vo saari class 
		// doirectly extend kar rahi hai vo saari class compile time exception degi mtlb  ---
		/// jab aap likh rahe ho tabhi aapko pata chal jaayega ki yaha problem aane avaali hai 
		
		
		///those class will extends Runtime class directly are called run time exception 
		
		String s = null  ;
		
		String  ff = "122ADASVS&323" ;
		 // ff = ff*12  ;
		
		
		try {
			int gg  = Integer.parseInt(ff) ;
			
			gg = gg*12  ;
			
			System.out.println(gg);
			
		}catch(NumberFormatException ee ) {
			
			ee.printStackTrace();
			
		}
		
		
		 
		
		
		// System.out.println(s.length()); 
		 System.out.println("end line ");
		
	}
}
