package sep10.collection.map;

import java.util.*;
import java.util.Map.Entry;

public class Basic {

	
	public static void main(String[] args) {
		
		// need store data into key value pair 
		// sachin  40  
		// dhoni  90  
		// virat  80  
		
		//suresh   87 
		
		// hashset tha vesa hi hai hashmap 
		
		Map<String , Integer>  map  = new HashMap<>() ;
		//map.add("Dhoni" , 90) ;
		
		map.put("Dhoni", 90) ;
		map.put("Virat", 75) ;
		map.put("suresh", 80) ;
		map.put("sachin", 70) ;
		
		map.put("sachin", null) ;
		map.put(null, null);
		
		Set<Entry<String , Integer>> newSet  = map.entrySet();
		
		for( Entry < String , Integer > ee: newSet) {
			
			System.out.println(ee.getKey() + "----------->" + ee.getValue());
		}
		// one the famous question  ---> 
		int []arr  = {12,45,23,12,45,23,23,89} ;
		
		// you have to find frequecy of each number  12  - 2  
		
		// traversing the array  
		
		Map<Integer , Integer >  mp  = new HashMap<>() ;
		
		for (int s:arr) {
			
//			if(mp.containsKey(s)) {
//				mp.put(s, mp.get(s) + 1) ;
//				
//			}else {
//				mp.put(s, 1) ;
//				
//			}
			
			
			mp.put(s , mp.getOrDefault(s, 0) +1);
			
		}
		
		
		for ( Map.Entry<Integer, Integer>  oo :mp.entrySet()) {
			
			System.out.println(oo.getKey() +"---> " + oo.getValue());
			
		}
		
		
		
		
		
		
		System.out.println(newSet);
				
		
		System.out.println(map);
		
		//int[] arr  = 
		
		//isEmpty ,
		//map.remove("Dhoni");
		System.out.println(map);
	
		
		System.out.println(map.containsKey("Dhoni"));
		
		System.out.println(map.containsValue(80));
		
		map.putIfAbsent("Dhoni", 100) ;
		
		
		
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
}
