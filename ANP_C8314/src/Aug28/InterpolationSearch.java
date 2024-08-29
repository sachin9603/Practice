package Aug28;

public class InterpolationSearch {
	
	private static int interpolationSearch(int[] arr, int lo, int hi, int k) {
		// TODO Auto-generated method stub
		
		int pos ;
		// 33
		
		while(lo <= hi && k >= arr[lo] &&  k <= arr[hi] ) {
			//int arr [] = {2,4,6,8,10,16,19,20,22,33,35,45, 49} ;
			//pos  = lo +(((hi-lo) /(arr[hi] - arr[lo]))*(k-arr[lo])) ;
			
		     pos = lo + (((hi - lo) * (k - arr[lo])) / (arr[hi] - arr[lo]));
			   // 0  + (12/47)*31
			System.out.println(pos);
			
			if(arr[pos]== k) {
			return pos  ;
			
			}
			
			if(arr[pos]<k) {
				lo = pos+1 ;
				
			}else {
				hi = pos -1 ;
			}
			}
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int arr [] = {2,4,6,8,10,16,19,20,22,33,35,45, 49} ;
		// there is element k  and you have to find its idx value 
		int n  = arr.length ;
		int k  = 33  ;
		
		// 86 is not there then return  -1 
		int uttar  = interpolationSearch(arr ,0 , n-1 ,  k) ;
		System.out.println(uttar);
	}

	

}
