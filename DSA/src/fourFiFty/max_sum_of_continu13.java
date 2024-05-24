package fourFiFty;

public class max_sum_of_continu13 {

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        //1 2 3 -2 5
        long max  = Integer.MIN_VALUE ;
        
        for ( int i =0  ;i<n  ;i++) {
            
            int sum =0  ;
            for (int j=i ;j<n ;j++) {
                sum  = sum + arr[j] ;
                if(sum>max){
                    max = sum ;
                }
               
            }
        }
        return max  ;
        
    }
    
   static long maxSubarraySumbyKadane(int arr[], int n){
    	
    	long max  = arr[0] ;
    	long  curr = 0  ;
    	
    	for (int i  =0  ;i<arr.length ;i++) {
    		
    		curr  =  curr+ arr [i] ;
    		
    		if (curr> max ) {
    			max  = curr  ;
    			
    		}
    		if (curr < 0 ) {
    			curr  = 0   ;
    			
    		}
    		
    	}
    	return max  ;
    	
    	}
    
    public static void main(String[] args) {
		
    	int []arr  = {-2, -1 ,-4 , -5} ;
    	long ans  = maxSubarraySumbyKadane(arr , 4) ;
    	System.out.println(ans);
    	
    	
    	
    	
    	
	}
    
    
    

}
