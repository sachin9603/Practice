package jul15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequencys {
	
	
	public static void main(String[] args) {
		  // a b n 
		String  s  = "ascassppc" ;
		// a - 2  c - 2   s - 2  p - 2 {12,12,23,45,12,23,45}
		// count the frequecy of character 
		
		
		// array of char 
		
		char[] arr = s.toCharArray();
		
		
		HashMap<Character , Integer> map  = new HashMap<>() ;
		
		//a
		//System.out.println(Arrays.toString(arr));
		//a  scassppc
		
		//a - 2
		for(char c  : arr) {
			
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
				
			}
			}
			for(Map.Entry<Character, Integer>  ekPair : map.entrySet()) {
			
			System.out.println(ekPair.getKey() +"--->" +ekPair.getValue());
			
		}
		
		
		
		
		
	}

}
