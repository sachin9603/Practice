package Collection;

import java.util.*;
public class Demo2 {
	
	
	public static void main(String[] args) {
		
		
		// HashSet --- it doest not allow duplicate value 
		// insertion order not follow 
		// and it does not allow more one null valhye 
		
		// internal working of hashset 
		
		Set<String>  set  = new HashSet<>() ;
		
		set.add("Sachin") ;
		set.add("Sachin") ;

		set.add("Arti") ;
		set.add("Golu") ;
		

		set.add("Pooja") ;
		set.add("Paankhi") ;
		
		set.add(null) ;
		set.add(null) ;	
		set.add(null) ;
		set.add(null) ;
		
		
		
		
		
		
		
		
		System.out.println(set);
			
			
	Set<String>  sset  = new LinkedHashSet<>() ;
			
	sset.add("Sachin") ;
	sset.add("Sachin") ;
	
	sset.add("Arti") ;
	sset.add("Golu") ;
			
	
	sset.add("Pooja") ;
	sset.add("Paankhi") ;
			
	sset.add(null) ;
	sset.add(null) ;	
	sset.add(null) ;
	sset.add(null) ;
	
		System.out.println(sset);
	
	// it doesnot allow any null value 
	
	
	Set<String>  ssset  = new TreeSet<>() ;
	
	ssset.add("Sachin") ;
	ssset.add("Sachin") ;

	ssset.add("Arti") ;
	ssset.add("Golu") ;
			

	ssset.add("Pooja") ;
	ssset.add("Paankhi") ;
			
	

		System.out.println(ssset);
		
		
		   // key , Value 
		Map<String, Integer> map = new HashMap<>();
		// does not allow duplicat key  
		// but allow dupicat value 
		
		// does not allow more one null key  
		// doest not maintain intertion order 
		// it allow multiple null value 
		
		
		map.put("Kartik", 70) ; // this value will be override over 70 it would become 90 
		
		map.put("Kartik", 90) ;
		
		map.put("punnet" , 77) ;
		map.put("Rakhi", 34) ;
		map.put("Shushma", 46) ;
		map.put(null ,23) ;
		map.put(null ,50) ;
	
		map.put("sushma " , null) ;
		map.put("Ram", null) ;
		map.put("Lakahn", null) ;
		
		Set<Map.Entry<String, Integer>> ss  = map.entrySet() ;
		
		
		for (Map.Entry<String, Integer> Vvvvvv :   ss) {

           System.out.println(Vvvvvv.getKey() + ": ---> " +Vvvvvv.getValue());
          
       }
		
		
		System.out.println(map);
		
	}
	
	

}
