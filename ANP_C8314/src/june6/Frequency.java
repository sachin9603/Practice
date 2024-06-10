package june6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Frequency {
	
	public static void main(String[] args) {
		
	
		
		//  
		 int [] arr = {12 ,45,23,67,23,89,12} ;
		 
		 
		 
		 int arr2 []  = {78,85,12,11,43,67,23,23,12} ;
		 int a  = arr.length ;
		 int b  = arr2.length ;
		 
		 int arr3[]  = new int[a+b] ;
		 
	    Set<Integer>  lstArr = new HashSet<Integer> (); 
	    
	  System.arraycopy(arr,0, arr3, 0, a);
	  System.arraycopy(arr2,0, arr3, a, b);
	  
	  System.out.println(Arrays.toString(arr3));
	  
	  for(int aaa :arr3) {
		  lstArr.add(aaa) ;
		  
	  }
	  
	  for(int aa :lstArr) {
		  System.out.println(aa);;
		  
	  }
	  
	    
//	    
//	    
//	    for( int i =0 ;i<arr.length ;i++) {
//	    	lstArr.add(arr[i]) ;
//	    }
//	    
//	    
//	    for( int i =0 ;i<arr2.length ;i++) {
//	    	lstArr.add(arr2[i]) ;
//	    }
//	    
//	   syso
	    
	    Integer[] arrrr =  
	            Arrays.copyOf(lstArr.toArray(), lstArr.size(), Integer[].class); 
		 
		 System.out.println(Arrays.toString(arrrr)); 
		 
		 
	}

}
