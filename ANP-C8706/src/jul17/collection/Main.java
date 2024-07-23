package jul17.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		//   0 1 2  3 4 5 6 7
		// [12,23,1,3,5,3,5,3] ;
		int [] arr  = new int[5]; // {0,0,0,0,0}
		
		int [] ar = {12,232,12,34,34,312} ;
		
		
		
		
		for(int i  =0 ;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
		
		ArrayList
		
		
		
		arr[0] = 1000 ;
		arr[1] = 2000 ;
		arr[2] = 3000 ;
		arr[3] = 4000 ;
		arr[4] = 5000 ;
		
		                  // 5
		for(int i  =0 ;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
		
		
		int [] arr2 = {12,34,56,6452,221,34546,34};
		
		// what is difference b/w arr and arraylist 
		
		
		
		ArrayList<String> lst  = new ArrayList<>() ;
		
		lst.add("sachin") ;
		lst.add("vikas") ;
		lst.add("sumit") ;
		lst.add("rachna") ;
		lst.add("rashi") ;
		lst.add("aham") ;
		lst.add(null) ;
		lst.add(null) ;
		
		
		
		for(int i  =0 ;i<lst.size() ;i++) {
			System.out.println(lst.get(i));
		}
		
		
		for(String gg:lst) {
			System.out.println(gg);
		}
		
		
		Iterator itr  = lst.iterator();
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
		
		
		
		
		
		
		
		
	}

}
