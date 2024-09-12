package sep12.Threads;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		int [] arr1  = {2 , 4 ,16 , 70,  75  ,  88  , 98  , 100  , 8889  } ;
		int [] arr2  = {3 ,7 ,78, 80 ,100 } ;
		
		// you need to creat a new array that should be sorted 
		
		   
       // {2  , 3 , 4 ,7  , 16 , 78 , 80  88 98  100 }   

        int[] mergedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        
        
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        
        

        System.out.print("Merged and Sorted Array: ");
        
       System.out.println(Arrays.toString(mergedArray));
	}

}
