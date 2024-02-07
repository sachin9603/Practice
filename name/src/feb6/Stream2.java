package feb6;

import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
	
	
	public static void main(String[] args) {
		
		List <Integer> l =  List.of(2,34,7,9,321,5,8,6) ;
		
		l.stream().sorted().forEach(y -> System.out.println(y));
		
		List nnnn  = l.stream().map(ttt -> ttt*ttt).sorted().filter( i -> i>100).collect(Collectors.toList());
	
	
	System.out.println(nnnn);
	
	List<String > ppp  = List.of("sachin" , "swati" , "Rahul" );
	
	
	List<String > pp  =ppp.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
	
	System.out.println(pp);
	
	
	// design pattern  
	// 4 log kaam ---- > same problem  --- 1 godd  , 2 better  , 3 no solution  , 4 best solution 
	 
	// design patterns are well proved solutions of commonly occurring problems in the software designing 
	
		
	 // creational Design pattern  
	
	//factory pattern  , Builder pattern  , Singleton pattern  etc   ;
	
	//Strucatural Design pattern 
	
	//proxy pattern  , Adaptor  pattern ect  
	
	
	//Behavioral design pattern  
	
	//iterator pattern  , observer pattern , state pattern  `
	
	
	
	
	
	
	
	
	// 
	
	
	
	
	
	
	
	
	}

}
