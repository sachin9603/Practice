package jan25;

import java.util.Arrays;

public class Basic {

	// array of two element whose sum is equal to k 
	public  static int[]  findValueOfk(int [] arr , int k) {
		
      Arrays.sort(arr); //yaha sort ho raha hai 
		
        int l  =0  ;
		int r  = arr.length -1  ; 
		
		int ansArray[]  = new int [2] ;
		
		 
		while(l<r){
		    // 3 4 5 6 13 
			if(arr[l] + arr[r] == k) {
				//System.out.println(arr[l]+" " + arr[r]);
				ansArray[0] =  arr[l] ;
				ansArray[1] =  arr[r] ;
				
				return  ansArray ;
				
			}else if(arr[l] + arr[r] < k) {
				l++ ;
				
			}else {
			r-- ;
			}
		}
		
		return null ;
		
			
		}
		
	
	
	public static void main(String[] args) {
		
		int arr []  = {2,4,7,84,35} ;
		int k  =  88 ;
		
		int a[]  = findValueOfk(arr , k) ;
		
		System.out.println(a[0] + " "+ a[1]);
		
		
		
	}
}
