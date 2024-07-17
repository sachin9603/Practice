package jul12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MainMain {
	
	public static void main(String[] args) {
		
	   HashSet<String> ss = new HashSet<String> () ;
	   
	   // allow single null value  
	   // it doesnot allow any duplicat value 
	   // it does not maintain any insertion order 
	   
	   ss.add("shubham") ;
	   ss.add("shubham") ;
	   ss.add("shubham") ;
	   ss.add("swati") ;
	   ss.add("pooja") ;
	   ss.add(null) ;
	   ss.add(null) ;
	   ss.add(null) ;
	   
	   for(String hh:ss) {
		   System.out.println(hh);
	   }
	   
	   
	   
	   LinkedHashSet<String> kk  = new LinkedHashSet() ;
	   
	   kk.add("string") ;
	   kk.add("coco") ;
	   kk.add("coco") ;
	   kk.add("map") ;
	   kk.add("mobile") ;
	   
	   
	   for(String hh:kk) {
		   System.out.println(hh);
	   }
	   
	   
	   
	   
	   TreeSet<Integer>  ll  =  new TreeSet<Integer> ();
	   
	   ll.add(12 ) ;
	   ll.add(12 ) ;
	   ll.add(12) ;
	   ll.add(8712) ;
	   ll.add(1812) ;
	   ll.add(912) ;
	  
	   System.out.println(ll);
	   
	
	}

}
