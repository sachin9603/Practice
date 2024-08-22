package Aug16;

public class TreeNumbersmaxSum {
	
	public static void main(String[] args) {
		
		
		
		int arr[]  =  {12, 7, 6, 4, 98, 23, 45, 78, 90, 5, 33} ;
		
		int  n  = arr.length ;
		
		
		   int  k  = 3  ;
		   int sum  = 0  ;
		   
		   
		   for( int i =0; i<k ; i++ ) {
			    sum  = sum+ arr[i] ;
			 }
		   int max = sum  ;
		
		for(int  i  =  k  ;i<n  ;i++) {
			//System.out.println(sum);
			sum  = sum  - arr[i-k] ;
			sum = sum  + arr[i] ;
			if (sum > max) {
				max  = sum ;
			}
			
		}
	System.out.println(max);
		
	}

}
