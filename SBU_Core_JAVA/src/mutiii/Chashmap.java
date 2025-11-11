package mutiii;

import java.util.concurrent.ConcurrentHashMap;

public class Chashmap {
	
	public static void main(String[] args) {
		ConcurrentHashMap<String , Integer> mp  = new ConcurrentHashMap<> () ;
		mp.put("schi" , 45) ;
		mp.put("pooj" , 45) ;
		mp.put("har" , 45) ;
		mp.put("rah" , 45) ;
		
		
		 System.out.println("Map size: " + mp.size());

	        // Getting values from the map
	        System.out.println("Value of A: " + mp.get("har"));

	        // Removing elements from the map
	       /// mp.remove("B");
	        System.out.println("After removal map size is: " + mp.size());
		
		
	}

}
