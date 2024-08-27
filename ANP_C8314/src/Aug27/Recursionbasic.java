package Aug27;

public class Recursionbasic {
	
	public static int factorialFind(int g) {  //5
		if (g == 0 ) {
			return 1  ;
		}else {
		return g * factorialFind(g-1 ) ; // 5*24or joye de rahi hai factorialFind(g-1 ..4 )
		                                                       // 4 * 6 factorialFind(3)
		}                                                          //3*2 factorialFind(2)
		                                                              //2*1 factorialFind(1)
	}
	// 5*fac(4)
	     // 4* fac(3)
	         //  3*fac(2)
	            // 2* fac(1)
	                // 1*fac(0) == 1* 1
	
	
	public static void main(String[] args) {
		
		// 5*4*3*2*1 =12
		int ans  = factorialFind (5) ;
		
	}

}
