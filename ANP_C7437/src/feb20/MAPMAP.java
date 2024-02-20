package feb20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MAPMAP {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map  = new HashMap<String , Integer>();
		
		map.put("sachin", 90 ) ;
		map.put("virat", 97 ) ;
		map.put("Dhoni", 78 ) ;
		map.put("Raina", 80 ) ;
		map.put("Rishabh", 91) ;
		
		Set<Entry<String, Integer>>  set  = map.entrySet() ;
		
		
		for(Entry<String, Integer>  e   : set) {
			System.out.println(e.getKey() +"---->" +e.getValue());
		}
		
Map<String, Integer> Lmap  = new LinkedHashMap<String , Integer>();
		
Lmap.put("sachin", 90 ) ;
Lmap.put("virat", 97 ) ;
Lmap.put("Dhoni", 78 ) ;
Lmap.put("Raina", 80 ) ;
Lmap.put("Rishabh", 91) ;
		
		Set<Entry<String, Integer>>  sset  = Lmap.entrySet() ;
		
		System.out.println("---------------linked hash map -------------------");
		for(Entry<String, Integer>  e   : sset) {
			System.out.println(e.getKey() +"---->" +e.getValue());
		}
		
		
		
		
		
		Map<String, Integer> Tmap  = new TreeMap<String , Integer>();
				
		Tmap.put("sachin", 90 ) ;
		Tmap.put("virat", 97 ) ;
		Tmap.put("Dhoni", 78 ) ;
		Tmap.put("Raina", 80 ) ;
		Tmap.put("Rishabh", 91) ;
				
				Set<Entry<String, Integer>>  tset  = Tmap.entrySet() ;
				
				System.out.println("--------------- Treemap -------------------");
				for(Entry<String, Integer>  e   : tset) {
					System.out.println(e.getKey() +"---->" +e.getValue());
				}
				
				
	}

}
