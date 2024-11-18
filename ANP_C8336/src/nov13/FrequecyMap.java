package nov13;

import java.util.* ;

public class FrequecyMap {

	
	public static void main(String[] args) {
		
		
		String s  = "puneetue" ;
//		r -1 
//	    a - 3 
//	    m -1
//	    n -1
		
		Map<Character  , Integer> fremap = new HashMap<>()  ;
		
		char [] charArray  =  s.toCharArray()  ;
		
		for(int i  =0 ; i<charArray.length  ; i++){
			
			if(fremap.containsKey(charArray[i])) {
				
				fremap.put(charArray[i], fremap.get(charArray[i])  +1 ) ;
              }else {
				fremap.put(charArray[i], 1) ;
			}
			
		}
		
		for ( Map.Entry<Character, Integer>  jk: fremap.entrySet()) {
			System.out.println(jk.getKey() +"--->" + jk.getValue());
		}
		
		
		
		
		
		
	}
}
