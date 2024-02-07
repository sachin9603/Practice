package feb6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSt {
	
	
	public static void main(String[] args) {
		
	
		List<Integer>  li  = List.of(2,4,6,7,1,5,7,8,9) ; 
		
	//	li.add(1231) ;
		
		
		
		
		List<Integer> evenList  = new ArrayList<>() ;
		
		for(Integer ll  :  li) {
			if (ll%2 == 0 ) {
				evenList.add(ll) ;
			}
		
		}
		 System.out.println(evenList); 
		 
		 // using stream api  
		 
		 
		 Stream<Integer> stream  = li.stream() ;
		//2,4,6,7,1,5,7,8,9 
		 
		     
		/// List<Integer> newList0 = stream.collect(Collectors.toList())	 ;
		
		 
		
			     
			/// List<Integer> newList0 = stream.collect(Collectors.toList())	 ;
			 
			 List<Integer> newList2  = stream.filter(uuuuuuu-> uuuuuuu>7).collect(Collectors.toList())	 ;
			 
			
			 System.out.println(newList2);
	 List<Integer> numbers   = Arrays.asList(2,44,4,7,8); 
			List<Integer>  kk = numbers.stream().map(i -> i*i).collect(Collectors.toList());
			System.out.println(kk);
			
			
			 numbers.stream().sorted().forEach(y -> System.out.println(y));
			//System.out.println(sortedd);
			
			
			
			List names  = Arrays.asList("sachin" , "pooja" ,"colletion") ;
			
//			//List <String >ans  = (List<String>) names.stream().filter( s -> s.startsWith()).collect(Collectors.toList()) ;
//			
//			System.out.println(ans );
			
			
			 
			 
			 
			 
				
			
				
				
		
		
		
		
		
		
		
	}

}
