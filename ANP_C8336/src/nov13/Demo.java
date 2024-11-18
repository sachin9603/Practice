package nov13;

import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		
		
		HashMap<String , Integer> map  = new HashMap<>()  ;
		  ///    key      value
		map.put("Virat", 50) ;
		map.put("Pawan", 90) ;
		map.put("Sheetal", 80) ;
		map.put("Pooja", 40) ;
		
		map.put("Virat", 80) ;
		map.put("Abhay", 70) ;
		
	//	System.out.println(map);
		
		
		LinkedHashMap<String , Integer> mapp  = new LinkedHashMap<>()  ;
		  ///    key      value
		mapp.put("Virat", 50) ;
		mapp.put("Pawan", 90) ;
		mapp.put("Sheetal", 80) ;
		mapp.put("Pooja", 40) ;
		
		mapp.put("Virat", 80) ;
		mapp.put("Abhay", 70) ;
		mapp.put(null, 70) ;
		mapp.put("puneet", null) ;
		mapp.put("Shukveender", null) ;
		mapp.put( null, 800) ;
		
		
		Set<Map.Entry<String , Integer>> entrySset = mapp.entrySet() ;
		
		
		for(  Map.Entry<String , Integer> ee  : entrySset) {
			System.out.println(ee.getKey() +"---------->"+ ee.getValue());
		}
		
		
		
		TreeMap<String , Integer> mappp  = new TreeMap<>()  ;
		  ///    key      value
		mappp.put("Virat", 50) ;
		mappp.put("Pawan", 90) ;
		mappp.put("Sheetal", 80) ;
		mappp.put("Pooja", 40) ;
		
		mappp.put("Virat", 80) ;
		mappp.put("Abhay", 70) ;
		
		
		for(  Map.Entry<String , Integer> ee  : mappp.entrySet()) {
			System.out.println(ee.getKey() +"---------->"+ ee.getValue());
		}
		
		
		
	}

}
