package Basic;

public class Demo2 extends String_discusstion {
	
	///this method is final you can't override 
	
//	public final void  run()  {
//		System.out.println(" final running is 4:28 sec for 1600");
//	}
	
	
	
	public void bubble()  {
		int [] arr = {5, 9, 2, 11, 9, 4}   ;
		      //////  // 5 2 9 9 4 11
		// pehle pass par  ---- 11 apni sahi position par chala jaye ga 
		int n = arr.length ;
		 int i;
		 int j ;
		  int temp ; 
	        boolean swapped;
	        for (i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    
	                    // Swap arr[j] and arr[j+1]
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were
	            // swapped by inner loop, then break
	            if (swapped == false) {
	            	break;
	            }
	                
	   

		
	}
	}
	
	public static void que1() {
//
//Write a Java program to find the second largest number in an array without using sorting.
//
//Example Input:
//arr = [5, 9, 2, 11, 9, 4]
//Expected Output:
//Second largest element is 9
		///          0  1   2  3   4 5 
		int[] arr = {5, 9, 2, 11, 9, 4} ; // 
		
		//
		int sb = arr[0];
		int uc  = arr[0];
		
		// 11 se chota ho lekin sabse bada ho
		for ( int i =1 ; i<arr.length ;i++) { 
			
			if(arr[i]>sb) {
				sb = arr[i] ;
			}else if (arr[i] > uc) {
				uc = arr[i] ;
			}
		}
		
		System.out.println(uc);
		}
	
	
	public static void main(String[] args) {
		//space  complexity 
		// time complexity (o)1
		que1()  ;
		
	}

}
