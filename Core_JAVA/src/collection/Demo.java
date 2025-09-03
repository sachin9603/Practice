package collection;
import java.util.*  ;

public class Demo {
	
	
	public static void main(String[] args) {
		
		// sachin 12 , virat 100  , 645 ,46654,, "indore 44546 " , 
		
		// framework ----- it is bunch of interface and method ---
		
		
		
		
	List<String> list  = new ArrayList<> ()  ;
	
	list.add(null) ;
	list.add(null) ;

	list.add("sachin") ;

	list.add("sachin") ;

	list.add("sachin") ;

	list.add("sachin") ;

	list.add("sachin") ;

	list.add("sachin") ;
	
	list.add("sachin") ;
	
	list.add("sachin") ;
	
	list.add("sachin") ;
	
	
	list.add("sachin") ;
	
	list.add("sachin") ;
	
	System.out.println();
	System.out.println(list.size());
	
	list.add(2, "pooja");
	System.out.println(list.indexOf("pooja") );

	;
	
	Object [] arr =  list.toArray() ;
	System.out.println(Arrays.toString(arr) );
	
	
	
	 
	for(String ss : list) {
		System.out.println(ss);
	}
			
	}

}
