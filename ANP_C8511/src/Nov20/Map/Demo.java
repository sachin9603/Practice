package Nov20.Map;

import java.util.*  ;

public class Demo {
	
	public static void main(String[] args) {
		
		
		// String ---- > number  
		// virat 59
		// sachin 58
		// vaibhav 90  
		    // key      value 
		Map<String , Integer> mp  = new HashMap<> ()  ;
		
		// Entry
		mp.put("Shivam", 89) ;
		
		mp.put("Vaibhav", 79) ;
		mp.put("Pritvi", 69) ;
		mp.put("Shobha", 81) ;
		mp.put("Pooja", 89) ;
		mp.put("Shivam", 92) ;
		
		mp.put(null, 70) ;
		mp.put(null, 98) ;
		
		
		
		mp.put("Rohan " , null) ;
		mp.put("Shubham " , null) ;
		mp.put("Raj" , null) ;
		
		
		
		
		//System.out.println(mp );
		// you can add multiple null values but can add only one null  key i
		
		//internal working of hashmap 
		
		// how can we iterate this hasmap but it will allow duplicate value 
		
		
		// it will not allow duplicate key 
		
		Set<String > s  = new HashSet<>() ;
		
		
		Set<Map.Entry<String  , Integer>>  entrySet  = mp.entrySet() ;
		
		for (Map.Entry<String  , Integer>  ss  :entrySet) {
			System.out.println(ss.getKey() +"-------------->" +ss.getValue());
		}
		
		
		
		String ss = "jdsfnsjsjlsj" ;
		
		// j -- 4  
		// d -1 
		// find frequency of each charater in this string 
		
		Map<Character , Integer>  frequency = new TreeMap()  ;
		
		
		for (int i =0  ;i< ss.length()  ;i++) {
			
			if(frequency.containsKey(ss.charAt(i))) {
				
				frequency.put(ss.charAt(i) , frequency.get(ss.charAt(i)) + 1) ;
				
				
			}else {
				
				frequency.put(ss.charAt(i), 1)  ;
				
			}
			
		}
		

		Set<Map.Entry<Character  , Integer>>  entSet  = frequency.entrySet() ;
		
		for (Map.Entry<Character  , Integer>  entry :entSet) {
			System.out.println(entry.getKey() +"-------------->" +entry.getValue());
		}
	
		
		
		
	}

}
