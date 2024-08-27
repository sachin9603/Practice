package lllll;

public class Quick {

	

	 
	// is partition ka kaam hai pivot ko arr mai sahi jagah fit karna or ye kaha fit hoga vo position batana 
	public static int partition(int arr[] , int low , int high) {
		// low = 0  , 0 * 6 3 5 2
		//  low = 1    1  * 
		// low = 2      1 
		// low = 3       2   6 3 5 9 2 8 
		//  low = 4     3   6 3 5 2 9 8 
		
		int pivot = arr[high] ;//8
		int i  = low-1 ; // -1
		//{6,3,9,5,2,8} ;
		for(int j  = low  ;j<high  ;j++) {
			if(arr[j] <pivot) {
				i++ ;
				int temp = arr[i] ;
				arr[i] = arr[j] ;
				arr[j] = temp ;
			}
		}
		
		i++ ;// 4
		int temp = arr[i] ;
		arr[i] = arr[high] ;
		arr[high] = temp  ;
		//6 3 5 2 8 9
		return i  ;//2 3 5 6 
	}
	
	
	public static void quickSort(int arr[] , int low  , int high) {
		//{6,3,9,5,2,8} 
		if(low < high) {
			
			int pi = partition(arr, low , high);
			
			quickSort(arr, low, pi-1) ;
			quickSort(arr, pi+1, high) ;
		}
		
	}
		
		public static void main(String[] args) {
			
			int arr[]  = {6,3,9,5,2,8} ;
			
			
			quickSort(arr, 0 , 5 );
			for (int j  : arr) {
				System.out.print(j +" ");
			}
			
			
			
			
			
		}

}
