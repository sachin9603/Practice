package Aug28;

public class SearchingAlgo {
	
	
	public static int search(int [] arr  , int k) {
	
		//n+ n/2 + n/4-------------
		n/2^k = 1  
				n  = 2^k
				//log2n = k 
				
				
		
		
		int low   = 0  ;
		int high  = arr.length -1  ;
		while(low<= high) {
			///     0 1 2 3 4  5   6  7  8  9  10 11 12
				// {2,4,6,8,10,46,89,90,92,93,95,555,924} ; // 12 
			int mid = low +(high - low ) / 2 ;
			if(arr[mid] == k) {
				return mid ;
			}
			
			if(arr[mid] < k) {
				low  = mid +1  ;
			}else {
				high  = mid -1 ;
			}
		}
		return -1 ;
		
	}
	
	
	public static void main(String[] args) {
		
		
		int arr [] = {2,4,6,8,10,46,89,90,92,93,95,555,924} ;
		// there is element k  and you have to find its idx value 
		
		int k  = 92  ;
		
		// 86 is not there then return  -1 
		int uttar  = search(arr , k) ;
		System.out.println(uttar);
		
		
	}

}
