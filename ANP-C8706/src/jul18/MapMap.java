package jul18;

import java.util.*;

public class MapMap {

	public static void main(String[] args) {
	// Map  ---- hashmap 
		
		        //piyush  --  7 
		TreeMap<String , Integer>  mpp =  new TreeMap<>()  ;
		
		HashMap<String , Integer>  mp =  new HashMap<>()  ; 
		
		// only sinlgle null key allow  
		// multiple null value can be store  
		// it will not maintain any insertion order  
		// internal working of hasmap 
		
         mp.put("Piyush ", 7)  ;
         mp.put("Ruchi ",  8)  ;
         mp.put("Devanshi  ", 0)  ;
         mp.put("Yogendra ", 2)  ;
//         mp.put( null, 2)  ;
         mp.put( "Pp" , null )  ;

         mp.put("Ps" , null)  ;
         
         
         mp.put("Devanshi  ",9)  ;
         
         mpp.putAll(mp);
         
          
		for(Map.Entry<String, Integer> ee :mp.entrySet()) {
			System.out.println(ee.getKey() +"--->" + ee.getValue());
		}
		System.out.println("////////////////////////////////////////////////");
		for(Map.Entry<String, Integer> ee :mpp.entrySet()) {
			System.out.println(ee.getKey() +"--->" + ee.getValue());
		}
		
		
		
		ArrayList  ss  = new ArrayList<>() ;
		
		ss.add("sachin") ;
		ss.add(232323 ) ;
		ss.add(true) ;
		System.out.println(ss);
		
		
		
		
		
		
	}
}
