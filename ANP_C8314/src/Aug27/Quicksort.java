package Aug27;

public class Quicksort {
	
	
 
	// is partition ka kaam hai pivot ko arr mai sahi jagah fit karna or ye kaha fit hoga vo position batana 
	public static int partition(int arr[] , int low , int high) {
		
		int pivot = arr[high] ;//8
		int i  = low - 1 ; // -1
		//{6,3,9,5,2,8} ;
		for(int j  =low  ;j<high  ;j++) {
			if(arr[j] <pivot) {
				i++ ;
				int temp = arr[i] ;
				arr[i] = arr[j] ;
				arr[j] = temp ;
			}
		}
		i++ ;
		int temp = arr[i] ;
		arr[i] = arr[high] ;
		arr[high] = temp  ;
		return i  ;
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
		
		int[] arr  = {6,3,9,5, 2,8 };
		
		// 2  3 5 6 8 9 
		
		quickSort(arr , 0 , 5 );
		
		for ( int jj:arr) {
			System.out.print(jj+" ");
		}
		
	}

	
	
}
