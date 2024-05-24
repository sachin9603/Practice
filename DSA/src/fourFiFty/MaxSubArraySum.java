package fourFiFty;

public class MaxSubArraySum {
	
public static void main(String[] args) {
	
	int []arr = {-10  , -2  , -3  , -4} ;
	
  int n  = 4  ;
  int max = arr[0] ;
  int curr  =  0  ;
  
  for (int  i =0  ;i<n  ;i++) {
	  
	  curr  = curr + arr[i] ;
	  
	  if (curr > max) {
		  
		  max= curr ;
		}
	  if (curr< 0) {
		  curr  =0  ;
		  
	  }
	}
  System.out.println(max);
}

}
