package aug23;

public class BasicDsa {
	
	//5 4 3 2 1
	public static int factorialFind(int g) { 
		if (g == 0 ) {
			return 1  ;
		}else {
		return g * factorialFind(g-1 ) ; // 5*24or joye de rahi hai factorialFind(g-1 ..4 )
		                                                       // 4 * 6 factorialFind(3)
		}                                                          //3*2 factorialFind(2)
		                                                              //2*1 factorialFind(1)
	}
	//2                                       1 2
	public static void print(int i ) {
		
		if(i>0) {
			print(i-1) ;  /// 2                             1     0
			System.out.print(i+" ");
		}
	}
	
	
	public 

	public static void main(String[] args) {
		
		int k   = 5  ;  //120 
		
		int ans   = factorialFind(k) ;
		System.out.println(ans );
		print(5) ;
		// 783236 sum of digits 
		
		
		//123%10  = 3+ sumOfdigit(123/10);
 		
		
		
//		int h  = 1  ;
//		for (int i=1 ;i<=5 ;i++) {
//			h = h*i  ;
//			
//		}
//		System.out.println(h);
		
		
//		 0 1 1  2  3  5  8 13 21
		System.out.println();
		
		int [] arr    =   new int [5];
		
		arr[0]  = 0  ; //0 1 1 2
		arr[1] = 1  ;
		
		for (int i  =2 ;i< 5 ;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i  : arr) {
			System.out.print(i+" ");
		}
		
		
	}
}
