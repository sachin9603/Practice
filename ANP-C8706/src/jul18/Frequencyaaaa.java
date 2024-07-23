package jul18;
import java.util.*  ;


public class Frequencyaaaa {
	
	
	
	public static void main(String[] args) {

		// arr of String
		
		String [] arr  = {"banana","apple" , "orange","banana","apple" ,"banana" ,"banana" ,"apple" , "orange"};
		
	 
		// banana  - 1
	   // crating object of map for storing string and ineteger
		Map<String  , Integer>  map  = new HashMap<>() ;
		
		for ( String fruit  : arr) {
			
//			if(map.containsKey(fruit)) {
//				map.put(fruit, map.get(fruit)+1 )  ;
//				
//			}else {
//				map.put(fruit,1 )   ;
//			}
			
			map.put(fruit, map.getOrDefault(fruit, 0) +1 ) ;
		}
		
		
		for( Map.Entry<String , Integer>   ekEntry  : map.entrySet()) {
			
			System.out.println(ekEntry.getKey() + "   ->  "+ekEntry.getValue());
			
			
		}
	}
	
	
	
	
	
	
}
