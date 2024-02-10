package feb9;

import java.util.* ;
import java.util.Map.Entry;

public class Mpa  {
	
	
	public static void main(String[] args) {
		// SAchin --- 12  
		// rahul  --- 45  ;
		//
		
		Map<String  , Integer >  mp  = new HashMap<>() ;
		
		mp.put("Nida"  , 300) ;
		mp.put("Ram"  , 429) ; 
		mp.put("priya"  , 240) ; 
		mp.put("suresh "  , 700) ;
		mp.put("suparna"  , 340) ;
		
	Set<Entry<String,Integer>>  ssset  = mp.entrySet() ;
	
		
		for (Entry<String,Integer> e :ssset) {
			System.out.println(e.getKey() +" -------> " + e.getValue());
		}
		
		System.out.println("=================linked hashmap  ===========================");
		
	Map<String  , Integer >  mpp  = new LinkedHashMap<>() ;
		
	mpp.put("Nida"  , 300) ;
	mpp.put("Ram"  , 429) ; 
	mpp.put("priya"  , 240) ; 
	mpp.put("suresh "  , 700) ;
	mpp.put("suparna"  , 340) ;
		
	Set<Entry<String,Integer>>  sset  = mpp.entrySet() ;
	
		
		for (Entry<String,Integer> e :sset) {
			System.out.println(e.getKey() +" -------> " + e.getValue());
		}
		

		System.out.println("=================tree hashmap  ===========================");
		
		Map<String  , Integer >  tmpp  = new TreeMap<>() ;
		tmpp.put("zyan"  , 300) ;	
		tmpp.put("Nida"  , 300) ;
		tmpp.put("Nida"  , 3) ;
		tmpp.put("Ram"  , 429) ; 
		tmpp.put("priya"  , 240) ; 
		tmpp.put("suresh "  , 700) ;
		tmpp.put("suparna"  , 340) ;
			
		Set<Entry<String,Integer>>  set  = tmpp.entrySet() ;
		
			
			for (Entry<String,Integer> e :set) {
				System.out.println(e.getKey() +" -------> " + e.getValue());
			}
			
			ArrayList <String> l  = new ArrayList() ;
			
			l.add("Sachin") ;
//			l.add(4324234) ;
//			l.add('c') ;
//			l.add(true) ;
//			
			System.out.println(l);
			
			
			
			
			Box <>b  = new Box;
			
		
		
		
	}

	
}
