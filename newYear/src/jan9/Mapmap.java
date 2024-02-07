package jan9;

import java.util.HashMap;
import java.util.Map;

public class Mapmap {

	
	public static void main(String[] args) {
		
	Map<String , Integer>  map  = new HashMap<String , Integer> () ;
		
		map.put("Siva",  400 );
		map.put("riya",  500 );
		map.put("tina",  600 );
		map.put("tina",  600 );
		map.put("tina",  6900 );
		
		for( Map.Entry <String , Integer>  m: map.entrySet()) {
	System.out.println(m.getKey()+"----> "+m.getValue());  
		}
		
		
		
	}
}
