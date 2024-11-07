package nov6;

import java.util.ArrayList;
import java.util.*;

public class Basic {
	
	
	public static void main(String[] args) {
		// intarnally array 
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Sahiin") ;
		list.add("Radha") ;
		list.add("Niki") ;
		list.add("pop") ;
		
		
		
		
		String dd  = list.get(2) ;
		// for loop (all) 
		// enhanced for loop  or for each loop  
		
		// iterator 
		
//		Iterator iii  = list.iterator();
//		
//		//iii.hasNext() it will return true if there is value 
//		while(iii.hasNext()) {
//			
//			System.out.println(iii.next());
//		}
//		
//		
		

		ArrayList <String>  list2 = new ArrayList<>();
		
		list.add("Ravvvan") ;
		list.add("Radha") ;
		list.add("Niki") ;
		list.add("pop") ;
		list2.addAll(list) ;
		

		ArrayList   list22 = new ArrayList();
		list22.add(33232) ;
		list22.add(true) ;
		list22.add(false) ;
		list22.add("string") ;
		list22.add(new Demo()) ;
		
		System.out.println(list22);
		
		int [] arr  = new int [2] ;
		
		// intarnally LinkedList (node k form ) 
LinkedList <String>  list23 = new LinkedList<>();
		
list23.add("Ravvvan") ;
list23.add("Radha") ;
list23.add("Niki") ;
list23.add("pop") ;
list23.addAll(list) ;

System.out.println(list23);
		


// intarnally array ,, pehle se bana tha  ,, it thread safe  ,, matlab ki synchronized hai 

Vector <String>  list24 = new Vector<>();

list23.add("Ravvvan") ;
list23.add("Radha") ;
list23.add("Niki") ;
list23.add("pop") ;
list23.addAll(list) ;

System.out.println(list23);


		
		
		
		
		
		
		
	}

}
