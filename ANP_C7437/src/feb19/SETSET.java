package feb19;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class SETSET {
	
	public static void main(String[] args) {
		
	//	what is Set interface ----hashset  - linkedHashset -  treeset -
		
		Set<Integer> set  = new HashSet<>() ;
	  set.add(23) ;
	  set.add(52) ;
	  set.add(52) ;
	  set.add(87) ;
	  set.add(9) ;
	  set.add(67) ;
	  set.add(67) ;
	  set.add(null) ;
	  set.add(null) ;
	  // duplicat data will be removed and insersation order will not followed 
	  // only one null value is allowed 
	  
	  Object 
	  
	  for (Integer i  : set) {
		  System.out.println(i);
	  }
	  System.out.println(set);
	  
	  // suppose you want to follow insertion order also 
	  
	  LinkedHashSet<String>  lset  = new LinkedHashSet<>() ;
	 
	  lset.add("sachin") ;
	  lset.add("Sachin") ;
	  lset.add("surbhi") ;
	  lset.add("priya") ;
	  lset.add("bhavesh") ;
	  lset.add("bhavesh") ;
	  lset.add(null) ;
	  lset.add(null) ;
	  
	  System.out.println(lset);
	  // it maintains ascending 
	  TreeSet<String> tset = new TreeSet<>() ;
	  tset.add("sachin") ;
	  tset.add("surbhi") ;
	  tset.add("priya") ;
	  tset.add("bhavesh") ;
	  tset.add("bhavesh") ;
	  tset.add("anmol") ;
	//  tset.add(null) ;
	//  tset.add(null) ;
	  System.out.println("treeset--------------->");
	  
	  System.out.println(tset);
	  
	  System.out.println("-------------------------queue-------------");
	  //LIFO(Stack) 
	  
	  //FIFO(Queue)
	  PriorityQueue<String> queue  = new PriorityQueue<>() ;
	  queue.addAll(lset) ;
	  queue.add("Sachin") ;
	  queue.add("Sachin") ;
	  queue.add("shivam") ;
	  queue.add("bhim") ;
	  queue.add("arjun") ;
	  System.out.println();queue.contains("shivam") ;
	  
	  
	  System.out.println(queue.peek());
	  System.out.println(queue.element());
	  queue.remove();
	  queue.poll();

	  System.out.println(queue);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
 	  
	  
		
		
		
	}
	

}
