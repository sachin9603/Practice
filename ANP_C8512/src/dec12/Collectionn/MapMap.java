package dec12.Collectionn;

import java.util.*;
import java.util.Map.Entry;

public class MapMap {
	
	public static void main(String[] args) {
		
		
		
		HashMap<String , Integer> mp  = new HashMap<String , Integer>()  ;
		
		mp.put("Sachin", 101) ;
		mp.put("virat", 100) ;
		mp.put("Dhoni", 60) ;
		mp.put("Sewag", 60) ;
		mp.put("Rishab", 100) ;
		mp.put("virat", 300) ;
		mp.put(null, 121) ;
		mp.put("xyz", null) ;
		mp.put("ABC", null) ;
		
		Set<Entry<String , Integer>> seet  = mp.entrySet() ;
		
		for (Map.Entry<String , Integer>   e : seet ) {
			
			System.out.println(e.getKey()+"------------->"+ e.getValue());
			
		}
		System.out.println(mp);
		// it will not maintain any insertion order 
		//it willl only one null key  
		// it will allow only uniq key but any key is getting added agian so its value will get override 
		
		
		
		//linkedhasset
		
		///  find frequency of a number ------
		
	// {1 ,2,43,2,1,1,4,5,6,7 ,4 }
		//{1 ---> 3 }
		/// 2 ---2 
		 // 43 - 1 
		//
		HashMap<Integer  , Integer  >  map = new HashMap<Integer  , Integer>()  ;
		
		int  [] arr  = {1,2,3,4,2,1,1,1,4,2}  ;
		
		for ( int  i =0  ;i<arr.length  ;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1) ;
				
			}else {
				map.put(arr[i], 1) ;
			}
		}
		
for (Map.Entry<Integer , Integer>   e : map.entrySet() ) {
			
			System.out.println(e.getKey()+"------------->"+ e.getValue());
			
		}
		
		
	}

}
