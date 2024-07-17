package jul15;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfInteger {
	
	public static void main(String[] args) {
		
		int[] arr  = {1,2,3,4,1,2,3,4,1,5}; 
		
		///find frequecy of each element  from integer array in java
		
		HashMap<Integer  , Integer>  map   = new HashMap<>() ;
		
		HashMap<Integer  , Integer>  map2   = new HashMap<>() ;
		
		map2.put(1212, 3) ;
		map2.put(9999, 4) ;
		
		
		//Integer o
		for(int i = 0  ;i<arr.length ;i++) {
//			if(map.containsKey(arr[i])){
//				map.put(arr[i], map.get(arr[i]) +1) ;
//				
//			}else {
//				map.put(arr[i],1);
//			}
			
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			
			
		}
		
		map.putAll(map2);
		
		map.putIfAbsent(122, 5) ;
		//System.out.println(map);
		
		map.remove(122) ;
		
//		map.clear() ;
		if(map.containsValue(4)) {
			System.out.println("4 is there ");
		}
		
		map.put(1212, 7) ;
		
		
		for ( Map.Entry<Integer, Integer>  mp : map.entrySet()) {
			
			System.out.println(mp.getKey() +"---->" + mp.getValue());
		}
		
		
		System.out.println(map.size());
		
	}

}
