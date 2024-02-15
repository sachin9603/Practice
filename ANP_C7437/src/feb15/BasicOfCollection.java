package feb15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.*;

public class BasicOfCollection {

	public static void main(String[] args) {
	
		//you have to create a simple array of index 5 
		// and you have to insert a value 
		// then you to print 
		 //0,1,2,3,4
		//{0,0,0,0,0}
		int[] arr  = new int [5] ;
		arr[0] = 12  ;
		arr[1] = 13  ;
		arr[2] = 14  ;
		
		arr[3] = 23232323 ;
		arr[4] = 90 ;
		
		// it is static in size i can't change size
		
		//arr[5] = 234 ;
		
		
		
//		for(int ab: arr) {
//			System.out.println(ab);
//		}
//		
		
		Integer arrrb[] = {8,8,8,9,5,4,3} ;
		
		arrrb[1] = 232323 ;
		
		
		System.out.println(Arrays.toString(arrrb));
		
		System.out.println(Arrays.toString(arr));
		
//		array list 
//		[23, 23, 23, 343, 77, null, null, null, 90]

		Set<Integer> list  = new HashSet<> () ;
		
		list.add(23) ;
		list.add(23) ;
		list.add(23) ;
		list.add(343) ;
		list.add(77) ;
		list.add(null) ;
		list.add(null) ;
		list.add(null) ;
		list.add(90) ;
		System.out.println("array list ");
		System.out.println(list);
		
	
//	     hashSet
//		[null, 23, 343, 90, 77]
		
		
		

	}

}
