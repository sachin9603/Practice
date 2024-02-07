package jan24;

public class Window {
	
	public static void main(String[] args) {
		
		
		int []arr  = {9,3,1,4,10,-6,51,3} ;
		
		int k = 3 ;
		int max = 0 ;
		// first k elements ka sum nikala 
		for( int i =0  ; i<k ;i++ ) {
			
			max +=arr[i] ;
			
		}
		
		int window_sum  = max ;
		
		
		for (int i = k ;i< arr.length ;i++) {
			
			window_sum  = window_sum + arr[i]  - arr[i-k] ;
			if(window_sum > max) {
				max = window_sum ;
				
			}
		}
		
		System.out.println(max);
		
		
		
		
		
		
	}

}
